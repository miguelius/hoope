package org.uqbar.hoope.lib

import static java.lang.Math.*
import org.eclipse.swt.graphics.Color
import org.eclipse.draw2d.geometry.Point
import org.eclipse.draw2d.ColorConstants
import java.util.List

class HoopeGraphicObject {
	double angle
	double x
	double y
	
	@Property int delay = 200

	boolean isPaint = true
	@Property int lineWidth = 1
	@Property Color lineColor = ColorConstants.black

	List<IHoopeObjectEvent.Listener> listeners = newArrayList

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
}

@Data class MoveEvent implements IHoopeObjectEvent {
	HoopeGraphicObject hoopeObject
	Point oldPosition
}

@Data class TurnEvent implements IHoopeObjectEvent {
	HoopeGraphicObject hoopeObject
	double oldAngle	
}
