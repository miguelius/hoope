package org.uqbar.hoope.lib.views

import com.google.inject.Inject
import com.google.inject.Singleton
import org.apache.log4j.Logger
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.FigureCanvas
import org.eclipse.draw2d.FreeformLayeredPane
import org.eclipse.draw2d.FreeformViewport
import org.eclipse.draw2d.Polyline
import org.eclipse.draw2d.geometry.Point
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.text.source.Annotation
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IViewSite
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.util.DisplayRunHelper
import org.uqbar.hoope.lib.HoopeGraphicObject
import org.uqbar.hoope.lib.IHoopeInterpreter
import org.uqbar.hoope.lib.IHoopeObjectEvent
import org.uqbar.hoope.lib.MoveEvent
import org.uqbar.hoope.lib.TurnEvent

@Singleton
public class SampleView extends ViewPart implements IHoopeObjectEvent.Listener {
	
	static val LOGGER = Logger.getLogger(SampleView)
	 
	FigureCanvas canvas
	
	@Inject ToggleStopModeAction action
	@Inject RootLayer rootFigure
	@Inject HoopeGraphicObjectFigure hoopeGraphicObjectFigure 
	@Inject HoopeGraphicObjectPartListener listener
	@Inject Animator animator
	
	override createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED)
		canvas.viewport = new FreeformViewport
		canvas.background = ColorConstants.white
		val pane = new FreeformLayeredPane
		pane.font = parent.font
		canvas.contents = pane
		pane.add(rootFigure, 'primary')
		reset
		site.page.addPartListener(listener) 
		(site as IViewSite).actionBars.toolBarManager.add(action)
	}

	override setFocus() {
		canvas.setFocus
	}

	def getHoopeGraphicObjectFigure() {
		hoopeGraphicObjectFigure
	}
	
	def getHoopeGraphicObjectPartListener() {
		listener
	}

	def reset() {
		rootFigure.removeAll
		rootFigure.add(hoopeGraphicObjectFigure)
		hoopeGraphicObjectFigure.objectLocation = new Point(0,0)
		hoopeGraphicObjectFigure.angle = 0
		val viewportSize = canvas.size	
		canvas.scrollTo(-viewportSize.x / 2, -viewportSize.y/ 2)
	}
	
	def show(XtextEditor tortoiseEditor, int stopAtLine) {
		animator.setAnimated(stopAtLine < 0)
		DisplayRunHelper.runSyncInDisplayThread[|reset]
		tortoiseEditor.document.readOnly [
			if(it != null && !tortoiseEditor.hasError) {
				val hoopeObject = new HoopeGraphicObject
				hoopeObject.addListener(this)
				val interpreter = resourceServiceProvider.get(IHoopeInterpreter)
				if(interpreter != null && !contents.empty) {
					try {
						interpreter.run(hoopeObject, contents.get(0), stopAtLine)
					} catch (Exception e) {
						MessageDialog.openError(site.shell, "Error during Execution", '''
						Error during execution:
						  «e.message»
						See log for details''')
						LOGGER.error("Error executing TortoiseScript", e)
					}
				}
				hoopeObject.removeListener(this)
			}
		]
	}
	
	def hasError(XtextEditor tortoiseEditor) {
		val annotations = tortoiseEditor.documentProvider?.getAnnotationModel(tortoiseEditor.editorInput)?.annotationIterator
		while(annotations != null && annotations.hasNext) {
			val annotation = annotations.next
			if(annotation instanceof Annotation && 
				(annotation as Annotation).type == XtextEditor.ERROR_ANNOTATION_TYPE) 
				return true
		}
		false
	}
	
	override void handleObjectEvent(IHoopeObjectEvent event) {
		switch event {
			MoveEvent: { 
				if(event.hoopeObject.paint) {
					val line = new Polyline
					line.foregroundColor = event.hoopeObject.lineColor
					line.lineWidth = event.hoopeObject.lineWidth
					line.setEndpoints(event.oldPosition, event.oldPosition)
					animator.addAnimation(new Animation(event.oldPosition, event.hoopeObject.position, line, event.hoopeObject.delay)) 					
				} else {
					animator.addAnimation(new Animation(event.oldPosition, event.hoopeObject.position, event.hoopeObject.delay))
				}
			}
			TurnEvent: {
				animator.addAnimation(new Animation(event.oldAngle, event.hoopeObject.angleInRadians, event.hoopeObject.delay))
			} 
		}
	}	
}
