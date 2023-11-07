/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.utils;

/**
 *
 * @author Utilisateur
 */
public class Dimensions {
    private Imperial hauteur;
    private Imperial largeur;
    private Imperial profondeur;

    public Dimensions (Imperial hauteur, Imperial largeur, Imperial profondeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.profondeur = profondeur;
    }
    
    public Imperial getHauteur() {
        return hauteur;
    }

    public void setHauteur(Imperial hauteur) {
        this.hauteur = hauteur;
    }

    public Imperial getLargeur() {
        return largeur;
    }

    public void setLargeur(Imperial largeur) {
        this.largeur = largeur;
    }

    public Imperial getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(Imperial profondeur) {
        this.profondeur = profondeur;
    }
}
