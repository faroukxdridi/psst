/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.utils;

/**
 *
 * @author Utilisateur
 */
public class Imperial {
    private int pieds;
    private int pouces;
    private int numerateur;
    private int denominateur;
    
    public Imperial(int pieds, int pouces, int numerateur, int denominateur) {
        this.pieds = pieds;
        this.pouces = pouces;
        this.numerateur = numerateur;
        this.denominateur = denominateur;}
    public Imperial addition(Imperial autreImperial) 
    {
        int totalPieds = this.pieds + autreImperial.pieds;
        int totalPouces = this.pouces + autreImperial.pouces;
        int totalNumerateur = this.numerateur + autreImperial.numerateur;
        int totalDenominateur = this.denominateur + autreImperial.denominateur;
        return new Imperial(totalPieds, totalPouces, totalNumerateur, totalDenominateur);
    }
    
    public Imperial soustraction(Imperial autreImperial) 
    {
        int totalPieds = this.pieds - autreImperial.pieds;
        int totalPouces = this.pouces - autreImperial.pouces;
        int totalNumerateur = this.numerateur - autreImperial.numerateur;
        int totalDenominateur = this.denominateur - autreImperial.denominateur;
        return new Imperial(totalPieds, totalPouces, totalNumerateur, totalDenominateur);
    }
    
    public Imperial multiplication(Imperial autreImperial) 
    {
        int totalPieds = this.pieds * autreImperial.pieds;
        int totalPouces = this.pouces * autreImperial.pouces;
        int totalNumerateur = this.numerateur * autreImperial.numerateur;
        int totalDenominateur = this.denominateur * autreImperial.denominateur;
        return new Imperial(totalPieds, totalPouces, totalNumerateur, totalDenominateur);
    }
    
    public Imperial division(Imperial autreImperial) 
    {
        int totalPieds = this.pieds / autreImperial.pieds;
        int totalPouces = this.pouces / autreImperial.pouces;
        int totalNumerateur = this.numerateur / autreImperial.numerateur;
        int totalDenominateur = this.denominateur / autreImperial.denominateur;
        return new Imperial(totalPieds, totalPouces, totalNumerateur, totalDenominateur);
    }
}
