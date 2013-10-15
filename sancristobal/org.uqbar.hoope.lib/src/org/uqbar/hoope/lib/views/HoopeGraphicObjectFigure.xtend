package org.uqbar.hoope.lib.views

import java.util.Observable
import java.util.Observer
import org.eclipse.core.internal.resources.Project
import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.ImageFigure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.PositionConstants
import org.eclipse.draw2d.geometry.Dimension
import org.eclipse.draw2d.geometry.Point
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.swt.graphics.Image
import org.eclipse.xtext.ui.PluginImageHelper
import org.eclipse.ui.internal.Workbench
import com.google.inject.Inject

class HoopeGraphicObjectFigure extends ImageFigure implements Observer {

	@Property double angle
	
	@Property Observable observedObject

	@Property SampleView view

	new(Image image, String identifier, Object object) {
		super(image, PositionConstants.NORTH_EAST)
		this.observedObject = object as Observable
		this.observedObject.addObserver(this);
		this.toolTip = new Label(identifier)
	}

	override protected paintFigure(Graphics graphics) {
		graphics.pushState
		val size = size
		graphics.translate(location.x + size.width/2, location.y + size.width/2)
		graphics.rotate(-Math.toDegrees(angle) as float) 
		graphics.translate(-location.x - size.width/2, -location.y - size.width/2)
		super.paintFigure(graphics)
		graphics.popState 
	}
  
	override getMinimumSize(int wHint, int hHint) {
		val bounds = image.bounds
		new Dimension(bounds.width, bounds.height)
	}

	def setObjectLocation(Point location) {
		val minSize = minimumSize
		parent.setConstraint(this, new Rectangle(
			location.x - minSize.width / 2, 
			location.y - minSize.height / 2,
			minSize.width,
			minSize.height
		))
	}

	def setAngle(double angle) {
		_angle = angle
		revalidate
	}

	
	override update(Observable o, Object arg) {
		System.out.println(o+": "+arg);

		val String imagen = observedObject.class.declaredMethods.filter[f| f.name == 'getImage'].head?.invoke(observedObject) as String
		val posicion = observedObject.class.declaredMethods.filter[f| f.name == 'getPosition'].head

		if (posicion != null){
			val java.awt.Point punto  = (posicion.invoke(observedObject)) as java.awt.Point
			this.objectLocation = new Point(punto.x, punto.y)
			this.image = view.getImage(imagen)
		}
	}
	
}