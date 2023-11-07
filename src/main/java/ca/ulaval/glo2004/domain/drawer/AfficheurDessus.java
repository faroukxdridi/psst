/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.drawer;
import ca.ulaval.glo2004.domain.Controleur;
import ca.ulaval.glo2004.domain.Orientation;
import ca.ulaval.glo2004.gui.MainWindow;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author 14189

public class AfficheurDessus extends Afficheur {
 
    public AfficheurDessus(Controleur controller, Dimension initialDimension) {
        super(controller, initialDimension);

    }

    @Override
    protected void drawMur(Graphics g) {
        int x = 10; // Position X
        int y = 10; // Position Y
        int largeur = 100; // Largeur du rectangle
        int longueur = 50; // Longueur du rectangle

        g.setColor(Color.BLACK); // Définir la couleur du contour
g.drawRect(x, y, largeur, longueur); // Dessiner le rectangle
    }

    //@Override
    //protected void drawToit(Graphics g) {
        // Logique spécifique pour dessiner un toit vu de dessus
    }
*/

public class AfficheurDessus implements chaletDrawer {

    public AfficheurDessus(MainWindow outer) {
    }
    

    @Override
    public void drawDessus(Graphics g,Orientation orientation) {
      
        // Dessiner le rectangle
        g.setColor(new Color(140,98,57));
        g.drawLine(50,50 ,500,50 );
        g.drawLine(50,300 ,500,300 );
        g.drawLine(50,50 ,50,300 );
        g.drawLine(500,50 ,500,300 );
        
        
        g.drawLine(80,80 ,470,80 );
        g.drawLine(80,270 ,470,270 );
        g.drawLine(80,80,80,270 );
        g.drawLine(470,80 ,470,270 );
        
        
        
        g.drawLine(50,65 ,65,65 );
        g.drawLine(65,80 ,80,80 );
        g.drawLine(65,65 ,65,80 );
        
        g.drawLine(485,65 ,500,65 );
        g.drawLine(470,80 ,485,80);
        g.drawLine(485,65 ,485,80 );
        
        g.drawLine(485,285 ,500,285 );
        g.drawLine(470,270 ,485,270);
        g.drawLine(485,270 ,485,285 );
        
        g.drawLine(50,285 ,65,285 );
        g.drawLine(65,270 ,80,270 );
        g.drawLine(65,270 ,65,285);
    }

   

}
