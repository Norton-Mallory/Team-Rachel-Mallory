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
public class HelpMenuView {
  private String promptMessage;
    private String help;
    public HelpMenuView() {
        this.promptMessage = "\n Please enter a valid value";
        this.help = "\n"
                  + "\n--------------------------"
                  + "\n | Help Menu             |"
                  + "\n--------------------------"
                  + "\n 1 - What is the goal of the game?"
                  + "\n 2 - How to move"
                  + "\n 3 - Game Menu"
                  + "\n 4 - Main Menu"
                  + "\n 5 - Quit"
                  + "\n--------------------------";
    }
    
    public void displayHelpMenu() {
        System.out.println("\n" + this.help);
       boolean done = false;
        do {
           
             String helpOption = this.getHelpOption();
           
            done = this.doAction(helpOption);
        } while (!done);
        
        
    }
     private String getHelpOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            
System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n Invalid value: value cannot be blank");
                continue;

            }

            break;
        }
        return value;

    }

    private boolean doAction(String helpOption) {
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
        System.out.println("\n*** goal() function called  ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() function called  ***");
       
    }

    private void gameMenu() {
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayGameMenu();
    }

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMainMenuView();
    }

    private void quit() {
      MainMenuView mainMenu = new MainMenuView();
      mainMenu.displayMainMenuView();  
    }

   

    
}
