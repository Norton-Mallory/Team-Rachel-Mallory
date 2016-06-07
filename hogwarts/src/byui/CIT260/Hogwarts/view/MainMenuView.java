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
 * @author Mallory
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {

        this.menu = "\n---------------------------------------------"
                + "\n| Main Menu                                 |"
                + "\n---------------------------------------------"
                + "\n1 - Start game"
                + "\n2 - Restart existing game"
                + "\n3 - Help menu"
                + "\n4 - Save game"
                + "\n5 - Exit"
                + "\n---------------------------------------------"
                + "\n Please enter a valid value";
    }

    public void displayMainMenuView() {

        boolean notExit = true;
        do {
            // display then menu and get the menu option
            String menuOption = this.getMenuOption();
            
            if (menuOption.equals("5")) {
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
                this.startGame();
                break;
            case "2":
                this.restartExistingGame();
                break;
            case "3":
                this.helpMenu();
                break;
            case "4":
                this.saveGame();
                break;
            case "5":
                this.exit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startGame() {
        GameControl.createNewGame(Hogwarts.getPlayer());
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.displayHouseMenuView();
    }

    private void restartExistingGame() {
        System.out.println("*** restartExistingGame function called ***");
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void exit() {
        System.out.println("*** exit function called ***");
    }
}
