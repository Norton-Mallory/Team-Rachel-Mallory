/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.TaskControl;
import byui.CIT260.Hogwarts.exceptions.TaskControlException;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class SecondTaskView extends View {

    public SecondTaskView() {

        super("\n----------------------------------------------"
                + "\n  |              Second Task                |"
                + "\n----------------------------------------------"
                + "\n Welcome to the Second Task of the Tournament!"
                + "\n Your task is to swim to the bottom of the Black Lake."
                + "\n Your friend is being held captive by mermaids"
                + "\n In order to free your friend, you must solve an equation."
                + "\n "
                + "\n---------------------------------------------"
                + "\n Solve, if x = 1"
                + "\n x^2-2x+1"
                + "\n Enter the value:");
    }

    @Override
    public boolean doAction(String value) {

        //determine if value is between boundaries
        //boolean answer = TaskControl.checkSolveForX(1, solution);
        try {
            double solution = Double.parseDouble(value);
            TaskControl.checkSolveForX(1, solution);
        } catch (NumberFormatException nfe) {
            System.out.println("Letter is not a valid answer. ");
            return false;
        } catch (TaskControlException tce) {
            System.out.println(tce.getMessage());
            return false;
        }
        //if not between boundaries then 
        //if (answer == false) {
        //    System.out.println("\n Answer is incorrect. Try again.");
        //    return false;
        //}
        //else {
        System.out.println("\n Success! You made it past the mermaids"
                + "\n and rescued your friend.");

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        //display error message and return false
        //else (between boundaries) then
        //display success message and return true
        return true;

    }

}
