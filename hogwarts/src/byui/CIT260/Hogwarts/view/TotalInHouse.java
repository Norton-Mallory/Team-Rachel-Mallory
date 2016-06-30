/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.model.Character;
import byui.CIT260.Hogwarts.model.House;

/**
 *
 * @author rachelbarnes
 */
public class TotalInHouse extends View {

    public TotalInHouse() {

        super("\n---------------------------------------------------------"
                + "\n |   How many characters are in a certain house?       |"
                + "\n---------------------------------------------------------"
                + "\n Choose a house to find out how many characters are in "
                + "\n that house."
                + "\n----------------------------------------------------------"
                + "\n Enter a valid house:"
                + "\n G - Gryffindor"
                + "\n H - Hufflepuff"
                + "\n R - Ravenclaw"
                + "\n S - Slytherin"
                + "\n Q - Quit");
    }

    @Override
    public boolean doAction(String value) {
        Character[] characterList = Character.values();

        switch (value) {
            case "G":
                int totalGryffindor = GameControl.totalInHouse(characterList, House.Gryffindor);
                System.out.println("\n ***********************************************"
                        + "\n There are " + totalGryffindor + " characters in the Gryffindor House."
                        + "\n ***********************************************");
                break;
            case "H":
                int totalHufflepuff = GameControl.totalInHouse(characterList, House.Hufflepuff);
                System.out.println("\n ***********************************************"
                        + "\n There are " + totalHufflepuff + " characters in the Hufflepuff House."
                        + "\n ***********************************************");
                break;
            case "R":
                int totalRavenclaw = GameControl.totalInHouse(characterList, House.Ravenclaw);
                System.out.println("\n ***********************************************"
                        + "\n There are " + totalRavenclaw + " characters in the Ravenclaw House."
                        + "\n ***********************************************");
                break;
            case "S":
                int totalSlytherin = GameControl.totalInHouse(characterList, House.Slytherin);
                System.out.println("\n ***********************************************"
                        + "\n There are " + totalSlytherin + " characters in the Slytherin House."
                        + "\n ***********************************************");
                break;
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

        // GameMenuView gameMenu = new GameMenuView();
        // gameMenu.display();
        // return true;
    }

    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
