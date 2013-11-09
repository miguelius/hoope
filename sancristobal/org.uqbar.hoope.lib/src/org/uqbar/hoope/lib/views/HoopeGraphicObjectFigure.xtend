package org.uqbar.hoope.lib.views

import org.eclipse.draw2d.Graphics
import org.eclipse.draw2d.ImageFigure
import org.eclipse.draw2d.Label
import org.eclipse.draw2d.PositionConstants
import org.eclipse.draw2d.geometry.Dimension
import org.eclipse.draw2d.geometry.Point
import org.eclipse.draw2d.geometry.Rectangle
import org.eclipse.swt.graphics.Image

class HoopeGraphicObjectFigure extends ImageFigure {

	@Property double angle

	@Property HoopeRuntimeView view

	new() {
	}

	new(Image image, String identifier) {
		super(image, PositionConstants.NORTH_EAST)
		this.toolTip = new Label(identifier)
	}

	override protected paintFigure(Graphics graphics) {
		graphics.pushState
		val size = size
		graphics.translate(location.x + size.width / 2, location.y + size.width / 2)
		graphics.rotate(-Math.toDegrees(angle) as float)
		graphics.translate(-location.x - size.width / 2, -location.y - size.width / 2)
		super.paintFigure(graphics)
		graphics.popState
	}

	override getMinimumSize(int wHint, int hHint) {
		val bounds = image.bounds
		new Dimension(bounds.width, bounds.height)
	}

	def setObjectLocation(Point location) {
		val minSize = minimumSize
		parent.setConstraint(this,
			new Rectangle(
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

}
