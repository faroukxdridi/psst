/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain;

import ca.ulaval.glo2004.domain.export.*;
import ca.ulaval.glo2004.gui.*;
import ca.ulaval.glo2004.domain.DTO.*;
import java.awt.Color;
import java.awt.Point;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 14189
 */
public class Controleur {

    private Chalet chalet;
    public Orientation murorientation;

    public Controleur(Chalet chalet) {
        this.chalet = chalet;

    }

    public void changerSensToit(SensToit sens) {
        chalet.setSensToit(sens);
    }

    public Orientation getMurOrientation() {
        return murorientation;
    }

    public void setMurOrientation(Orientation orientation) {
        murorientation = orientation;
    }

    public void addItem(Point mousePoint, String type) {

        Accessoires item = new Accessoires(mousePoint, type);
        item.setPosition(mousePoint);
        item.setType(type);
        chalet.addacc(item);
    }
    


    public List<AccessoiresDTO> getaccList() {
        ArrayList<AccessoiresDTO> acc_dtos = new ArrayList<>();
        for (Accessoires acclist : chalet.getAccList()) {
            acc_dtos.add(new AccessoiresDTO(acclist));
        }
        return acc_dtos;}
}

/*
    
     public void undo() {
        // annuler la dernière action
    }

    public void redo() {
        // refaire la dernière action annulée
    }
    
    public void export(TypeExport type, String path) {

    }
    
    public List<MursDTO> getListMurs()
    {
        List<MursDTO> mursDTO = new ArrayList<>();
        for (MursDTO mur : chalet.getListMursDTO())
        {
            mursDTO.add(mur);
        }
        return mursDTO;
	}
    }
    
    public Murs[] getMurs() {
        // return chalet.getMurs();  getMurs() dans la classe Chalet aussi
    }
    public void initialiserChalet(){}
    public void affichageDessus(){}
    public void affichageMurs(){}
    public void setAccessoire() {}
    public void afficheAccessoire() {}
    public void voirAccessoire() {}
    public void SélectionnerAccessoire() {}
    public void modifierAccessoire() {}
    public void deleteAccessoire() {}
    public void deplacerAccessoire() {}
    public void redimensionnerAccessoire() {}
    
    
    
 */
