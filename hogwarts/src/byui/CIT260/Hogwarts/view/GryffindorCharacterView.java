/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import hogwarts.Hogwarts;
import java.util.Scanner;
import byui.CIT260.Hogwarts.model.Character;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.model.SymbolEnum;
import java.awt.Point;

/**
 *
 * @author Mallory
 */
public class GryffindorCharacterView extends View {

    public GryffindorCharacterView() {
        super("\n---------------------------"
                + "\n |   Gryffindor Menu     |"
                + "\n---------------------------"
                + "\n 1 - Harry Potter"
                + "\n 2 - Ron Weasley"
                + "\n 3 - Hermione Granger"
                + "\n 4 - Ginny Weasley"
                + "\n 5 - Neville Longbottom"
                + "\n 6 - Fred Weasley"
                + "\n 7 - George Weasley"
                + "\n 8 - Quit"
                + "\n---------------------------"
                + "\n Please enter a valid value");
    }

    @Override
    public boolean doAction(String gryffindorCharacterOption) {

        switch (gryffindorCharacterOption) {
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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;

        }
        return false;
    }

    private void harryPotter() {

        Player player = Hogwarts.getCurrentGame().getPlayer();
        player.setCharacter(Character.Harry);

        this.console.println("\n Welcome to the Quad Wizard Tournament Harry. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void ronWeasley() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Ron);
        this.console.println("\n Welcome to the Quad Wizard Tournament Ron. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void hermioneGranger() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Hermione);
        this.console.println("\n Welcome to the Quad Wizard Tournament Hermione. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void ginnyWeasley() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Ginny);
        this.console.println("\n Welcome to the Quad Wizard Tournament Ginny. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void nevilleLongbottom() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Neville);
        this.console.println("\n Welcome to the Quad Wizard Tournament Neville. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void fredWeasley() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Fred);
        this.console.println("\n Welcome to the Quad Wizard Tournament Fred. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void georgeWeasley() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.George);
        this.console.println("\n Welcome to the Quad Wizard Tournament George. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
    }

}
