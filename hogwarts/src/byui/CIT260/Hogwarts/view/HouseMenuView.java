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
public class HouseMenuView extends View {
   
    
   public HouseMenuView() {

        super(      "\n-----------------------------"
                  + "\n |       House Menu        |"
                  + "\n-----------------------------"
                  + "\n 1 - Gryffindor"
                  + "\n 2 - Slytherin"
                  + "\n 3 - Hufflepuff"
                  + "\n 4 - Ravenclaw"
                  + "\n 5 - Main Menu"
                  + "\n-----------------------------"
                  + "\n Please enter a valid value");
    }
   
   @Override
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
        gryffindorCharacter.display();
    }

    private void slytherin() {
        SlytherinCharacterView slytherinCharacter = new SlytherinCharacterView();
        slytherinCharacter.display(); 
       
    }

    private void hufflepuff() {
        HufflepuffCharacterView hufflepuffCharacter = new HufflepuffCharacterView();
        hufflepuffCharacter.display(); 
    }

    private void ravenclaw() {
        RavenclawView ravenclawCharacter = new RavenclawView();
        ravenclawCharacter.display();
    }

    private void mainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    
}