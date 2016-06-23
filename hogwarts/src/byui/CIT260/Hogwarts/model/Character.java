/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mallory
 */
public enum Character implements Serializable{
    
    //class instance variables
    Harry("He is the chosen one"),
    Ron("Harry's best friend"),
    Hermione("Harry's really smart best friend"),
    Ginny("Ron's little sister"),
    Neville("a member of the Gryffindor class"),
    Fred("George's twin"),
    George("Fred's twin"),
    Cedric_Diggory("member of the Hufflepuff House"),
    Zacharias_Smith("member of the Hufflepuff House"),
    Justin_Finch_Fletchley("member of the Hufflepuff House"),
    Hannah_Longbottom("member of the Hufflepuff House"),
    Ernie_Macmillan("member of the Hufflepuff House"),
    Susan_Bones("member of the Hufflepuff House"),
    Anthony_Otterburn("member of the Hufflepuff House"),
    Luna_Lovegood("member of the Ravenclaw House"),
    Cho_Chang("member of the Ravenclaw House"),
    Roger_Davies("member of the Ravenclaw House"),
    Michael_Corner("member of the Ravenclaw House"),
    Padma_Patil("member of the Ravenclaw House"),
    Terry_Boot("member of the Ravenclaw House"),
    Draco_Malfoy("member of the Slytherin House"),
    Gregory_Goyle("member of the Slytherin House"),
    Vincent_Crabbe("member of the Slytherin House"),
    Terence_Higgs("member of the Slytherin House"),
    Marcus_Flint("member of the Slytherin House"),
    Blaise_Zabini("member of the Slytherin House"),
    Pansy_Parkinson("member of the Slytherin House");
    
    private final String description;
    private final Point coordinates;

    Character (String description) {
        this.description = description;
        coordinates = new Point (1, 1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
   
 }