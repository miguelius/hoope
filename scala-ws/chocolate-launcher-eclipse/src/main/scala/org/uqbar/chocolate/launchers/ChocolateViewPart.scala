package org.uqbar.chocolate.launchers

import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import org.eclipse.swt.SWT
import org.eclipse.swt.awt.SWT_AWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.part.ViewPart
import org.uqbar.chocolate.core.GamePlayer
import org.uqbar.chocolate.games.skeletons.Skeletons

class ChocolateViewPart extends ViewPart {

   // acá defino el juego
   val player = new GamePlayer(MockGame)
  
   override def createPartControl(parent : Composite) {
		var swtAwtComponent = new Composite(parent, SWT.EMBEDDED);
		    
		var frame = SWT_AWT.new_Frame( swtAwtComponent )
		frame.add(player)
		
		frame.setLocationRelativeTo(null)
		frame.setVisible(true)
		frame.setResizable(false)
		frame.pack
		frame.setTitle(player.game.title)
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		
		frame.addWindowListener(new WindowListener {
				def windowActivated(e : WindowEvent) = player.resume
				def windowDeactivated(e : WindowEvent) = player.pause
				def windowOpened(e : WindowEvent) {}
				def windowIconified(e : WindowEvent) {}
				def windowDeiconified(e : WindowEvent) {}
				def windowClosing(e : WindowEvent) {}
				def windowClosed(e : WindowEvent) {}
			})
   }
  
   override def setFocus() {
	   player.resume
   }
}