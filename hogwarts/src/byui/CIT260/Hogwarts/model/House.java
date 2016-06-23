/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mallory
 */
public enum House implements Serializable{
    Gryffindor("The good house"),
    Hufflepuff("Another house"),
    Ravenclaw("a third house"),
    Slytherin("the bad house");
    
    //class instance variables
    private final String description;

    House(String description) {
        this.description = description;
    }
    
    
    public String getDescription() {
        return description;
    }
    
}
