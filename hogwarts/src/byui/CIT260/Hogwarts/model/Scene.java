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
public enum Scene implements Serializable{
    mcgonagall_office("Professor McGonagall's office"),
    classroom("an empty classroom"),
    dumbledore_office("Headmaster Dumbledore's office"),
    girls_lavatory("the girl's bathroom"),
    room_of_requirement("The Room of Requirement. Obtain what you need"),
    gryffindor_dormitory("Gryffindor Dormitory"),
    stairway("the stairway"),
    hallway("an empty hallway"),
    hospital_wing("hospital wing"),
    snape_office("Professor Snape's office"),
    chamber_of_secrets("the Chamber of Secrets"),
    library("The library"),
    great_hall("The Great Hall, where everyone eats"),
    slytherin_dormitory("Slytherin Dormitory"),
    green_houses("The green houses"),
    hagrids_hut("Hagrid's Hut"),
    quidditch_field("The quidditch field"),
    dungeon("The dungeons"),
    black_lake("Black Lake"),
    forbidden_forest("the Forbidden Forest"),
    front_walk("the front walk"),
    garden("the gardens");
    
    //class instance variables
    private String description;
    private Point coordinates;

    Scene(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
}

    public String getDescription() {
        return description;
    }

    
    public Point getCoordinates() {
        return coordinates;
    }

    
}
