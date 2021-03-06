/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class MainMenuView extends View {

   

    public MainMenuView() {
        super(      "\n---------------------------"
                  + "\n |       Main Menu        |"
                  + "\n---------------------------"
                  + "\n1 - Start game"
                  + "\n2 - Restart existing game"
                  + "\n3 - Help menu"
                  + "\n4 - Save game"
                  + "\n5 - Exit"
                  + "\n---------------------------"
                  + "\n Please enter a valid value");
    }

    @Override
    public boolean doAction(String choice){

        switch (choice){
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startGame() {
        try {
            GameControl.createNewGame(Hogwarts.getPlayer());
        } catch (MapControlException mce) {
            ErrorView.display(this.getClass().getName(),mce.getMessage());
        }
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
        
    }

    private void restartExistingGame() {
        
        RestartExistingGameView restartExistingGameMenu = new RestartExistingGameView();
        restartExistingGameMenu.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();
    }

    private void exit() {
        this.console.println("*** exit function called ***");
    }


   
    }

