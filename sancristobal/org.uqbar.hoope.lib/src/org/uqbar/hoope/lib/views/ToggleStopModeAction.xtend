package org.uqbar.hoope.lib.views

import org.eclipse.jface.action.Action
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.xtext.ui.PluginImageHelper
import com.google.inject.Inject
import org.uqbar.hoope.lib.views.SampleView

class ToggleStopModeAction extends Action {

	@Inject SampleView view

	@Inject
	new(PluginImageHelper helper) {
		super("Toggle stop mode")
		setImageDescriptor(ImageDescriptor.createFromImage(helper.getImage('stopmode.gif')))
		checked = false
	}

	override run() {
		checked = view.hoopeGraphicObjectPartListener.toggleStopMode
	}

}