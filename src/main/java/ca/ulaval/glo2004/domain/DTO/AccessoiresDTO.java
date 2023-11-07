/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.ulaval.glo2004.domain.DTO;
import ca.ulaval.glo2004.domain.Accessoires;
import ca.ulaval.glo2004.gui.MainWindow;
import java.awt.Dimension;
import java.awt.Point;
import java.util.UUID;
/**
 *
 * @author charlescareau
 */
public class AccessoiresDTO {
    
    public java.awt.Point position;
    public String type;
    public Dimension dimension;
    public MainWindow.SelectMode SelectionStatus;
    public UUID Uuid;
    public AccessoiresDTO(Accessoires bi){
        type = bi.gettype();
        position = new Point(bi.getPosition());
        dimension = bi.getDimensions();
        SelectionStatus = bi.getSelect();
        Uuid = bi.getUUID();
        }   
    
  
}
