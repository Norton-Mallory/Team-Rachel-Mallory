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
public class GameMenuView extends View {
    
    public GameMenuView() {
       super(    "\n-------------------------------------------"
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
               + "\n-------------------------------------------"
               + "\n Please enter a valid value");
    }
    
    @Override
    public boolean doAction(String gameMenuOption) {
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
        FirstTaskView firstTask = new FirstTaskView();
        firstTask.display();
    }

    private void secondTask() {
        SecondTaskView secondTask = new SecondTaskView();
        secondTask.display();
    }

    private void thirdTask() {
        ThirdTaskView thirdTask = new ThirdTaskView();
        thirdTask.display();
    }

    private void moveToNewLocation() {
        System.out.println("\n*** moveToNewLocation() function called  ***");
    }

    private void viewNumberOfCoinsCollected() {
        CoinsCollectedView coinsCollected = new CoinsCollectedView();
        coinsCollected.display();
    }

    private void viewListOfToolsAcquired() {
        System.out.println("\n*** viewListOfToolsAcquired() function called  ***");
    }

    private void numberOfCoinsNeeded() {
        NumberOfCoinsNeeded numberOfCoinsNeeded = new NumberOfCoinsNeeded();
        numberOfCoinsNeeded.display();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called  ***");
    }

    private void help() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void quit() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    

   

    
}
