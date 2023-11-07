/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain;

//import ca.ulaval.glo2004.domain.utils.*;
import java.awt.Point;
import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Murs {
    private Orientation orientation;
    
    private UUID uuid;

    public Murs(Orientation orientation) {

        this.orientation = orientation;
        this.uuid = UUID.randomUUID();}

    
    public UUID getUUID()
    {
        return uuid;
    }
    
    
    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void onSensToitChanged(SensToit newSensToit, SensToit oldSensToit) {

    }

    public void onDimensionChanged(int nouvelleLargeur, int nouvelleHauteur, int nouvelleProfondeur) {
        
    }
   
}
    
   
  /**  
   *  public List<Accessoires> getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(List<Accessoires> accessoires) {
        this.accessoires = accessoires;
    }

    public List<Point> getPoints() {
        return pointsVueDessus;
    }

    public void setPoints(List<Point> points) {
        this.pointsVueDessus = points;
    }
    
    public void addAccessoire(Accessoires accessoire) {
        accessoires.add(accessoire);
    }
   * public List<Point> initialiserPointsDessus(Chalet1 chalet){
        List<Point> points = new ArrayList<>();
        if (null != getOrientation())switch (getOrientation()) {
            case Facade:
                points.add(new Point(0, 0));
                points.add(new Point(chalet.getLongueur(), 0));
                points.add(new Point(chalet.getLongueur(), chalet.getEpaisseur()));
                points.add(new Point(0, chalet.getEpaisseur()));
                break;
            case Arriere:
                points.add(new Point(0, 0));
                points.add(new Point(chalet.getProfondeur(), 0));
                points.add(new Point(chalet.getLongueur(), chalet.getProfondeur()));
                points.add(new Point(chalet.getLongueur(), chalet.getProfondeur() - chalet.getEpaisseur()));
                break;
            case Droite:
                points.add(new Point(chalet.getLongueur() - chalet.getEpaisseur(), 0));
                points.add(new Point(chalet.getLongueur(), 0));
                points.add(new Point(chalet.getLongueur(), chalet.getProfondeur()));
                points.add(new Point(chalet.getLongueur() - chalet.getEpaisseur(), chalet.getProfondeur()));
                break;
            case Gauche:
                points.add(new Point(0, 0));
                points.add(new Point(chalet.getEpaisseur(), 0));
                points.add(new Point(chalet.getEpaisseur(), chalet.getProfondeur()));
                points.add(new Point(0, chalet.getProfondeur() - chalet.getEpaisseur()));
                break;
            default:
                break;
        }
        return points;
    }
    }
   
    public List<Point> initialiserPointsDessus(Dimensions dimensionsChalet, Chalet chalet){
        List<Point> points = new ArrayList<>();
        if (null != getOrientation())switch (getOrientation()) {
            case Facade:
                points.add(new Point(new Imperial(0, 0, 0, 1), new Imperial(0, 0, 0, 1)));
                points.add(new Point(dimensionsChalet.getLargeur(), new Imperial(0, 0, 0, 1)));
                points.add(new Point(dimensionsChalet.getLargeur(), chalet.getEpaisseurMur()));
                points.add(new Point(new Imperial(0, 0, 0, 1), chalet.getEpaisseurMur()));
                break;
            case Arriere:
                points.add(new Point(new Imperial(0, 0, 0, 1), dimensionsChalet.getProfondeur()));
                points.add(new Point(dimensionsChalet.getProfondeur().soustraction(chalet.getEpaisseurMur()), new Imperial(0, 0, 0, 1)));
                points.add(new Point(dimensionsChalet.getLargeur(), dimensionsChalet.getProfondeur()));
                points.add(new Point(dimensionsChalet.getLargeur(), dimensionsChalet.getProfondeur().soustraction(chalet.getEpaisseurMur())));
                break;
            case Droite:
                points.add(new Point(dimensionsChalet.getLargeur().soustraction(chalet.getEpaisseurMur()), new Imperial(0, 0, 0, 1)));
                points.add(new Point(dimensionsChalet.getLargeur(), new Imperial(0, 0, 0, 1)));
                points.add(new Point(dimensionsChalet.getLargeur(), dimensionsChalet.getProfondeur()));
                points.add(new Point(dimensionsChalet.getLargeur().soustraction(chalet.getEpaisseurMur()), dimensionsChalet.getProfondeur()));
                break;
            case Gauche:
                points.add(new Point(new Imperial(0, 0, 0, 1), new Imperial(0, 0, 0, 1)));
                points.add(new Point(chalet.getEpaisseurMur(), new Imperial(0, 0, 0, 1)));
                points.add(new Point(chalet.getEpaisseurMur(), dimensionsChalet.getProfondeur()));
                points.add(new Point(chalet.getEpaisseurMur() ,new Imperial(0, 0, 0, 1))); 
                break;
            default:
                break;
        }
        return points;
    }
   
    
    public void retirerReinure(Murs mur1, Murs mur2) {
        List<Point> pointsCommuns = new ArrayList<>();
        for (Point pointMur1 : mur1.getPoints()) 
        {
            for (Point pointMur2 : mur2.getPoints()) 
                {
                    if (pointMur1.equals(pointMur2)) 
                    {
                        pointsCommuns.add(pointMur1);
                    }

        for (Point pointCommun : pointsCommuns)
            {
            Imperial epaisseurMoitie = chalet.getEpaisseurMur().division(new Imperial(2, 0, 0, 1));
            Imperial distanceSupplementaire = new Imperial(0, 0, 1, 4);

            if (chalet.getSensToit() == SensToit.Facade_arriere || chalet.getSensToit() == SensToit.Arriere_facade){
            
            Point nouveauPoint1 = new Point(
                pointCommun.getX(),
                pointCommun.getY().addition(epaisseurMoitie.soustraction(distanceSupplementaire))
            );

            Point nouveauPoint2 = new Point(
                nouveauPoint1.getX().addition(epaisseurMoitie.addition(distanceSupplementaire)),
                nouveauPoint1.getY()
            );
            
            Point nouveauPoint3 = new Point(
                nouveauPoint2.getX(),
                nouveauPoint2.getY().addition(epaisseurMoitie)
            );
            
            Point nouveauPoint4 = new Point(
                pointCommun.getX(),
                pointCommun.getY().addition(epaisseurMoitie)
            );

            Point nouveauPoint5 = new Point(
                nouveauPoint4.getX().addition(epaisseurMoitie),
                nouveauPoint4.getY()
            );
            
            Point nouveauPoint6 = new Point(
                nouveauPoint5.getX(),
                nouveauPoint5.getY().addition(epaisseurMoitie)
            );
            Point nouveauPoint7 = new Point(
                nouveauPoint6.getX().addition(epaisseurMoitie),
                nouveauPoint6.getY()
            );
            mur1.getPoints().add(nouveauPoint1);
            mur1.getPoints().add(nouveauPoint2);
            mur1.getPoints().add(nouveauPoint3);
            mur1.getPoints().add(nouveauPoint4);
            mur2.getPoints().add(nouveauPoint5);
            mur2.getPoints().add(nouveauPoint6);
            mur2.getPoints().add(nouveauPoint7);
            mur2.getPoints().remove(pointCommun);
            }
            else{
            Point nouveauPoint1 = new Point(
                pointCommun.getX().addition(epaisseurMoitie.addition(distanceSupplementaire)),
                pointCommun.getY()
            );

            Point nouveauPoint2 = new Point(
                nouveauPoint1.getX(),
                nouveauPoint1.getY().addition(epaisseurMoitie.soustraction(distanceSupplementaire))
            );
            
            Point nouveauPoint3 = new Point(
                nouveauPoint2.getX().addition(epaisseurMoitie),
                nouveauPoint2.getY()
            );
            Point nouveauPoint4 = new Point(
                nouveauPoint3.getX(),
                nouveauPoint3.getY().addition(epaisseurMoitie)
            );

            Point nouveauPoint5 = new Point(
                pointCommun.getX().addition(epaisseurMoitie),
                pointCommun.getY()
            );
            
            Point nouveauPoint6 = new Point(
                nouveauPoint5.getX(),
                nouveauPoint5.getY().addition(epaisseurMoitie)
            );
            
            Point nouveauPoint7 = new Point(
                nouveauPoint6.getX(),
                nouveauPoint6.getY().addition(epaisseurMoitie)
            );
            mur1.getPoints().add(nouveauPoint1);
            mur1.getPoints().add(nouveauPoint2);
            mur1.getPoints().add(nouveauPoint3);
            mur1.getPoints().add(nouveauPoint4);
            mur2.getPoints().add(nouveauPoint5);
            mur2.getPoints().add(nouveauPoint6);
            mur2.getPoints().add(nouveauPoint7);
            mur1.getPoints().remove(pointCommun);
            }
        }
    }
 
    }

 }
    */
   
