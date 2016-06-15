/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.model.Player;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name:";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                  "\n************************************************************"
                + "\n*                                                          *"
                + "\n* This is the game of The Quad Wizard Tournament.          *"
                + "\n* In this game you will take on 3 different tasks          *"
                + "\n* to win the tournament. You will take on the role         *"
                + "\n* of a Harry Potter character of your choosing.            *"
                + "\n*                                                          *"
                + "\n* You start the game by collecting coins and               *"
                + "\n* tools. Coins are needed for you to unlock and            *"
                + "\n* successfully complete all three tasks. Each              *"
                + "\n* task has a designated amount of coins needed             *"
                + "\n* to unlock it. Tools are optional to collect,             *"
                + "\n* but are highly recommended.                              *"
                + "\n* Coins and tools can be found in various location         *"
                + "\n* at Hogwarts. You will need to explore Hogwarts           *"
                + "\n* in order to collect both coins and tools.                *"
                + "\n*                                                          *"
                + "\n* Beware that during your search, you will                 *"
                + "\n* encounter various obstacles. Once an obstacle is overcome*"
                + "\n* you may or may not receive a message asking you          *"
                + "\n* if you would like to collect a coin or tool.             *"
                + "\n* In some cases, obstacles will not have coins or          *"
                + "\n* tools to be collected once overcome.                     *"
                + "\n                                                           *"
                + "\n* Once you have successfully completed all three tasks,    *"
                + "\n* you will have won the Quad-Wizard tournament.            *"
                + "\n* Good luck!                                               *"
                + "\n*                                                          *"
                + "\n************************************************************"
        );
    }

    public void displayStartProgramView() {

        /**
         * displayView(): void BEGIN do Prompt for and get the players name if
         * (playersName == “Q”) then exit
         *
         * do the action and display the next view while the action is not
         * successful END
         */
        boolean done = false; //set flag to not done
        do {
            //promt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("5")) //user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {
        /**
         * getInput(): value BEGIN WHILE a valid value has not been entered
         * DISPLAY a message prompting the user to enter a value GET the value
         * entered from keyboard Trim front and trailing blanks off of the value
         * IF the length of the value is blank THEN DISPLAY “Invalid value: The
         * value cannot be blank” CONTINUE END IF BREAK ENDWHILE RETURN value
         * END
         *
         */

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n Invalid value: value can not be blank");
                continue;

            }

            break;
        }
        return value;

    }

    private boolean doAction(String playersName) {

        /**
         * doAction(playersName): boolean BEGIN if the length of the playersName < 2 then
         * display “Invalid name: The name must be > 1 character” return false
         *
         * create Player with specified name if unsuccessful then display
         * “Invalid name: The name is too short” return false display customized
         * welcome message display mainMenuView return true END
         *
         */
        if (playersName.length() < 2) {
            System.out.println("\n Invalid players name: "
                    + "The name must be greater than on echaracter in length");
            return false;
        }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            System.out.println("\n Error creating the player.");
            return false;
        }

        this.displayNextView(player);
        return true;
        

    }
    

    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n=========================================");
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
   
}
