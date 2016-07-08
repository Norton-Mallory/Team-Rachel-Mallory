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
public class StartProgramView extends View {


    public StartProgramView() {
        super("\nPlease enter your name:");
        this.displayBanner();
    }

    private void displayBanner() {
        this.console.println(
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
                + "\n*                                                          *"
                + "\n* Once you have successfully completed all three tasks,    *"
                + "\n* you will have won the Quad-Wizard tournament.            *"
                + "\n* Good luck!                                               *"
                + "\n*                                                          *"
                + "\n************************************************************"
        );
    }

    @Override
    public boolean doAction(String playersName) {

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
            ErrorView.display(this.getClass().getName(),"\n Invalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }

        Player player = GameControl.createPlayer(playersName);

        if (player == null) {
            ErrorView.display(this.getClass().getName(),"\n Error creating the player.");
            return false;
        }

        this.displayNextView(player);
        return true;
        

    }
    

    private void displayNextView(Player player) {
        this.console.println("\n========================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n=========================================");
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
   
}
