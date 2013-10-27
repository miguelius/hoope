package org.uqbar.hoope.lib

import java.util.List
import java.util.Observable
import java.util.Observer
import org.eclipse.draw2d.ColorConstants
import org.eclipse.draw2d.geometry.Point
import org.eclipse.swt.graphics.Color
import org.uqbar.hoope.lib.views.HoopeGraphicObjectFigure

import static java.lang.Math.*

class HoopeObject implements Observer {
	double angle
	double x
	double y
	@Property HoopeGraphicObjectFigure figure
	String image
	@Property int delay = 1000

	boolean isPaint = true
	@Property int lineWidth = 1
	@Property Color lineColor = ColorConstants.black

	def setImage(String imagen) {
		this.image = imagen
		figure.image = figure.view.getImage(imagen)
	}
	
	List<IHoopeObjectEvent.Listener> listeners = newArrayList
	new(HoopeGraphicObjectFigure figure, Object realObject ) {
		(realObject as Observable).addObserver(this)
		
		val posicion = realObject.class.declaredMethods.filter[f| f.name == 'getPosition'].head

		if (posicion != null){
			val java.awt.Point punto  = (posicion.invoke(realObject)) as java.awt.Point
			x = punto.x
			y = punto.y
			this.figure = figure				
			figure.objectLocation = new Point(punto.x, punto.y)
		}

	}

	def addListener(IHoopeObjectEvent.Listener listener) {
		listeners += listener
	}

	def removeListener(IHoopeObjectEvent.Listener listener) {
		listeners.remove(listener)
	}

	def penUp() {
		isPaint = false
	}

	def penDown() {
		isPaint = true
	}

	def isPaint() {
		isPaint
	}

	def goTo(double x, double y) {
		this.x = x
		this.y = y
	}

	def getPosition() {
		new Point(x as int, y as int)
	}

	def forward(double amount) {
		val Point oldPosition = position
		x = x - amount * sin(angle)
		y = y - amount * cos(angle)
		fireMoveEvent(oldPosition)
	}

	def back(double amount) {
		val Point oldPosition = position
		x = x + amount * sin(angle)
		y = y + amount * cos(angle)
		fireMoveEvent(oldPosition)
	}

	def turnLeft(double amount) {
		val oldAngle = angle 
		angle = angle + toRadians(amount)	
		fireTurnEvent(oldAngle)
	}

	def turnRight(double amount) {
		val oldAngle = angle 
		angle = angle - toRadians(amount)	
		fireTurnEvent(oldAngle)
	}

	def turnTo(double angle) {
		val oldAngle = this.angle 
		this.angle = toRadians(angle)	
		fireTurnEvent(oldAngle)
	}

	def getAngle() {
		toDegrees(angle)
	}

	def getAngleInRadians() {
		angle
	}

	def protected fireMoveEvent(Point oldPosition) {
		notifyListeners(new MoveEvent(
			this,
			oldPosition
		))
	}

	def protected fireTurnEvent(double oldAngle) {
		notifyListeners(new TurnEvent(this, oldAngle))
	}

	def protected notifyListeners(IHoopeObjectEvent event) {
		for(listener: listeners) 
			listener.handleObjectEvent(event)
	}
	
	override update(Observable observedObject, Object arg) {
		System.out.println(observedObject + ": " + arg);

		val String imagen = observedObject.class.declaredMethods.filter[f|f.name == 'getImage'].head?.invoke(
			observedObject) as String
		val posicion = observedObject.class.declaredMethods.filter[f|f.name == 'getPosition'].head

		if (imagen != null && !imagen.equals(image)) {
			//setImage (imagen)
			notifyListeners(new ChangeLookEvent(this, imagen ))
		}

		if (posicion != null) {
			val java.awt.Point punto = (posicion.invoke(observedObject)) as java.awt.Point
			val p = new Point(punto.x, punto.y)
			if ( ! p.equals(this.position) ) {
				val oldPosition = this.position
				this.x = punto.x
				this.y = punto.y
				notifyListeners(new MoveEvent(this, oldPosition))
			}
		}
	}

	
}

@Data class ChangeLookEvent implements IHoopeObjectEvent {
	HoopeObject hoopeObject	
	String image
}

@Data class MoveEvent implements IHoopeObjectEvent {
	HoopeObject hoopeObject
	Point oldPosition
}

@Data class TurnEvent implements IHoopeObjectEvent {
	HoopeObject hoopeObject
	double oldAngle	
}
