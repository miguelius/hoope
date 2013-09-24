package org.uqbar.hoope.lib;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.uqbar.hoope.lib.HoopeGraphicObject;
import org.uqbar.hoope.lib.IHoopeObjectEvent;

@Data
@SuppressWarnings("all")
public class TurnEvent implements IHoopeObjectEvent {
  private final HoopeGraphicObject _hoopeObject;
  
  public HoopeGraphicObject getHoopeObject() {
    return this._hoopeObject;
  }
  
  private final double _oldAngle;
  
  public double getOldAngle() {
    return this._oldAngle;
  }
  
  public TurnEvent(final HoopeGraphicObject hoopeObject, final double oldAngle) {
    super();
    this._hoopeObject = hoopeObject;
    this._oldAngle = oldAngle;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_hoopeObject== null) ? 0 : _hoopeObject.hashCode());
    result = prime * result + (int) (Double.doubleToLongBits(_oldAngle) ^ (Double.doubleToLongBits(_oldAngle) >>> 32));
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TurnEvent other = (TurnEvent) obj;
    if (_hoopeObject == null) {
      if (other._hoopeObject != null)
        return false;
    } else if (!_hoopeObject.equals(other._hoopeObject))
      return false;
    if (Double.doubleToLongBits(other._oldAngle) != Double.doubleToLongBits(_oldAngle))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
