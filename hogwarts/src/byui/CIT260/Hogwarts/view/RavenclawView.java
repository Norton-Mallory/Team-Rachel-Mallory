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
public class RavenclawView {
    private String promptMessage;
    private String ravenclaw;

    public RavenclawView() {
        this.promptMessage = ("\n Please enter a valid value");
        this.ravenclaw = ( "\n-------------------------"
                          +"\n 1 - Luna Lovegood"
                          +"\n 2 - Cho Chang"
                          +"\n 3 - Roger Davies"
                          +"\n 4 - Michael Corner"
                          +"\n 5 - Padma Patil"
                          +"\n 6 - Terry Boot"
                          +"\n 7 - Quit"
                          +"\n-------------------------");
    }
     public void displayRavenclawCharacterView() {
        System.out.println("\n" + this.ravenclaw);
        boolean done = false;
        do {
        // prompt for and get the game menu option
        String RavenclawCharacterOption = this.getRavenclawCharacterOption();
           
        // do the requested action and display the next view
        done = this.doAction(RavenclawCharacterOption);  
    } while (!done);
    }

    private String getRavenclawCharacterOption() {
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

    private boolean doAction(String ravenclawCharacterOption) {
      
        switch(ravenclawCharacterOption){
            case "1":
                this.lunaLovegood();
                break;
            case "2":
                this.choChang();
                break;
            case "3":
                this.rogerDavies();
                break;
            case "4":
                this.michaelCorner();
                break;
            case "5":
                this.padmaPatil();
                break;
            case "6":
                this.terryBoot();
                break;
            case "7":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void lunaLovegood() {
        
        System.out.println("\n Welcome to the Quad Wizard Tournament Luna. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void choChang() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Cho. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void rogerDavies() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Roger. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void michaelCorner() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Michael. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void padmaPatil() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Padma. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }

    private void terryBoot() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Terry. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenu();
    }
    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.displayHouseMenuView();
    }
   
}