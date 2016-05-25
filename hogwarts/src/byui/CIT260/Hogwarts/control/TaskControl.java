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
}
