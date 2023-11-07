package ca.ulaval.glo2004.gui.listener;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ca.ulaval.glo2004.domain.drawer.*;
import ca.ulaval.glo2004.gui.MainWindow;


public class AffichageMurAction implements ActionListener {

	private final MainWindow outer;

	public AffichageMurAction(MainWindow outer) {
		this.outer = outer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		chaletDrawer Drawer = new AfficheurMur(outer);
		outer.drawingPanel.setDrawers(Drawer);
	}
}
