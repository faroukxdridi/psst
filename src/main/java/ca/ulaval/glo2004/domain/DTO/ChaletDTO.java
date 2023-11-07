/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.DTO;

import ca.ulaval.glo2004.domain.Murs;
import ca.ulaval.glo2004.domain.Chalet;
import ca.ulaval.glo2004.domain.SensToit;
import ca.ulaval.glo2004.domain.utils.Dimensions;
import ca.ulaval.glo2004.domain.utils.Imperial;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author charlescareau

public class ChaletDTO
{
    private Dimensions dimensions;
    private List<MursDTO> listmursDTO;  
    private float angleToit;
    private SensToit sensToit;
    private Imperial epaisseurMur;
    private vueType vueCourante;
    public enum vueType {Dessus, Cote};
    private UUID uuid;
    
    public ChaletDTO(Chalet chalet)
    {
        dimensions = chalet.getDimensions();
        angleToit = chalet.getAngleToit();
        sensToit = chalet.getSensToit();
        epaisseurMur = chalet.getEpaisseurMur();
        uuid = chalet.getUUID();
    }
    
    public ChaletDTO(Dimensions dimension, List<MursDTO> mursDTO, float angleToit, SensToit sensToit, Imperial epaisseurMur)
    {
        this.dimensions = dimension;
        this.listmursDTO = mursDTO;
        this.angleToit = angleToit;
        this.sensToit = sensToit;
        this.epaisseurMur = epaisseurMur;
        this.uuid = UUID.randomUUID();
    }
    
    // Getters and setters for the attributes

    public Dimensions getDimensions()
    {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions)
    {
        this.dimensions = dimensions;
    }

    public List<MursDTO> getListMursDTO()
    {
        return listmursDTO;
    }
    
    public ChaletDTO.vueType getvueCourante(){
        return vueCourante;
    }

    public void setListMursDTO(List<MursDTO> listmursDTO)
    {
        this.listmursDTO = listmursDTO;
    }

    public float getAngleToit()
    {
        return angleToit;
    }

    public void setAngleToit(float angleToit)
    {
        this.angleToit = angleToit;
    }

    public SensToit getSensToit()
    {
        return sensToit;
    }

    public void setSensToit(SensToit sensToit)
    {
        this.sensToit = sensToit;
    }

    public Imperial getEpaisseurMur()
    {
        return epaisseurMur;
    }

    public void setEpaisseurMur(Imperial epaisseurMur)
    {
        this.epaisseurMur = epaisseurMur;
    }
    
    public UUID getUUID()
    {
        return uuid;
    }
    
} */