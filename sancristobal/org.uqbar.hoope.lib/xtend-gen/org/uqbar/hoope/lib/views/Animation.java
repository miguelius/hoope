package org.uqbar.hoope.lib.views;

import com.google.common.base.Objects;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;
import org.uqbar.hoope.lib.HoopeObject;
import org.uqbar.hoope.lib.views.HoopeGraphicObjectFigure;
import org.uqbar.hoope.lib.views.SampleView;

@SuppressWarnings("all")
public class Animation {
  private HoopeObject hoopeObject;
  
  private String image;
  
  private Point startPosition;
  
  private Point delta;
  
  private double startAngle;
  
  private double deltaAngle;
  
  private int delay;
  
  public Animation(final HoopeObject hoopeObject, final String imagen, final int delay) {
    this.hoopeObject = hoopeObject;
    this.image = imagen;
  }
  
  public Animation(final HoopeObject hoopeObject, final Point startPosition, final Point endPosition, final int delay) {
    this.hoopeObject = hoopeObject;
    this.deltaAngle = 0.0;
    Point _copy = startPosition.getCopy();
    this.startPosition = _copy;
    int _minus = (endPosition.x - startPosition.x);
    int _minus_1 = (endPosition.y - startPosition.y);
    Point _point = new Point(_minus, _minus_1);
    this.delta = _point;
    this.delay = delay;
  }
  
  public Animation(final double startAngle, final double endAngle, final int delay) {
    this.startAngle = startAngle;
    double _minus = (endAngle - startAngle);
    this.deltaAngle = _minus;
    this.delay = delay;
  }
  
  public int getDelay() {
    return this.delay;
  }
  
  public void set(final double alpha) {
    boolean _notEquals = (!Objects.equal(this.startPosition, null));
    if (_notEquals) {
      Point _point = new Point(this.delta);
      Point _scale = _point.scale(alpha);
      final Point currentLocation = _scale.translate(this.startPosition);
      HoopeGraphicObjectFigure _figure = this.hoopeObject.getFigure();
      _figure.setObjectLocation(currentLocation);
    }
    boolean _notEquals_1 = (!Objects.equal(this.image, null));
    if (_notEquals_1) {
      HoopeGraphicObjectFigure _figure_1 = this.hoopeObject.getFigure();
      HoopeGraphicObjectFigure _figure_2 = this.hoopeObject.getFigure();
      SampleView _view = _figure_2.getView();
      Image _image = _view.getImage(this.image);
      _figure_1.setImage(_image);
    }
  }
}
