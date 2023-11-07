/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain;

import ca.ulaval.glo2004.domain.utils.*;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



/**
 *
 * @author Utilisateur
 */
public class Chalet {

    private SensToit sensToit;
    private List<Murs> listmurs;
    private List<Accessoires> listacc;
    

    public void changerSensToit(SensToit nouveauSens) {

        this.sensToit = nouveauSens;
        
    }
    
    public void setSensToit(SensToit sensToit) {
        this.sensToit = sensToit;
    }
    
    public void setListmurs(List<Murs> listmurs) {
        this.listmurs = listmurs;

    }
    
    public void creerListeMurs() {
        List<Murs> listmurs = new ArrayList<Murs>();
        listmurs.add(new Murs(Orientation.Nord));
        listmurs.add(new Murs(Orientation.Sud));
        listmurs.add(new Murs(Orientation.Est));
        listmurs.add(new Murs(Orientation.Ouest));

        setListmurs(listmurs); // Utiliser la méthode pour définir la liste de murs
    }
    
    void addacc(Accessoires a) {
        a.setPosition(a.position);
        a.setType(a.type);
        listacc.add(a);
        
    }
    
    public List<Accessoires> getAccList() {
		return listacc;
	}
    

}
/*
private Dimensions dimensions;
    
    private float angleToit;
    
    private Imperial epaisseurMur;
    private UUID uuid;
    private vueType vueCourante;
    public enum vueType {Dessus, Facade, Arriere, Gauche, Droite};
    
    
    public Chalet(Point point){
        super(point);
        this.vueCourante = vueType.Dessus;
        this.dimensions.setHauteur( new Imperial(10,0,1,1));
        this.dimensions.setLargeur( new Imperial(10,0,1,1));
        this.dimensions.setProfondeur( new Imperial(8,0,1,1));
        this.angleToit = 15;
        this.sensToit = SensToit.values()[0];
        this.epaisseurMur = new Imperial(5,0,1,1);
        
        
        
           
    }

    public Chalet(Point point, Dimensions dimension, List<Murs> murs, float angleToit, SensToit sensToit, Imperial epaisseurMur) {
        super(point);
        this.vueCourante = vueType.Dessus;
    }
    public Chalet(Dimensions dimension, List<Murs> murs, float angleToit, SensToit sensToit, Imperial epaisseurMur) {
        this.dimensions = dimension;
        this.listmurs = murs;
        this.angleToit = angleToit;
        this.sensToit = sensToit;
        this.epaisseurMur = epaisseurMur;
        this.uuid = UUID.randomUUID();
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

    

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public List<Murs> getListmurs() {
        return listmurs;
    }

    public void setListmurs(List<Murs> listmurs) {
        this.listmurs = listmurs;

    }

    public float getAngleToit() {
        return angleToit;
    }

    public void setAngleToit(float angleToit) {
        this.angleToit = angleToit;
    }

    public SensToit getSensToit() {
        return sensToit;
    }

    

    public Imperial getEpaisseurMur() {
        return epaisseurMur;
    }

    public void setEpaisseurMur(Imperial epaisseurMur) {
        this.epaisseurMur = epaisseurMur;
    }
*/