/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

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
                  "\n********************************************************"
                + "\n*                                                      *"
                + "\n* This is the game of The Quad Wizard Tournament.      *"
                + "\n* In this game you will take on 3 different tasks      *"
                + "\n* to win the tournament. You will take on the role     *"
                + "\n* of a Harry Potter character of your choosing.        *"
                + "\n*                                                      *"
                + "\n* You start the game by collecting coins and           *"
                + "\n* tools. Coins are needed for you to unlock and        *"
                + "\n* successfully complete all three tasks. Each          *"
                + "\n* task has a designated amount of coins needed         *"
                + "\n* to unlock it. Tools are optional to collect,         *"
                + "\n* but are highly recommended.                          *"
                + "\n* Coins and tools can be found in various location     *"
                + "\n* at Hogwarts. You will need to explore Hogwarts       *"
                + "\n* in order to collect both coins and tools.            *"
                + "\n*                                                      *"
                + "\n* Beware that during your search, you will             *"                          + "\n* encounter various obstacles. Once an obstacle is overcome "
                + "\n* you may or may not receive a message asking you      *"
                + "\n* if you would like to collect a coin or tool.         *"
                + "\n* In some cases, obstacles will not have coins or      *"
                + "\n* tools to be collected once overcome.                 *"
                + "\n                                                       *" 
                + "\n* Once you have successfully completed all three tasks,*"
                + "\n* you will have won the Quad-Wizard tournament.        *"
                + "\n* Good luck!                                           *"
                + "\n*                                                      *"
                + "\n********************************************************"
        );
    }
}
