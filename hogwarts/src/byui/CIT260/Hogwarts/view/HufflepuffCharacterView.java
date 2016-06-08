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
class HufflepuffCharacterView {
    private String promptMessage;
    private String hufflepuff;

    public HufflepuffCharacterView() {
        this.promptMessage = ("\n Please enter a valid value");
        this.hufflepuff = ("\n*****************************"
                          +"\n 1 - Cedric Diggory"
                          +"\n 2 - Zacharias Smith"
                          +"\n 3 - Justin Finch-Fletchley"
                          +"\n 4 - Hannah Longbottom"
                          +"\n 5 - Ernie Macmillan"
                          +"\n 6 - Susan Bones"
                          +"\n 7 - Anthony Otterburn"
                          +"\n 8 - Quit"
                          +"\n*****************************");
    }
     public void displayHufflepuffCharacterView() {
        System.out.println("\n" + this.hufflepuff);
        boolean done = false;
        do {
        // prompt for and get the game menu option
        String HufflepuffCharacterOption = this.getHufflepuffCharacterOption();
           
        // do the requested action and display the next view
        done = this.doAction(HufflepuffCharacterOption);  
    } while (!done);
    }

    private String getHufflepuffCharacterOption() {
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

    private boolean doAction(String hufflepuffCharacterOption) {
      
        switch(hufflepuffCharacterOption){
            case "1":
                this.cedricDiggory();
                break;
            case "2":
                this.zachariasSmith();
                break;
            case "3":
                this.justinFinchFletchley();
                break;
            case "4":
                this.hannahLongbottom();
                break;
            case "5":
                this.ernieMacmillan();
                break;
            case "6":
                this.susanBones();
                break;
            case "7":
                this.anthonyOtterburn();
                break;
            case "8":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void cedricDiggory() {
        
        System.out.println("\n Welcome to the Quad Wizard Tournament Cedric. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void zachariasSmith() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Zacharias. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void justinFinchFletchley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Justin. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void hannahLongbottom() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Hannah. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void ernieMacmillan() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Ernie. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void susanBones() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Susan. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void anthonyOtterburn() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Anthony. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }
    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.displayHouseMenuView();
    }
}
