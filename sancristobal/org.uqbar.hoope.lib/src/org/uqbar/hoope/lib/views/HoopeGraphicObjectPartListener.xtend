package org.uqbar.hoope.lib.views

import com.google.inject.Inject
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.swt.custom.CaretEvent
import org.eclipse.swt.custom.CaretListener
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IFileEditorInput
import org.eclipse.ui.IPartListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.xtext.ui.editor.XtextEditor

class HoopeGraphicObjectPartListener implements IPartListener, IResourceChangeListener, CaretListener {
	
	XtextEditor currentEditor
	
	@Inject HoopeRuntimeView view
	
	boolean isStopMode
	
	def isHoopeEditor(IWorkbenchPart part) {
		part instanceof XtextEditor && part.site.id == 'org.uqbar.Hoope'
	}

	override partActivated(IWorkbenchPart part) {
		if (part.hoopeEditor) {
			currentEditor?.editorFile?.workspace?.removeResourceChangeListener(this)
			currentEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
			currentEditor = part as XtextEditor
//			if (isStopMode)
//				currentEditor?.internalSourceViewer?.textWidget?.addCaretListener(this)
//			else
//				view.show(currentEditor, -10)
			currentEditor?.editorFile?.workspace?.addResourceChangeListener(this)
		}
	}
	
	override partBroughtToTop(IWorkbenchPart part) {
	}
	
	override partClosed(IWorkbenchPart part) {
	}
	
	override partDeactivated(IWorkbenchPart part) {
		if (part == currentEditor) {
			currentEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
			currentEditor?.editorFile?.workspace?.removeResourceChangeListener(this)
			currentEditor = null
		}
	}
	
	override partOpened(IWorkbenchPart part) {
	}

	override resourceChanged(IResourceChangeEvent event) {
		val editorFile = currentEditor?.editorFile
		if (editorFile != null) {
			val editorFilePath = editorFile.fullPath 
			event.delta.accept [
				if (resource == editorFile && kind==IResourceDelta.CHANGED && flags==IResourceDelta.CONTENT) {
					//view.show(currentEditor, -10)
					false			
				} else {
				    resource.fullPath.isPrefixOf(editorFilePath)
				}
			]
		}
	}	
	
	def protected getEditorFile(IEditorPart editor) {
		if (editor?.editorInput instanceof IFileEditorInput)
			((editor.editorInput) as IFileEditorInput).file
		else 
			null
	}


	def boolean toggleStopMode() {
		currentEditor?.internalSourceViewer?.textWidget?.removeCaretListener(this)
		isStopMode = !isStopMode 
		if (isStopMode) 
			currentEditor?.internalSourceViewer?.textWidget?.addCaretListener(this)
		isStopMode
	}
	
	override caretMoved(CaretEvent event) {
		val stopAtLine = currentEditor.document.getLineOfOffset(event.caretOffset)
		//view.show(currentEditor, stopAtLine)
	}

}