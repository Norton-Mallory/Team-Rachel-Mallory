/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.model;

import static byui.CIT260.Hogwarts.model.ItemEnum.coins;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mallory
 */
public class Location implements Serializable{
    //class instance variables
    private int row;
    private int column;
    private boolean visited;
    private double amountRemaining;
    private String coins;
    
    private Item[] items;
    private Scene scene;
    private ArrayList<Character> characters;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public String getCoins() {
        return coins;
    }

    public void setCoins(String coins) {
        this.coins = coins;
    }

   

    public Item[] getItems() {
        return items;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.row);
        hash = 47 * hash + Objects.hashCode(this.column);
        hash = 47 * hash + Objects.hashCode(this.visited);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.amountRemaining) ^ (Double.doubleToLongBits(this.amountRemaining) >>> 32));
        hash = 47 * hash + Objects.hashCode(this.coins);
        
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.coins, other.coins)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", coins=" + coins +  '}';
    }
    
    
    
}
