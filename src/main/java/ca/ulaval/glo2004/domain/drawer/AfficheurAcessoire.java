/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.drawer;

import ca.ulaval.glo2004.domain.Accessoires;
import ca.ulaval.glo2004.domain.DTO.AccessoiresDTO;
import ca.ulaval.glo2004.gui.MainWindow.SelectMode;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author 14189
 */
public class AfficheurAcessoire implements acessoireDrawer {

    private String type;
    private Color color;

    public AfficheurAcessoire(Accessoires accessoire) {
        this.type = accessoire.type;

    }

    @Override
    public void drawAccessoire(Graphics g, AccessoiresDTO acessoire) {
        Point accPoint = acessoire.position;
        String type = acessoire.type;
        if (acessoire.SelectionStatus == SelectMode.ADD) {
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
