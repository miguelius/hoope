package org.uqbar.hoope.lib.views

import com.google.inject.Inject
import com.google.inject.Singleton
import org.apache.log4j.Logger
import org.eclipse.core.resources.IProject
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.FigureCanvas
import org.eclipse.draw2d.FreeformLayeredPane
import org.eclipse.draw2d.FreeformViewport
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.jface.text.source.Annotation
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.ui.PluginImageHelper
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.util.DisplayRunHelper
import org.uqbar.hoope.lib.ChangeLookEvent
import org.uqbar.hoope.lib.HoopeObject
import org.uqbar.hoope.lib.IHoopeInterpreter
import org.uqbar.hoope.lib.IHoopeObjectEvent
import org.uqbar.hoope.lib.IHoopePlayground
import org.uqbar.hoope.lib.MoveEvent
import org.eclipse.ui.IViewSite
import org.eclipse.swt.graphics.Point
import javax.swing.BorderFactory
import org.eclipse.draw2d.SimpleRaisedBorder
import org.eclipse.draw2d.geometry.Dimension

@Singleton
public class HoopeRuntimeView extends ViewPart implements IHoopePlayground, IHoopeObjectEvent.Listener {
	
	static val LOGGER = Logger::getLogger(HoopeRuntimeView)
	 
	FigureCanvas canvas
	
	@Inject RootLayer rootFigure
	//@Inject HoopeGraphicObjectFigure hoopeGraphicObjectFigure 
	@Inject HoopeGraphicObjectPartListener listener
	@Inject Animator animator
	
	var IProject project
	
	override createPartControl(Composite parent) {
		canvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED )
		
		canvas.viewport = new FreeformViewport()
//		canvas.viewport.horizontalRangeModel.minimum = 0
//		canvas.viewport.verticalRangeModel.minimum = 0
		canvas.background = ColorConstants.orange
		val pane = new FreeformLayeredPane
		pane.font = parent.font
		canvas.contents = pane
		pane.add(rootFigure, 'primary')
		reset
		site.page.addPartListener(listener) 
//		(site as IViewSite).actionBars.toolBarManager.add(action)
	}

	override setFocus() {
		canvas.setFocus
	}

	def getHoopeGraphicObjectPartListener() {
		listener
	}

	def reset() {
		rootFigure.removeAll
//		rootFigure.add(hoopeGraphicObjectFigure)
//		hoopeGraphicObjectFigure.objectLocation = new Point(0,0)
//		hoopeGraphicObjectFigure.angle = 0
		//val viewportSize = canvas.size	
		//canvas.scrollTo(-viewportSize.x / 2, -viewportSize.y/ 2)
	}
	
	@Inject IHoopeInterpreter interpreter
		
	def show(XtextEditor hooplEditor, int stopAtLine) {
		animator.setAnimated(stopAtLine < 0)
		DisplayRunHelper.runSyncInDisplayThread[|reset]

		hooplEditor.document.readOnly [
			if(it != null && !hooplEditor.hasError) {
//				val interpreter = resourceServiceProvider.get(IHoopeInterpreter)
				if(interpreter != null && !contents.empty) {
					try {
						System.out.println(contents)
						this.project = interpreter.project = hooplEditor.resource.project
						interpreter.run( contents.get(0), this )
					} catch (Exception e) {
						MessageDialog.openError(site.shell, "Error during Execution", '''
						Error during execution:
						  «e.message»
						See log for details''')
						LOGGER.error("Error executing Hoopl Interpreter", e)
					}
				}
				this
			}
		]
	}
	
	def hasError(XtextEditor hooplEditor) {
		val annotations = hooplEditor.documentProvider?.getAnnotationModel(hooplEditor.editorInput)?.annotationIterator
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
				animator.addAnimation(new Animation(event.hoopeObject, event.oldPosition, event.hoopeObject.position, event.hoopeObject.delay))
			}
			ChangeLookEvent: {
				animator.addAnimation(new Animation(event.hoopeObject, event.image, event.hoopeObject.delay))
			} 
		}
	}
	
	@Inject PluginImageHelper pluginImageHelper
	
	val String DEFAULT_IMAGE = "pepita_80.png"

/**			
 http://www.infaserver.com.ar/?gclid=CNWv3rf6kboCFdSd4AodySQAXw
*/
	
	/**
	 * esto es super provisorio. se arregla con una interfaz
	 * 
	 * se puede parametrizar con las imágenes del plugin
	 */
	override registerGraphicObject(String identifier, Object realObject) {
		val String imagen = realObject.class.declaredMethods.filter[f| f.name == 'getImage'].head?.invoke(realObject) as String
		val figure = new HoopeGraphicObjectFigure(getImage(imagen), identifier)
		rootFigure.add(figure)
		figure.view = this
		
		new HoopeObject(figure, realObject).addListener(this)

		return;
	}

	def Image getImage(String imagen) {
		val imagenResource = project.findMember("resources/"+imagen)
		
		if (imagenResource != null) {
			// una provista por el usuario en el directorio resources de su Lesson
			ImageDescriptor.createFromURL( imagenResource.rawLocationURI.toURL ).createImage
		} else {
			// la que viene embebida en el plugin
			pluginImageHelper.getImage( DEFAULT_IMAGE )
		}
	}
	
}
