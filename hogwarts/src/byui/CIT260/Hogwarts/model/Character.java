/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mallory
 */
public enum Character implements Serializable{
    
    //class instance variables
    Harry("He is the chosen one", House.Gryffindor),
    Ron("Harry's best friend", House.Gryffindor),
    Hermione("Harry's really smart best friend", House.Gryffindor),
    Ginny("Ron's little sister", House.Gryffindor),
    Neville("a member of the Gryffindor class", House.Gryffindor),
    Fred("George's twin", House.Gryffindor),
    George("Fred's twin", House.Gryffindor),
    Cedric_Diggory("member of the Hufflepuff House", House.Hufflepuff),
    Zacharias_Smith("member of the Hufflepuff House", House.Hufflepuff),
    Justin_Finch_Fletchley("member of the Hufflepuff House", House.Hufflepuff),
    Hannah_Longbottom("member of the Hufflepuff House", House.Hufflepuff),
    Ernie_Macmillan("member of the Hufflepuff House", House.Hufflepuff),
    Susan_Bones("member of the Hufflepuff House", House.Hufflepuff),
    Anthony_Otterburn("member of the Hufflepuff House", House.Hufflepuff),
    Luna_Lovegood("member of the Ravenclaw House", House.Ravenclaw),
    Cho_Chang("member of the Ravenclaw House", House.Ravenclaw),
    Roger_Davies("member of the Ravenclaw House", House.Ravenclaw),
    Michael_Corner("member of the Ravenclaw House", House.Ravenclaw),
    Padma_Patil("member of the Ravenclaw House", House.Ravenclaw),
    Terry_Boot("member of the Ravenclaw House", House.Ravenclaw),
    Draco_Malfoy("member of the Slytherin House", House.Slytherin),
    Gregory_Goyle("member of the Slytherin House", House.Slytherin),
    Vincent_Crabbe("member of the Slytherin House", House.Slytherin),
    Terence_Higgs("member of the Slytherin House", House.Slytherin),
    Marcus_Flint("member of the Slytherin House", House.Slytherin),
    Blaise_Zabini("member of the Slytherin House", House.Slytherin),
    Pansy_Parkinson("member of the Slytherin House", House.Slytherin);
    
    private final String description;
    private final Point coordinates;
    private final House house;
    private ArrayList<Item> items;

    Character (String description, House house) {
        this.description = description;
        coordinates = new Point (1, 1);
        this.house = house;
        this.items = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public House getHouse() {
        return house;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
   
    
    
 }