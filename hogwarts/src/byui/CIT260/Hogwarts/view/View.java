/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import hogwarts.Hogwarts;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rachelbarnes
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = Hogwarts.getInFile();
    protected final PrintWriter console = Hogwarts.getOutFile();

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

        String value = "";
        boolean valid = false;

        try {
            while (!valid) {

                this.console.println("\n" + this.displayMessage);
                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(),"\n Invalid value: value cannot be blank");
                    continue;

                }

                valid = true;
            } 
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error reading input: " + e.getMessage());
        }
        return value;

    }

}
