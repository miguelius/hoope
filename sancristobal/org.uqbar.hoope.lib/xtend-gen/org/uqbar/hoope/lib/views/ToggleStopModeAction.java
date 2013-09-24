package org.uqbar.hoope.lib.views;

import com.google.inject.Inject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.uqbar.hoope.lib.views.HoopeGraphicObjectPartListener;
import org.uqbar.hoope.lib.views.SampleView;

@SuppressWarnings("all")
public class ToggleStopModeAction extends Action {
  @Inject
  private SampleView view;
  
  @Inject
  public ToggleStopModeAction(final PluginImageHelper helper) {
    super("Toggle stop mode");
    Image _image = helper.getImage("stopmode.gif");
    ImageDescriptor _createFromImage = ImageDescriptor.createFromImage(_image);
    this.setImageDescriptor(_createFromImage);
    this.setChecked(false);
  }
  
  public void run() {
    HoopeGraphicObjectPartListener _hoopeGraphicObjectPartListener = this.view.getHoopeGraphicObjectPartListener();
    boolean _ggleStopMode = _hoopeGraphicObjectPartListener.toggleStopMode();
    this.setChecked(_ggleStopMode);
  }
}
