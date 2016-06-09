/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.control.TaskControl;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author rachelbarnes
 */
public class FirstTaskView {
    private String message;

    public FirstTaskView() {

        this.message = "\n---------------------------------------------"
                + "\n| First Task                                 |"
                + "\n---------------------------------------------"
                + "\n Welcome to the First Task of the Tournament!"
                + "\n Your task is to get past the dragon."
                + "\n The dragon is guarding a strange triangular chest"
                + "\n Inside the chest is something that will help you"
                + "\n in the next task!"
                + "\n---------------------------------------------"
                + "\n Solve for the area of the top of the chest."
                + "\n The base is 2 feet and the height is 4 feet."
                + "\n Enter the area of the triangle.";
    }

    public void displayFirstTaskView() {

        boolean done = false;
        do {
            // display the menu and get the menu option
            String solution = this.getSolution();
            
            if (solution.equals("Q")) {
                done = true;
                break;
            }
            
            // perform the command (action) for the menu option selected
            done = this.doAction(solution);
        } while (!done);

    }

    private String getSolution() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {

            System.out.println("\n" + this.message);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n Invalid value: value cannot be blank");
                continue;

            }

            valid = true;
        }
        return value;

    }

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
       gameMenu.displayGameMenu();
    
        }
            //display error message and return false
            
        //else (between boundaries) then
            //display success message and return true
             
    return true;
    
    
    }
}

