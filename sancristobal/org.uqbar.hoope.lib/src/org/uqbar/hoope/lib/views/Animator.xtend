package org.uqbar.hoope.lib.views

import com.google.inject.Inject
import java.util.Queue
import java.util.concurrent.ConcurrentLinkedQueue
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.progress.UIJob
import org.uqbar.hoope.lib.views.SampleView

class Animator extends UIJob {
	
	val int UPDATE_INTERVAL = 20
	
	@Inject SampleView view
	
	long lastStart
	boolean isScheduled
	Queue<Animation> animationQueue = new ConcurrentLinkedQueue
	boolean isStop
	boolean isAnimated = true
	
	new() {
		super("Tortoise Animator")
		isScheduled = false
	}
	
	def void addAnimation(Animation animation) {
		if (isAnimated) {
			animationQueue.add(animation)
			if (!isScheduled && !isStop) {
				schedule(UPDATE_INTERVAL)
				isScheduled = true
				lastStart = System.currentTimeMillis
			}
		} else {
			animation.set(view.hoopeGraphicObjectFigure, 1)
		}
	}
	
	def setAnimated(boolean isAnimated) {
		stop()
		this.isAnimated = isAnimated
	}
	
	def stop() {
		isStop = true
		while (isScheduled && isStop) {
			if (Display.current != null)
				Display.current.readAndDispatch
			else 
				join
		}
		animationQueue.clear
		isStop = false
		isScheduled = false
	}
	
	override runInUIThread(IProgressMonitor monitor) {
		if (isStop) {
			isStop = false
			isScheduled = false
		} else {
			val now = System.currentTimeMillis
			var currentAnimation = animationQueue.peek
			while (currentAnimation != null && now >= lastStart + currentAnimation.delay) {
				animationQueue.poll.set(view.hoopeGraphicObjectFigure, 1)
				lastStart = lastStart + currentAnimation.delay
				currentAnimation = animationQueue.peek
			}
			if (currentAnimation != null) {
				val alpha = (now - lastStart) as double / currentAnimation.delay 
				currentAnimation.set(view.hoopeGraphicObjectFigure, alpha)
				schedule(UPDATE_INTERVAL)
			} else {
				isScheduled = false
			}
		}
		Status.OK_STATUS
	}
}
