package org.uqbar.hoope.lib;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.uqbar.hoope.lib.HoopeObject;
import org.uqbar.hoope.lib.IHoopeObjectEvent;

@Data
@SuppressWarnings("all")
public class ChangeLookEvent implements IHoopeObjectEvent {
  private final HoopeObject _hoopeObject;
  
  public HoopeObject getHoopeObject() {
    return this._hoopeObject;
  }
  
  private final String _image;
  
  public String getImage() {
    return this._image;
  }
  
  public ChangeLookEvent(final HoopeObject hoopeObject, final String image) {
    super();
    this._hoopeObject = hoopeObject;
    this._image = image;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_hoopeObject== null) ? 0 : _hoopeObject.hashCode());
    result = prime * result + ((_image== null) ? 0 : _image.hashCode());
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
    ChangeLookEvent other = (ChangeLookEvent) obj;
    if (_hoopeObject == null) {
      if (other._hoopeObject != null)
        return false;
    } else if (!_hoopeObject.equals(other._hoopeObject))
      return false;
    if (_image == null) {
      if (other._image != null)
        return false;
    } else if (!_image.equals(other._image))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
