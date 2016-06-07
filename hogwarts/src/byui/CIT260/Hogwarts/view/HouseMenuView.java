/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author rachelbarnes
 */
public class HouseMenuView {
    private String menu; 
    
   public HouseMenuView() {

        this.menu = "\n---------------------------------------------"
                  + "\n| House Menu                                |"
                  + "\n---------------------------------------------"
                  + "\n1 - Gryffindor"
                  + "\n2 - Slytherin"
                  + "\n3 - Hufflepuff"
                  + "\n4 - Ravenclaw"
                  + "\n5 - Main Menu"
                  + "\n---------------------------------------------"
                  + "\n Please enter a valid value";
    }

    public void displayHouseMenuView() {

        boolean notExit = true;
        do {
            // display then menu and get the menu option
            String menuOption = this.getMenuOption();
            
            if (menuOption.equals("6")) {
                notExit = false;
                break;
            }
            
            
            // perform the command (action) for the menu option selected
            notExit = this.doAction(menuOption);
        } while (notExit);

    }

    private String getMenuOption() {

        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {

            System.out.println("\n" + this.menu);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n Invalid value: value cannot be blank");
                continue;

            }

            valid = true;
        }
        return value;

    }

    public boolean doAction(String choice) {

        switch (choice) {
            case "1":
                this.gryffindor();
                break;
            case "2":
                this.slytherin();
                break;
            case "3":
                this.hufflepuff();
                break;
            case "4":
                this.ravenclaw();
                break;
            case "5":
                this.mainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void gryffindor() {
        GryffindorCharacterView gryffindorCharacter = new GryffindorCharacterView();
        gryffindorCharacter.displayGryffindorCharacterView();
    }

    private void slytherin() {
        SlytherinCharacterView slytherinCharacter = new SlytherinCharacterView();
        slytherinCharacter.displaySlytherinCharacterView(); 
       
    }

    private void hufflepuff() {
        HufflepuffCharacterView hufflepuffCharacter = new HufflepuffCharacterView();
        hufflepuffCharacter.displayHufflepuffCharacterView(); 
    }

    private void ravenclaw() {
        RavenclawView ravenclawCharacter = new RavenclawView();
        ravenclawCharacter.displayRavenclawCharacterView();
    }

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMainMenuView();
    }
    
    
}