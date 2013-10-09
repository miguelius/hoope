package org.uqbar.hoope.lib;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.uqbar.hoope.lib.views.SampleView;

public class HoopeExecutionHandler extends AbstractHandler {

	private static final String viewId = "org.uqbar.hoope.lib.SampleView";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		try {
			IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
			if (XtextEditor.class.isInstance(activeEditor)){
				XtextEditor hoopeEditor = (XtextEditor) activeEditor;
				SampleView showView = (SampleView) HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().showView(viewId);
				showView.show(hoopeEditor, -10);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}


		return null;
	}

}
