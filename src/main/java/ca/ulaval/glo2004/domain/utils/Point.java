/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.utils;

/**
 *
 * @author Utilisateur
 */
public class Point {
    private Imperial x;
    private Imperial y;
    
    public Point(Imperial x, Imperial y) {
        this.x = x;
        this.y = y;
        
    }

    public Imperial getX() {
        return x;
    }

    public void setX(Imperial x) {
        this.x = x;
    }

    public Imperial getY() {
        return y;
    }

    public void setY(Imperial y) {
        this.y = y;
    }
    
}
