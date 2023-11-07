/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.gui.Panels;

import ca.ulaval.glo2004.domain.drawer.chaletDrawer;
import ca.ulaval.glo2004.domain.drawer.*;
import ca.ulaval.glo2004.gui.MainWindow;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author charlescareau
 */
@SuppressWarnings("serial")
public class drawingPanel extends JPanel implements Serializable {

    public Dimension initialDimension;
    private MainWindow mainWindow;
    private AfficheurDessus afficheurDessus;
    private AfficheurMur afficheurMur;
    private chaletDrawer drawer;
    private chaletDrawer currentDrawer;

    public drawingPanel() {
    }

    public drawingPanel(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.afficheurDessus = new AfficheurDessus(mainWindow);
        this.afficheurMur = new AfficheurMur(mainWindow);
        this.drawer = new AfficheurDessus(mainWindow);
        this.currentDrawer = this.afficheurDessus;
        buildUp();

    }

    private void buildUp() {
        setBorder(new javax.swing.border.BevelBorder(BevelBorder.LOWERED));
        int width = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width * 0.85);
        setPreferredSize(new Dimension(width, 1));
        setVisible(true);
        int height = (int) (width * 0.5);
        initialDimension = new Dimension(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g); // On appelle d'abord la méthode de la superclasse
        if (currentDrawer != null) {
            currentDrawer.drawDessus(g,mainWindow.orientation); // Utilisez currentDrawer pour dessiner sur le panel
        }
        repaint();
    }

    public void setCurrentDrawer(chaletDrawer drawer) {
        this.currentDrawer = drawer;
        repaint();
    }

    public void setDrawers(chaletDrawer drawer) {
        this.drawer = drawer;
        repaint();
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }

    public Dimension getInitialDimension() {
        return initialDimension;
    }
}
