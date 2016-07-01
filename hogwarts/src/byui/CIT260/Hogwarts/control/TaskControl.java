/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import byui.CIT260.Hogwarts.exceptions.TaskControlException;

/**
 *
 * @author rachelbarnes
 */
public class TaskControl {

    public static double calcAreaOfTriangle(double base, double height) throws TaskControlException{
        if (height <= 0){
            throw new TaskControlException("Height is less than or equal to 0.");
        }
        if (base <= 0 || base > 36){
            throw new TaskControlException("Base is out of bounds.");
        }

        double area = (base * height) / 2;

        return area;
    }

    public static boolean checkArea(double base, double height, double solution) throws TaskControlException {
        //calculate area of triangle
        double area = TaskControl.calcAreaOfTriangle(base, height);
                
        
        //if successful, check solution equals area 
        if (area == solution) {
            return true;
        }
        else {
            throw new TaskControlException("Solution is incorrect.");
        }
    }
    
    public static double calcAreaOfCylinder(double radius, double height) throws TaskControlException {
      if (radius <= 0){
          throw new TaskControlException("Radius is less than or equal to 0.");
      }
      if (height <= 0 || height > 28){
          throw new TaskControlException("Height is out of bounds.");
      }
  
      double area = Math.round((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2))); 
      
      return area;

    }
    public static boolean checkCylinderArea(double radius, double height, double solution) throws TaskControlException {
        //calculate area of Cylinder
        double area = TaskControl.calcAreaOfCylinder(radius, height);
                
        if (area == solution) {
            return true;
        }
        throw new TaskControlException("Solution is incorrect!");
    }

    public static double solveForX(double x) throws TaskControlException {

        if (x <= 0) { 
            throw new TaskControlException("Number is less than 0.");
        }
        
        if (x >= 20) {
            throw new TaskControlException("Number is greater than 20. Out of bounds.");
        }

        double solution = x * x - (2 * x) + 1;  
        
        return solution;

    }
    
    public static boolean checkSolveForX(double x, double input) throws TaskControlException {
        //calculate area of Cylinder
        double check = TaskControl.solveForX(x);
                
        if (check == input) {
            return true;
        }
        throw new TaskControlException("Solution is incorrect. Try again.");
    }
}
