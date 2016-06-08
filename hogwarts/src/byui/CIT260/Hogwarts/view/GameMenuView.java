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
public class GameMenuView {
    private String promptMessage;
    private String game;
    public GameMenuView() {
       this.promptMessage = ("\n Please enter a valid value");
       this.game = ("\n"
               + "\n-------------------------------------------"
               + "\n | Game Menu                             | "
               + "\n-------------------------------------------"
               + "\n 1 - View map"
               + "\n 2 - First task"
               + "\n 3 - Second task"
               + "\n 4 - Third task"
               + "\n 5 - Move to new location"
               + "\n 6 - View number of coins collected"
               + "\n 7 - View list of tools acquired"
               + "\n 8 - Number of coins needed for each task"
               + "\n 9 - Save game"
               + "\n 10 - Help"
               + "\n 11 - Quit"
               + "\n-------------------------------------------");
    }
     public void displayGameMenu() {
        System.out.println("\n" + this.game);
        boolean done = false;
        do {
        // prompt for and get the game menu option
        String gameMenuOption = this.getGameMenuOption();
           
        // do the requested action and display the next view
        done = this.doAction(gameMenuOption);  
    } while (!done);
    }
   
    private String getGameMenuOption() {
      Scanner keyboard = new Scanner(System.in);
      String value = "";
      boolean valid = false;
      
      
      //while a vaild name has not been retrieved
      while(!valid){
          System.out.println("\n" + this.promptMessage);
          //get the value entered from the keyboard
          value = keyboard.nextLine();
          value = value.trim();
          
          if (value.length() < 1) { //blank value entered
          System.out.println("\n Invalid selection *** Try again");
          continue;
          }
          break;
      }
      return value;  
    }
    
    
    private boolean doAction(String gameMenuOption) {
        switch(gameMenuOption){
            case "1":
                this.viewMap();
                break;
            case "2":
                this.firstTask();
                break;
            case "3":
                this.secondTask();
                break;
            case "4":
                this.thirdTask();
                break;
            case "5":
                this.moveToNewLocation();
                break;
            case "6":
                this.viewNumberOfCoinsCollected();
                break;
            case "7":
                this.viewListOfToolsAcquired();
                break;
            case "8":
                this.numberOfCoinsNeeded();
                break;
            case "9":
                this.saveGame();
                break;
            case "10":
                this.help();
                break;
            case "11":
                this.quit();
                break;
             default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void viewMap() {
        System.out.println("\n*** viewMap() function called  ***");
    }

    private void firstTask() {
        System.out.println("\n*** firstTaskCalled() function called  ***");
    }

    private void secondTask() {
        System.out.println("\n*** secondTaskCalled() function called  ***");
    }

    private void thirdTask() {
        System.out.println("\n*** thirdTask() function called  ***");
    }

    private void moveToNewLocation() {
        System.out.println("\n*** moveToNewLocation() function called  ***");
    }

    private void viewNumberOfCoinsCollected() {
        System.out.println("\n*** viewNumberOfCoinsCollected() function called  ***");
    }

    private void viewListOfToolsAcquired() {
        System.out.println("\n*** viewListOfToolsAcquired() function called  ***");
    }

    private void numberOfCoinsNeeded() {
        System.out.println("\n*** numberOfCoindNeeded() function called  ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called  ***");
    }

    private void help() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void quit() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMainMenuView();
    }

    

   

    
}
