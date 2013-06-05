/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.uqbar.hoope.ui.views

import com.google.inject.Singleton
import org.apache.log4j.Logger
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.FigureCanvas
import org.eclipse.draw2d.FreeformLayeredPane
import org.eclipse.draw2d.FreeformViewport
import org.eclipse.jface.text.source.Annotation
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtext.ui.editor.XtextEditor

@Singleton
class HOOPEConsoleView extends ViewPart //implements ITortoiseEvent$Listener 
{
	
	static val LOGGER = Logger::getLogger(typeof(HOOPEView))
	 
	FigureCanvas canvas
	
	override createPartControl(Composite parent) {
		LOGGER.debug("Creo el canvas")
		canvas = new FigureCanvas(parent, SWT::DOUBLE_BUFFERED)
		canvas.viewport = new FreeformViewport
		canvas.background = ColorConstants::white
		val pane = new FreeformLayeredPane
		pane.font = parent.font
		canvas.contents = pane
	}

	override setFocus() {
		LOGGER.debug("Estoy en foco!")
		canvas.setFocus
	}
	
	
	def show(XtextEditor hooplEditor, int stopAtLine) {
		hooplEditor.document.readOnly [
			if(it != null && !hooplEditor.hasError) {
			}
		]
	}
	
	def hasError(XtextEditor hooplEditor) {
		val annotations = hooplEditor.documentProvider?.getAnnotationModel(hooplEditor.editorInput)?.annotationIterator
		while(annotations != null && annotations.hasNext) {
			val annotation = annotations.next
			if(annotation instanceof Annotation && 
				(annotation as Annotation).type == XtextEditor::ERROR_ANNOTATION_TYPE) 
				return true
		}
		false
	}
	
}
