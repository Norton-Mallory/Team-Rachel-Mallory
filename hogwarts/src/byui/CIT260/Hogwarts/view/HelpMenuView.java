/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class HelpMenuView extends View {
 
    public HelpMenuView() {
        super(      "\n------------------------------------"
                  + "\n |          Help Menu             |"
                  + "\n------------------------------------"
                  + "\n 1 - What is the goal of the game?"
                  + "\n 2 - How to move"
                  + "\n 3 - Game Menu"
                  + "\n 4 - Main Menu"
                  + "\n 5 - Quit"
                  + "\n------------------------------------"
                  + "\n Please enter a valid value");
    }

    @Override
    public boolean doAction(String helpOption) {
        switch (helpOption){
            case "1":
                this.goal();
                break;
            case "2":
                this.howToMove();
                break;
            case "3": 
                this.gameMenu();
                break;
            case "4":
                this.mainMenu();
                break;
            case "5":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        return false;
    }


    private void goal() {
        ExplanationOfGoalView goalView = new ExplanationOfGoalView();
        goalView.display();
    }

    private void howToMove() {
        HowToMoveView howToMove = new HowToMoveView();
        howToMove.display();
       
    }

    private void gameMenu() {
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void quit() {
      MainMenuView mainMenu = new MainMenuView();
      mainMenu.display();  
    }

   

    
}
