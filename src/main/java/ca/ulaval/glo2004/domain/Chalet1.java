/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author Utilisateur
 */
public class Chalet1 {
    private int longueur;
    private int hauteur;
    private int profondeur;
    private int epaisseur;
    private List<Murs> listmurs;
    private SensToit sensToit;
    private UUID uuid;
    private vueType vueCourante;
    public enum vueType {Dessus, Facade, Arriere, Gauche, };
    
    public Chalet1(int longeur, int hauteur, int profondeur, int epaisseur, List<Murs> listmurs, SensToit sensToit, vueType vueCourante){
        this.vueCourante = vueType.Dessus;
        this.longueur = 10;
        this.hauteur = 10;
        this.profondeur = 8;
        this.sensToit = SensToit.Facade_arriere;
        this.epaisseur = 6;
        this.uuid = UUID.randomUUID();
        
        
           
    }
    
        public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        this.profondeur = profondeur;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }
    
    public UUID getUUID()
    {
        return uuid;
    }
    
    public vueType getvueCourante(){
        return vueCourante;
    }
    
    public void setVueCourante(vueType vueCourante) {
        this.vueCourante = vueCourante;
    }

    public void changerSensToit(SensToit nouveauSens) {

        this.sensToit = nouveauSens;
        
    }

    public List<Murs> getListmurs() {
        return listmurs;
    }

    public void setListmurs(List<Murs> listmurs) {
        this.listmurs = listmurs;

    }

    public SensToit getSensToit() {
        return sensToit;
    }

    public void setSensToit(SensToit sensToit) {
        this.sensToit = sensToit;
    }

    public void changerDimensions(int nouvelleLargeur, int nouvelleLongeur, int nouvelleHauteur) {

        for (Murs mur : listmurs) {
            mur.onDimensionChanged(nouvelleLargeur, nouvelleLongeur, nouvelleHauteur);
        }
    }
}
