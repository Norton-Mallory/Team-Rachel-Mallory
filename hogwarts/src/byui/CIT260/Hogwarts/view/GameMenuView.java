
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Item;
import byui.CIT260.Hogwarts.model.Location;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Scene;
import hogwarts.Hogwarts;
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
               + "\n 7 - View list of items needed"
               + "\n 8 - Total items"
               + "\n 9 - Number of coins needed"
               + "\n 10 - Save game"
               + "\n 11 - Help"
               + "\n 12 - Quit"
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
                this.viewListOfItems();
                break;
            case "8":
                 this.totalItems();
                 break;
            case "9":
                this.numberOfCoinsNeeded();
                break;
            case "10":
                this.saveGame();
                break;
            case "11":
                this.help();
                break;
            case "12":
                this.quit();
                break;
             default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void viewMap() {
       
        Game game = Hogwarts.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        
        System.out.println("-----------Hogwarts Map-------------");
        System.out.print(  "1     2      3      4      5");
        
        for (int row = 0; row < map.getNumberOfRows(); row++) {
            System.out.println("\n-----------------------------");
            System.out.println(row);
            for (int column = 0; column < map.getNumberOfColumns(); column++) {
                //create and initialize new location object instance
                System.out.print(" | ");
                Location location = locations[row][column];
                System.out.print(location.getScene().getMapSymbol());

          
            }
            System.out.println(" | ");
        }
        System.out.println("-------------------------------");
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

    private void viewListOfItems() {
        StringBuilder line;
        
        Game game = Hogwarts.getCurrentGame();
        Item[] items = game.getItems();
        
        System.out.println("\n     LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                               ");
        line.insert(0, "INVENTORY TYPE");
        line.insert(20, "QUANTITY IN STOCK");
        line.insert(40, "REQUIRED AMOUNT");
        System.out.println(line.toString());
        
        for (Item itemEnum : items) {
            line = new StringBuilder ("                          ");
            line.insert(0, itemEnum.getInventoryType());
            line.insert(23, itemEnum.getQuantityInStock());
            line.insert(33, itemEnum.getRequiredAmount());
            
            
            System.out.println(line.toString());
        }
        
        
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


    private void totalItems() {
        Game game = Hogwarts.getCurrentGame();
        
        Item[] item = game.getItems();
        
        int total = GameControl.totalItems(item);
        System.out.println(total);
    }

    

   

    
}
