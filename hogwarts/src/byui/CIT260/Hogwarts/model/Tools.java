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
public class Tools implements Serializable {
    //class instance variables
    private String function;

    public Tools() {
    }
    

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.function);
        return hash;
    }

    @Override
    public String toString() {
        return "Tools{" + "function=" + function + '}';
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
        final Tools other = (Tools) obj;
        if (!Objects.equals(this.function, other.function)) {
            return false;
        }
        return true;
    }
    
    
    
}
