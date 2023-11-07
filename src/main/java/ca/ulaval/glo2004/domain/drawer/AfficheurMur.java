/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.drawer;

import ca.ulaval.glo2004.domain.Controleur;
import ca.ulaval.glo2004.domain.Orientation;
import ca.ulaval.glo2004.domain.utils.Dimensions;
import ca.ulaval.glo2004.gui.MainWindow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author 14189
 */
public class AfficheurMur implements chaletDrawer {
    
    
    public AfficheurMur(MainWindow outer) {
    }

    @Override
   public void drawDessus(Graphics g,Orientation orientation) {
       
    g.setColor(new Color(140, 98, 57));
    int x = 100; // Position de départ X
    int y = 50;  // Position de départ Y
    int width = 400; // La largeur du rectangle ou du carré
    int height = 250; // La hauteur du rectangle ou du carré
    
    // Adjust width or height based on orientation
    if (orientation == Orientation.Sud || orientation == Orientation.Nord) {
        width = 400; // Adjust height for a rectangle if orientation is Sud or Nord
    } else if (orientation == Orientation.Est || orientation == Orientation.Ouest) {
        width = 250;
    }
    
    // Draw the shape
    g.drawRect(x, y, width, height);
}


}
