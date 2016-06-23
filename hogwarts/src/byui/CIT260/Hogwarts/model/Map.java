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
    private double numberOfRows;
    private double numberOfColumns;
    private String name;
    private Map[][] maps;
    

    public Map() {
    }
    
    public double getNumberOfRows() {
        return numberOfRows;
    }

    /**
     *
     * @param numberOfRows
     */
    public void setNumberOfRows(double numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public double getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(double numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map[][] getMaps() {
        return maps;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.numberOfRows);
        hash = 53 * hash + Objects.hashCode(this.numberOfColumns);
        hash = 53 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + ", name=" + name + '}';
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
