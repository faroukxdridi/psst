/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package ca.ulaval.glo2004.domain.DTO;

import ca.ulaval.glo2004.domain.Accessoires;
import ca.ulaval.glo2004.domain.Murs;
import ca.ulaval.glo2004.domain.Orientation;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MursDTO {

    private Orientation orientation;
    private List<AccessoiresDTO> accessoires;
    private List<Point> pointsVueDessus;
    public UUID uuid;

    public MursDTO(Murs murs) {
        orientation = murs.getOrientation();
        accessoires = convertAccessoiresToDTO(murs.getAccessoires());
        pointsVueDessus = murs.getPoints();
        uuid = murs.getUUID();
    }

    public MursDTO(Orientation orientation, List<AccessoiresDTO> accessoires, List<Point> pointsVueDessus, UUID uuid) {
        this.orientation = orientation;
        this.accessoires = accessoires;
        this.pointsVueDessus = pointsVueDessus;
        this.uuid = uuid;
    }

    // getters and setters for the attributes

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public List<AccessoiresDTO> getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(List<AccessoiresDTO> accessoires) {
        this.accessoires = accessoires;
    }

    public List<Point> getPointsVueDessus() {
        return pointsVueDessus;
    }

    public void setPointsVueDessus(List<Point> pointsVueDessus) {
        this.pointsVueDessus = pointsVueDessus;
    }

    public UUID getUUID() {
        return uuid;
    }

    private List<AccessoiresDTO> convertAccessoiresToDTO(List<Accessoires> accessoires) {
        List<AccessoiresDTO> accessoiresDTO = new ArrayList<>();
        for (Accessoires accessoire : accessoires) {
            accessoiresDTO.add(new AccessoiresDTO(accessoire));
        }
        return accessoiresDTO;
    }
}
*/
