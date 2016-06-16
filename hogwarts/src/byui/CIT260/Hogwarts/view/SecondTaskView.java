/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.TaskControl;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class SecondTaskView extends View {
    public SecondTaskView() {

        super( "\n---------------------------------------------"
                + "\n| First Task                                 |"
                + "\n---------------------------------------------"
                + "\n Welcome to the Second Task of the Tournament!"
                + "\n Your task is to swim to the bottom of the Black Lake."
                + "\n Your friend is being held captive by mermaids"
                + "\n In order to free your friend, you must solve an equation."
                + "\n "
                + "\n---------------------------------------------"
                + "\n Solve for X in the following equation"
                + "\n x^2-2x+1 = 0"
                + "\n Enter the value.");
    }
    @Override
    public boolean doAction(String value) {
        double solution = Double.parseDouble(value);
        //determine if value is between boundaries
        boolean answer = TaskControl.checkArea(2, 4, solution);
        //if not between boundaries then 
        if (answer == false) {
            System.out.println("\n Answer is incorrect. Try again.");
            return false;
        }
        else {
            System.out.println("\n Success! You were able to open the chest."
                + "\n Inside you find a golden egg.");
            
           
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    
        }
            //display error message and return false
            
        //else (between boundaries) then
            //display success message and return true
             
    return true;
    
    
    }
}
