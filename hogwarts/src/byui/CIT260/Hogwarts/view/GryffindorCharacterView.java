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
public class GryffindorCharacterView {
   
    private String promptMessage;
    private String gryffindor;

    public GryffindorCharacterView() {
        this.promptMessage = ("\n Please enter a valid value");
        this.gryffindor = ("\n--------------------------"
                          +"\n 1 - Harry Potter"
                          +"\n 2 - Ron Weasley"
                          +"\n 3 - Hermione Granger"
                          +"\n 4 - Ginny Weasley"
                          +"\n 5 - Neville Longbottom"
                          +"\n 6 - Fred Weasley"
                          +"\n 7 - George Weasley"
                          +"\n 8 - Quit"
                          +"\n--------------------------");
    }
     public void displayGryffindorCharacterView() {
        System.out.println("\n" + this.gryffindor);
        boolean done = false;
        do {
        // prompt for and get the game menu option
        String GryffindorCharacterOption = this.getGryffindorCharacterOption();
           
        // do the requested action and display the next view
        done = this.doAction(GryffindorCharacterOption);  
    } while (!done);
    }

    private String getGryffindorCharacterOption() {
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

    private boolean doAction(String gryffindorCharacterOption) {
      
        switch(gryffindorCharacterOption){
            case "1":
                this.harryPotter();
                break;
            case "2":
                this.ronWeasley();
                break;
            case "3":
                this.hermioneGranger();
                break;
            case "4":
                this.ginnyWeasley();
                break;
            case "5":
                this.nevilleLongbottom();
                break;
            case "6":
                this.fredWeasley();
                break;
            case "7":
                this.georgeWeasley();
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

    private void harryPotter() {
        
        System.out.println("\n Welcome to the Quad Wizard Tournament Harry. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void ronWeasley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Ron. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void hermioneGranger() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Hermione. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void ginnyWeasley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Ginny. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void nevilleLongbottom() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Neville. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void fredWeasley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Fred. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void georgeWeasley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament George. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.displayHouseMenuView();
    }

    
    

}
