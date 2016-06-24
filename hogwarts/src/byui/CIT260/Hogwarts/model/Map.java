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
 * @author rachelbarnes
 */
public class Map implements Serializable {
    //class instance variables
    private int numberOfRows;
    private int numberOfColumns;
    private Location[][] locations;
    
public Map() {
    }
    
    public Map(int numberOfRows, int numberOfColumns){
        if (numberOfRows < 1 || numberOfColumns < 1){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.numberOfRows = numberOfRows;
        this.numberOfColumns = numberOfColumns;
        
        //create 2-D array for location objects
        this.locations = new Location[numberOfRows] [numberOfColumns];    }
         
        for(int row = 0; row < numberOfRows; row++){
        for(int column = 0; column < numberOfColumns; column++){
            //create and initialize new location object instance
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            //assign the location object to the current position in array
            locations[row][column] = location;
        }
}
    
    public double getNumberOfRows() {
        return numberOfRows;
    }

    
    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public double getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

  
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.numberOfRows);
        hash = 53 * hash + Objects.hashCode(this.numberOfColumns);
       
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.numberOfRows, other.numberOfRows)) {
            return false;
        }
        if (!Objects.equals(this.numberOfColumns, other.numberOfColumns)) {
            return false;
        }
        
        return true;
    }
    
    
    
}
