package org.uqbar.hoope.lib.views

import org.eclipse.draw2d.Polyline
import org.eclipse.draw2d.geometry.Point

class Animation {

	Point startPosition
	Point delta
	double startAngle
	double deltaAngle
	Polyline line
	int delay

	new(Point startPosition, Point endPosition, Polyline line, int delay) {
		this(startPosition, endPosition, delay)
		this.line = line
	}

	new(Point startPosition, Point endPosition, int delay) {
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

	def set(HoopeGraphicObjectFigure figure, double alpha) {
		if (deltaAngle != 0.0) {
			figure.angle = startAngle + alpha * deltaAngle
		}
		if (startPosition != null) {
			val currentLocation = new Point(delta).scale(alpha).translate(startPosition)
			figure.objectLocation = currentLocation
			if (line != null) {
				line.end = currentLocation
				if (line.parent == null)
					figure.parent.add(line, figure.parent.children.size -2)
			}
		}
	}
}