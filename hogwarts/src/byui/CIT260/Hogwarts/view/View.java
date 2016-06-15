/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import java.util.Scanner;

/**
 *
 * @author rachelbarnes
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
     public void display() {

        boolean done = false;
        do {
            // display the menu and get the menu option
            String value = this.getInput();
            
            if (value.equals("Q")) {
                done = true;
                break;
            }
            
            // perform the command (action) for the menu option selected
            done = this.doAction(value);
        } while (!done);

    }
     @Override
     public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {

            System.out.println("\n" + this.displayMessage);
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

}
