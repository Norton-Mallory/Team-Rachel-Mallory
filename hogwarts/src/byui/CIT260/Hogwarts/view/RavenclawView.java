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
public class RavenclawView extends View {

    public RavenclawView() {
        super("\n----------------------------"
                + "\n |    Ravenclaw Menu     | "
                + "\n----------------------------"
                + "\n 1 - Luna Lovegood"
                + "\n 2 - Cho Chang"
                + "\n 3 - Roger Davies"
                + "\n 4 - Michael Corner"
                + "\n 5 - Padma Patil"
                + "\n 6 - Terry Boot"
                + "\n 7 - Quit"
                + "\n----------------------------"
                + "\n Please enter a valid value");
    }

    @Override
    public boolean doAction(String ravenclawCharacterOption) {

        switch (ravenclawCharacterOption) {
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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;

        }
        return false;
    }

    private void lunaLovegood() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Luna_Lovegood);
        this.console.println("\n Welcome to the Quad Wizard Tournament Luna. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void choChang() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Cho_Chang);
        this.console.println("\n Welcome to the Quad Wizard Tournament Cho. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void rogerDavies() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Roger_Davies);
        this.console.println("\n Welcome to the Quad Wizard Tournament Roger. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void michaelCorner() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Michael_Corner);
        this.console.println("\n Welcome to the Quad Wizard Tournament Michael. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void padmaPatil() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Padma_Patil);
        this.console.println("\n Welcome to the Quad Wizard Tournament Padma. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void terryBoot() {
        Hogwarts.getCurrentGame().getPlayer().setCharacter(Character.Terry_Boot);
        this.console.println("\n Welcome to the Quad Wizard Tournament Terry. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
    }

}
