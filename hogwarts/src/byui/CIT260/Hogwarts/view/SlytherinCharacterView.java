/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import java.util.Scanner;
import byui.CIT260.Hogwarts.model.Character;
import hogwarts.Hogwarts;
/**
 *
 * @author Mallory
 */
public class SlytherinCharacterView extends View {

    public SlytherinCharacterView() {
        super(             "\n---------------------------"
                          +"\n |    Slytherin Menu     | "
                          +"\n---------------------------"
                          +"\n 1 - Draco Malfoy"
                          +"\n 2 - Gregory Goyle"
                          +"\n 3 - Vincent Crabbe"
                          +"\n 4 - Terence Higgs"
                          +"\n 5 - Marcus Flint"
                          +"\n 6 - Blaise Zabini"
                          +"\n 7 - Pansy Parkinson"
                          +"\n 8 - Quit"
                          +"\n---------------------------"
                          +"\n Please enter a valid value");
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void dracoMalfoy() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Draco_Malfoy);
        this.console.println("\n Welcome to the Quad Wizard Tournament Draco. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void gregoryGoyle() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Gregory_Goyle);
        this.console.println("\n Welcome to the Quad Wizard Tournament Gregory. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void vincentCrabbe() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Vincent_Crabbe);
        this.console.println("\n Welcome to the Quad Wizard Tournament Vincent. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void terenceHiggs() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Terence_Higgs);
        this.console.println("\n Welcome to the Quad Wizard Tournament Terence. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void marcusFlint() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Marcus_Flint);
       this.console.println("\n Welcome to the Quad Wizard Tournament Marcus. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void blaiseZabini() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Blaise_Zabini);
        this.console.println("\n Welcome to the Quad Wizard Tournament Blaise. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void pansyParkinson() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Pansy_Parkinson);
        this.console.println("\n Welcome to the Quad Wizard Tournament Pansy. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

     private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
    }
    
}
