/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.control.TaskControl;
import byui.CIT260.Hogwarts.exceptions.TaskControlException;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author rachelbarnes
 */
public class FirstTaskView extends View {

    public FirstTaskView() {

        super("\n-------------------------------------------------"
                + "\n |                First Task                   |"
                + "\n-------------------------------------------------"
                + "\n Welcome to the First Task of the Tournament!"
                + "\n Your task is to get past the dragon."
                + "\n The dragon is guarding a strange triangular chest"
                + "\n Inside the chest is something that will help you"
                + "\n in the next task!"
                + "\n--------------------------------------------------"
                + "\n Solve for the area of the top of the chest."
                + "\n The base is 2 feet and the height is 4 feet."
                + "\n Enter the area of the triangle.");
    }

    @Override
    public boolean doAction(String value) {
        
        
        //determine if value is between boundaries

        try {
            double solution = Double.parseDouble(value);
            TaskControl.checkArea(2, 4, solution);
        } catch (NumberFormatException nfe) {
            System.out.println("Letter is not a valid answer. ");
            return false;          
        } catch (TaskControlException tce) {
            System.out.println(tce.getMessage());
            return false;
        } 
        //boolean answer = TaskControl.checkArea(2, 4, solution);
        //if not between boundaries then 
        //if (answer == false) {
        //    System.out.println("\n Answer is incorrect. Try again.");
        //    return false;
        //}
        //else {
        System.out.println("\n Success! You were able to open the chest."
                + "\n Inside you find a golden egg.");

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        //}
        //display error message and return false
        //else (between boundaries) then
        //display success message and return true
        return true;

    }
}
