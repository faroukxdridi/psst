/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain;

import ca.ulaval.glo2004.gui.MainWindow.SelectMode;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.UUID;

/**
 *
 * @author Utilisateur
 */
public class Accessoires {

    public Point position;
    public String type;
    public Dimension dimension;
    public SelectMode SelectionStatus;
    private UUID uuid;

    public Accessoires(Point position, String type) {

        this.position = position;
        this.type = type;
        this.uuid = UUID.randomUUID();

    }
    
    public void setType(String type){
        this.type = type;
     
    }
    
    public void setPosition(Point po){
        this.position = po;
     
    }

    public Point getPosition() {
        return position;
    }
    public UUID getUUID() {
            return uuid;
        }

    public String gettype() {
        return type;
    }

    public SelectMode getSelect() {
        return SelectionStatus;
    }
    
    


    public Dimension getDimensions() {
        return dimension;
    }

    public void deplacer(Point deltaX, Point deltaY) {

    }

    public void setSelectionStatus(SelectMode s) {
        this.SelectionStatus = s;
    }

    /*
    public string getType() {}
     */
}
