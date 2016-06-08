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
public class SlytherinCharacterView {
     private String promptMessage;
    private String slytherin;

    public SlytherinCharacterView() {
        this.promptMessage = ("\n Please enter a valid value");
        this.slytherin = ("\n*****************************"
                          +"\n 1 - Draco Malfoy"
                          +"\n 2 - Gregory Goyle"
                          +"\n 3 - Vincent Crabbe"
                          +"\n 4 - Terence Higgs"
                          +"\n 5 - Marcus Flint"
                          +"\n 6 - Blaise Zabini"
                          +"\n 7 - Pansy Parkinson"
                          +"\n 8 - Quit"
                          +"\n*****************************");
    }
     public void displaySlytherinCharacterView() {
        System.out.println("\n" + this.slytherin);
        boolean done = false;
        do {
        // prompt for and get the game menu option
        String SlytherinCharacterOption = this.getSlytherinCharacterOption();
           
        // do the requested action and display the next view
        done = this.doAction(SlytherinCharacterOption);  
    } while (!done);
    }

    private String getSlytherinCharacterOption() {
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

    private boolean doAction(String slytherinCharacterOption) {
      
        switch(slytherinCharacterOption){
            case "1":
                this.dracoMalfoy();
                break;
            case "2":
                this.gregoryGoyle();
                break;
            case "3":
                this.vincentCrabbe();
                break;
            case "4":
                this.terenceHiggs();
                break;
            case "5":
                this.marcusFlint();
                break;
            case "6":
                this.blaiseZabini();
                break;
            case "7":
                this.pansyParkinson();
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

    private void dracoMalfoy() {
        
        System.out.println("\n Welcome to the Quad Wizard Tournament Draco. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void gregoryGoyle() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Gregory. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void vincentCrabbe() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Vincent. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void terenceHiggs() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Terence. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void marcusFlint() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Marcus. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void blaiseZabini() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Blaise. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void pansyParkinson() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Pansy. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

     private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.displayHouseMenuView();
    }
    
}
