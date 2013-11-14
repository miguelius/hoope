package org.uqbar.hoope.lib;

import com.google.common.base.Objects;
import java.awt.Point;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.uqbar.hoope.lib.ChangeLookEvent;
import org.uqbar.hoope.lib.IHoopeObjectEvent;
import org.uqbar.hoope.lib.IHoopeObjectEvent.Listener;
import org.uqbar.hoope.lib.MoveEvent;
import org.uqbar.hoope.lib.TurnEvent;
import org.uqbar.hoope.lib.views.HoopeGraphicObjectFigure;
import org.uqbar.hoope.lib.views.HoopeRuntimeView;

@SuppressWarnings("all")
public class HoopeObject implements Observer {
  private double angle;
  
  private double x;
  
  private double y;
  
  private HoopeGraphicObjectFigure _figure;
  
  public HoopeGraphicObjectFigure getFigure() {
    return this._figure;
  }
  
  public void setFigure(final HoopeGraphicObjectFigure figure) {
    this._figure = figure;
  }
  
  private String image;
  
  private int _delay = 1000;
  
  public int getDelay() {
    return this._delay;
  }
  
  public void setDelay(final int delay) {
    this._delay = delay;
  }
  
  private boolean isPaint = true;
  
  private int _lineWidth = 1;
  
  public int getLineWidth() {
    return this._lineWidth;
  }
  
  public void setLineWidth(final int lineWidth) {
    this._lineWidth = lineWidth;
  }
  
  private Color _lineColor = ColorConstants.black;
  
  public Color getLineColor() {
    return this._lineColor;
  }
  
  public void setLineColor(final Color lineColor) {
    this._lineColor = lineColor;
  }
  
  public void setImage(final String imagen) {
    this.image = imagen;
    HoopeGraphicObjectFigure _figure = this.getFigure();
    HoopeGraphicObjectFigure _figure_1 = this.getFigure();
    HoopeRuntimeView _view = _figure_1.getView();
    Image _image = _view.getImage(imagen);
    _figure.setImage(_image);
  }
  
  private List<Listener> listeners = new Function0<List<Listener>>() {
    public List<Listener> apply() {
      ArrayList<Listener> _newArrayList = CollectionLiterals.<Listener>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public HoopeObject(final HoopeGraphicObjectFigure figure, final Object realObject) {
    try {
      ((Observable) realObject).addObserver(this);
      Class<? extends Object> _class = realObject.getClass();
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
        Object _invoke = posicion.invoke(realObject);
        final Point punto = ((Point) _invoke);
        this.x = punto.x;
        this.y = punto.y;
        this.setFigure(figure);
        org.eclipse.draw2d.geometry.Point _point = new org.eclipse.draw2d.geometry.Point(punto.x, punto.y);
        figure.setObjectLocation(_point);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean addListener(final Listener listener) {
    boolean _add = this.listeners.add(listener);
    return _add;
  }
  
  public boolean removeListener(final Listener listener) {
    boolean _remove = this.listeners.remove(listener);
    return _remove;
  }
  
  public boolean penUp() {
    boolean _isPaint = this.isPaint = false;
    return _isPaint;
  }
  
  public boolean penDown() {
    boolean _isPaint = this.isPaint = true;
    return _isPaint;
  }
  
  public boolean isPaint() {
    return this.isPaint;
  }
  
  public double goTo(final double x, final double y) {
    double _xblockexpression = (double) 0;
    {
      this.x = x;
      double _y = this.y = y;
      _xblockexpression = (_y);
    }
    return _xblockexpression;
  }
  
  public org.eclipse.draw2d.geometry.Point getPosition() {
    org.eclipse.draw2d.geometry.Point _point = new org.eclipse.draw2d.geometry.Point(((int) this.x), ((int) this.y));
    return _point;
  }
  
  public void forward(final double amount) {
    final org.eclipse.draw2d.geometry.Point oldPosition = this.getPosition();
    double _sin = Math.sin(this.angle);
    double _multiply = (amount * _sin);
    double _minus = (this.x - _multiply);
    this.x = _minus;
    double _cos = Math.cos(this.angle);
    double _multiply_1 = (amount * _cos);
    double _minus_1 = (this.y - _multiply_1);
    this.y = _minus_1;
    this.fireMoveEvent(oldPosition);
  }
  
  public void back(final double amount) {
    final org.eclipse.draw2d.geometry.Point oldPosition = this.getPosition();
    double _sin = Math.sin(this.angle);
    double _multiply = (amount * _sin);
    double _plus = (this.x + _multiply);
    this.x = _plus;
    double _cos = Math.cos(this.angle);
    double _multiply_1 = (amount * _cos);
    double _plus_1 = (this.y + _multiply_1);
    this.y = _plus_1;
    this.fireMoveEvent(oldPosition);
  }
  
  public void turnLeft(final double amount) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(amount);
    double _plus = (this.angle + _radians);
    this.angle = _plus;
    this.fireTurnEvent(oldAngle);
  }
  
  public void turnRight(final double amount) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(amount);
    double _minus = (this.angle - _radians);
    this.angle = _minus;
    this.fireTurnEvent(oldAngle);
  }
  
  public void turnTo(final double angle) {
    final double oldAngle = this.angle;
    double _radians = Math.toRadians(angle);
    this.angle = _radians;
    this.fireTurnEvent(oldAngle);
  }
  
  public double getAngle() {
    double _degrees = Math.toDegrees(this.angle);
    return _degrees;
  }
  
  public double getAngleInRadians() {
    return this.angle;
  }
  
  protected void fireMoveEvent(final org.eclipse.draw2d.geometry.Point oldPosition) {
    MoveEvent _moveEvent = new MoveEvent(this, oldPosition);
    this.notifyListeners(_moveEvent);
  }
  
  protected void fireTurnEvent(final double oldAngle) {
    TurnEvent _turnEvent = new TurnEvent(this, oldAngle);
    this.notifyListeners(_turnEvent);
  }
  
  protected void notifyListeners(final IHoopeObjectEvent event) {
    for (final Listener listener : this.listeners) {
      listener.handleObjectEvent(event);
    }
  }
  
  public void update(final Observable observedObject, final Object arg) {
    try {
      String _plus = (observedObject + ": ");
      String _plus_1 = (_plus + arg);
      System.out.println(_plus_1);
      Class<? extends Observable> _class = observedObject.getClass();
      Method[] _declaredMethods = _class.getDeclaredMethods();
      final Function1<Method,Boolean> _function = new Function1<Method,Boolean>() {
        public Boolean apply(final Method f) {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "getImage");
          return Boolean.valueOf(_equals);
        }
      };
      Iterable<Method> _filter = IterableExtensions.<Method>filter(((Iterable<Method>)Conversions.doWrapArray(_declaredMethods)), _function);
      Method _head = IterableExtensions.<Method>head(_filter);
      Object _invoke = null;
      if (_head!=null) {
        _invoke=_head.invoke(observedObject);
      }
      final String imagen = ((String) _invoke);
      Class<? extends Observable> _class_1 = observedObject.getClass();
      Method[] _declaredMethods_1 = _class_1.getDeclaredMethods();
      final Function1<Method,Boolean> _function_1 = new Function1<Method,Boolean>() {
        public Boolean apply(final Method f) {
          String _name = f.getName();
          boolean _equals = Objects.equal(_name, "getPosition");
          return Boolean.valueOf(_equals);
        }
      };
      Iterable<Method> _filter_1 = IterableExtensions.<Method>filter(((Iterable<Method>)Conversions.doWrapArray(_declaredMethods_1)), _function_1);
      final Method posicion = IterableExtensions.<Method>head(_filter_1);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(imagen, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _equals = imagen.equals(this.image);
        boolean _not = (!_equals);
        _and = (_notEquals && _not);
      }
      if (_and) {
        ChangeLookEvent _changeLookEvent = new ChangeLookEvent(this, imagen);
        this.notifyListeners(_changeLookEvent);
      }
      boolean _notEquals_1 = (!Objects.equal(posicion, null));
      if (_notEquals_1) {
        Object _invoke_1 = posicion.invoke(observedObject);
        final Point punto = ((Point) _invoke_1);
        org.eclipse.draw2d.geometry.Point _point = new org.eclipse.draw2d.geometry.Point(punto.x, punto.y);
        final org.eclipse.draw2d.geometry.Point p = _point;
        org.eclipse.draw2d.geometry.Point _position = this.getPosition();
        boolean _equals_1 = p.equals(_position);
        boolean _not_1 = (!_equals_1);
        if (_not_1) {
          final org.eclipse.draw2d.geometry.Point oldPosition = this.getPosition();
          this.x = punto.x;
          this.y = punto.y;
          MoveEvent _moveEvent = new MoveEvent(this, oldPosition);
          this.notifyListeners(_moveEvent);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
