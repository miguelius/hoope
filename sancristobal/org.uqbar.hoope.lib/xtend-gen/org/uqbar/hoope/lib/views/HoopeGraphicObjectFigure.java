package org.uqbar.hoope.lib.views;

import com.google.common.base.Objects;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class HoopeGraphicObjectFigure extends ImageFigure implements Observer {
  private double _angle;
  
  public double getAngle() {
    return this._angle;
  }
  
  private Observable _observedObject;
  
  public Observable getObservedObject() {
    return this._observedObject;
  }
  
  public void setObservedObject(final Observable observedObject) {
    this._observedObject = observedObject;
  }
  
  public HoopeGraphicObjectFigure(final Image image, final String identifier, final Object object) {
    super(image, PositionConstants.NORTH_EAST);
    this.setObservedObject(((Observable) object));
    Observable _observedObject = this.getObservedObject();
    _observedObject.addObserver(this);
    Label _label = new Label(identifier);
    this.toolTip = _label;
  }
  
  protected void paintFigure(final Graphics graphics) {
    graphics.pushState();
    final Dimension size = this.getSize();
    Point _location = this.getLocation();
    int _divide = (size.width / 2);
    int _plus = (_location.x + _divide);
    Point _location_1 = this.getLocation();
    int _divide_1 = (size.width / 2);
    int _plus_1 = (_location_1.y + _divide_1);
    graphics.translate(_plus, _plus_1);
    double _angle = this.getAngle();
    double _degrees = Math.toDegrees(_angle);
    float _minus = (-((float) _degrees));
    graphics.rotate(_minus);
    Point _location_2 = this.getLocation();
    int _minus_1 = (-_location_2.x);
    int _divide_2 = (size.width / 2);
    int _minus_2 = (_minus_1 - _divide_2);
    Point _location_3 = this.getLocation();
    int _minus_3 = (-_location_3.y);
    int _divide_3 = (size.width / 2);
    int _minus_4 = (_minus_3 - _divide_3);
    graphics.translate(_minus_2, _minus_4);
    super.paintFigure(graphics);
    graphics.popState();
  }
  
  public Dimension getMinimumSize(final int wHint, final int hHint) {
    Dimension _xblockexpression = null;
    {
      Image _image = this.getImage();
      final Rectangle bounds = _image.getBounds();
      Dimension _dimension = new Dimension(bounds.width, bounds.height);
      _xblockexpression = (_dimension);
    }
    return _xblockexpression;
  }
  
  public void setObjectLocation(final Point location) {
    final Dimension minSize = this.getMinimumSize();
    IFigure _parent = this.getParent();
    int _divide = (minSize.width / 2);
    int _minus = (location.x - _divide);
    int _divide_1 = (minSize.height / 2);
    int _minus_1 = (location.y - _divide_1);
    org.eclipse.draw2d.geometry.Rectangle _rectangle = new org.eclipse.draw2d.geometry.Rectangle(_minus, _minus_1, 
      minSize.width, 
      minSize.height);
    _parent.setConstraint(this, _rectangle);
  }
  
  public void setAngle(final double angle) {
    this._angle = angle;
    this.revalidate();
  }
  
  public void update(final Observable o, final Object arg) {
    try {
      String _plus = (o + ": ");
      String _plus_1 = (_plus + arg);
      System.out.println(_plus_1);
      Observable _observedObject = this.getObservedObject();
      Class<? extends Observable> _class = _observedObject.getClass();
      Method[] _declaredMethods = _class.getDeclaredMethods();
      final Function1<Method,Boolean> _function = new Function1<Method,Boolean>() {
          public Boolean apply(final Method f) {
            String _name = f.getName();
            boolean _equals = Objects.equal(_name, "getPosition");
            return Boolean.valueOf(_equals);
          }
        };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(((Iterable<Method>)Conversions.doWrapArray(_declaredMethods)), _function);
      final Method posicion = IterableExtensions.<Method>head(_filter);
      boolean _notEquals = (!Objects.equal(posicion, null));
      if (_notEquals) {
        Observable _observedObject_1 = this.getObservedObject();
        Object _invoke = posicion.invoke(_observedObject_1);
        final java.awt.Point punto = ((java.awt.Point) _invoke);
        Point _point = new Point(punto.x, punto.y);
        this.setObjectLocation(_point);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
