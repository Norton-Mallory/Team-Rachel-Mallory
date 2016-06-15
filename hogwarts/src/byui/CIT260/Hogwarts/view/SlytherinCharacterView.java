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
public class SlytherinCharacterView extends View {

    public SlytherinCharacterView() {
        super("\n Please enter a valid value"
                          +"\n------------------------"
                          +"\n 1 - Draco Malfoy"
                          +"\n 2 - Gregory Goyle"
                          +"\n 3 - Vincent Crabbe"
                          +"\n 4 - Terence Higgs"
                          +"\n 5 - Marcus Flint"
                          +"\n 6 - Blaise Zabini"
                          +"\n 7 - Pansy Parkinson"
                          +"\n 8 - Quit"
                          +"\n-----------------------");
    }
    
    @Override
     public boolean doAction(String slytherinCharacterOption) {
      
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
        gameMenu.display();
    }

    private void gregoryGoyle() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Gregory. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void vincentCrabbe() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Vincent. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void terenceHiggs() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Terence. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void marcusFlint() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Marcus. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void blaiseZabini() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Blaise. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pansyParkinson() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Pansy. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

     private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
    }
    
}
