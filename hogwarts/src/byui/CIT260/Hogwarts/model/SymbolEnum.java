/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.model;




import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Mallory
 */
public enum SymbolEnum implements Serializable  {
    PMO(new Point (0,0)),
    GD(new Point (0,1)),
    COS(new Point (0,2)),
    GrH(new Point (0,3)),
    BL(new Point (0,4)),
    CL(new Point (1,0)),
    S(new Point (1,1)),
    L(new Point (1,2)),
    HH(new Point (1,3)),
    FF(new Point (1,4)),
    PDO(new Point (2,0)),
    H(new Point (2,1)),
    GH(new Point (2,2)),
    QF(new Point (2,3)),
    GL(new Point (3,0)),
    HW(new Point (3,1)),
    FW(new Point (3,4)),
    ROR(new Point (4,0)),
    PSO(new Point (4,1)),
    SD(new Point (4,2)),
    D(new Point (4,3)),
    G(new Point (4,4));
    
 
    SymbolEnum(){
    
    }
}

      
        
       
        
      
        