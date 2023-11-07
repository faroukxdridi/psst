/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.drawer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

import ca.ulaval.glo2004.domain.Controleur;
import ca.ulaval.glo2004.domain.DTO.*;
import ca.ulaval.glo2004.domain.*;
import ca.ulaval.glo2004.domain.utils.Dimensions;
import ca.ulaval.glo2004.gui.MainWindow;

/**
 *
 * @author 14189
 */
public class Afficheur {

    public final Controleur controller;
    private Dimension initialDimension;
    private AfficheurDessus afficheurDessus;
    private AfficheurMur afficheurMur;
    private chaletDrawer chaletdraw;
    private AfficheurAcessoire afficheacc;

    public Afficheur(Controleur controller, AfficheurDessus afficheurDessus, AfficheurMur afficheurMur, Dimension initialDimension, chaletDrawer chaletdraw, AfficheurAcessoire afficheacc) {
        this.controller = controller;
        this.initialDimension = initialDimension;
        this.afficheurDessus = afficheurDessus;
        this.chaletdraw = chaletdraw;
        this.afficheurMur = afficheurMur;
        this.afficheacc = afficheacc;
    }

    public void draw(Graphics g) {

        chaletdraw.drawDessus(g, controller.getMurOrientation());
        List<AccessoiresDTO> accs = controller.getaccList();
        for (AccessoiresDTO accc : accs) {
            afficheacc.drawAccessoire(g, accc);
            Point accPoint = accc.position;
            String type = accc.type;
            if (accc.SelectionStatus == MainWindow.SelectMode.ADD) {
                if (type.equals("Porte")) {
                    g.setColor(Color.RED);
                    g.fillRect(10, 10, 100, 200); // x, y, width, height for a rectangle
                } else if (type.equals("Fenetre")) {
                    g.setColor(Color.BLACK);
                    g.fillRect(10, 10, 50, 50); // x, y, width, height for a square
                }
            }
        }

    }

}
