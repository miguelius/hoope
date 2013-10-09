package org.uqbar.hoope.lib;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.uqbar.hoope.lib.HoopeObject;
import org.uqbar.hoope.lib.IHoopeObjectEvent;

@Data
@SuppressWarnings("all")
public class MoveEvent implements IHoopeObjectEvent {
  private final HoopeObject _hoopeObject;
  
  public HoopeObject getHoopeObject() {
    return this._hoopeObject;
  }
  
  private final Point _oldPosition;
  
  public Point getOldPosition() {
    return this._oldPosition;
  }
  
  public MoveEvent(final HoopeObject hoopeObject, final Point oldPosition) {
    super();
    this._hoopeObject = hoopeObject;
    this._oldPosition = oldPosition;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_hoopeObject== null) ? 0 : _hoopeObject.hashCode());
    result = prime * result + ((_oldPosition== null) ? 0 : _oldPosition.hashCode());
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
    MoveEvent other = (MoveEvent) obj;
    if (_hoopeObject == null) {
      if (other._hoopeObject != null)
        return false;
    } else if (!_hoopeObject.equals(other._hoopeObject))
      return false;
    if (_oldPosition == null) {
      if (other._oldPosition != null)
        return false;
    } else if (!_oldPosition.equals(other._oldPosition))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
