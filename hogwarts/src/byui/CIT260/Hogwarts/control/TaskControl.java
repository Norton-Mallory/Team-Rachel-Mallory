/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

/**
 *
 * @author rachelbarnes
 */
public class TaskControl {

    public double calcAreaOfTriangle(double base, double height) {

        if (height <= 0) {
            return -1;

        }

        if (base <= 0 || base > 36) {
            return -1;
        }
        double area = (base * height) / 2;

        return area;
    }

    public double calcAreaOfCylinder(double radius, double height) {

        if (radius <= 0) {
        return -1;
        }
        if (height <= 0 || height > 28){
        return -1;
        }
        
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2)); 
      
        return area;

    }

    public double solveForX(double x) {

        if (x <= 0) { 
            return -1;
        }
        
        if (x >= 20) {
            return -1;
        }

        double solution = x * x - (2 * x) + 1;  
        
        return solution;

    }


}
