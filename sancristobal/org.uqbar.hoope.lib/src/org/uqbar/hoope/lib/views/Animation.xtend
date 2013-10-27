package org.uqbar.hoope.lib.views

import org.eclipse.draw2d.geometry.Point
import org.uqbar.hoope.lib.HoopeObject

class Animation {

	HoopeObject hoopeObject
	String image
	Point startPosition
	Point delta
	double startAngle
	double deltaAngle
	int delay

//	new(Point startPosition, Point endPosition, Polyline line, int delay) {
//		this(startPosition, endPosition, delay)
//		this.line = line
//	}

	new(HoopeObject hoopeObject, String imagen, int delay) {
		this.hoopeObject = hoopeObject
		this.image = imagen
	}
		
	new(HoopeObject hoopeObject, Point startPosition, Point endPosition, int delay) {
		this.hoopeObject = hoopeObject
		deltaAngle = 0.0
		this.startPosition = startPosition.copy
		this.delta = new Point(endPosition.x - startPosition.x, endPosition.y - startPosition.y)
		this.delay = delay
	}

	new(double startAngle, double endAngle, int delay) {
		this.startAngle = startAngle
		this.deltaAngle = endAngle - startAngle
		this.delay = delay
	}

	def getDelay() {
		delay
	}

	def set(double alpha) {
		if (startPosition != null) {
			val currentLocation = new Point(delta).scale(alpha).translate(startPosition)
			hoopeObject.figure.objectLocation = currentLocation
		}
		if (image != null) {
			hoopeObject.figure.image = hoopeObject.figure.view.getImage(this.image)
		}
	}
}