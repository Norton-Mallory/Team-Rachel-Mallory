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
//public enum Scene implements Serializable{
    //mcgonagall_office("Professor McGonagall's office"),
    //classroom("an empty classroom"),
    //dumbledore_office("Headmaster Dumbledore's office"),
    //girls_lavatory("the girl's bathroom"),
    //room_of_requirement("The Room of Requirement. Obtain what you need"),
    //gryffindor_dormitory("Gryffindor Dormitory"),
    //stairway("the stairway"),
    //hallway("an empty hallway"),
    //hospital_wing("hospital wing"),
   // snape_office("Professor Snape's office"),
   // chamber_of_secrets("the Chamber of Secrets"),
   // library("The library"),
   // great_hall("The Great Hall, where everyone eats"),
   // slytherin_dormitory("Slytherin Dormitory"),
   // green_houses("The green houses"),
   // hagrids_hut("Hagrid's Hut"),
   // quidditch_field("The quidditch field"),
   // dungeon("The dungeons"),
   // black_lake("Black Lake"),
   // forbidden_forest("the Forbidden Forest"),
   // front_walk("the front walk"),
   // garden("the gardens");
    
    //class instance variables
    //private String description;
    //private Point coordinates;

    //Scene(String description) {
       // this.description = description;
      //  coordinates = new Point(1, 1);
//}

    //public String getDescription() {
    //    return description;
   // }

    
  //  public Point getCoordinates() {
  //      return coordinates;
  //  }

  public class Scene implements Serializable{
      //class instance variables
      private String description;
      private Point coordinates;
      private String mapSymbol;
      private boolean blocked;
  

    public Scene(){
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.coordinates);
        hash = 79 * hash + Objects.hashCode(this.mapSymbol);
        hash = 79 * hash + (this.blocked ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", coordinates=" + coordinates + ", mapSymbol=" + mapSymbol + ", blocked=" + blocked + '}';
    }
  

    
}
