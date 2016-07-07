/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.exceptions.GameControlException;
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
                + "\n 1 - Gryffindor"
                + "\n 2 - Hufflepuff"
                + "\n 3 - Ravenclaw"
                + "\n 4 - Slytherin"
                + "\n 5 - Quit");
    }

    @Override
    public boolean doAction(String value) {

        Character[] characterList = Character.values();
        try {
            switch (value) {
                case "1":
                    int totalGryffindor = GameControl.totalInHouse(characterList, House.Gryffindor);
                    System.out.println("\n ***********************************************"
                            + "\n There are " + totalGryffindor + " characters in the Gryffindor House."
                            + "\n ***********************************************");
                    break;
                case "2":
                    int totalHufflepuff = GameControl.totalInHouse(characterList, House.Hufflepuff);
                    System.out.println("\n ***********************************************"
                            + "\n There are " + totalHufflepuff + " characters in the Hufflepuff House."
                            + "\n ***********************************************");
                    break;
                case "3":
                    int totalRavenclaw = GameControl.totalInHouse(characterList, House.Ravenclaw);
                    System.out.println("\n ***********************************************"
                            + "\n There are " + totalRavenclaw + " characters in the Ravenclaw House."
                            + "\n ***********************************************");
                    break;
                case "4":
                    int totalSlytherin = GameControl.totalInHouse(characterList, House.Slytherin);
                    System.out.println("\n ***********************************************"
                            + "\n There are " + totalSlytherin + " characters in the Slytherin House."
                            + "\n ***********************************************");
                    break;
                case "5":
                    this.quit();
                    break;
                default:
                    System.out.println("\n*** Invalid selection *** Try again");
                    break;
            }
        } catch (GameControlException gce) {
            System.out.println(gce.getMessage());
            return false;
        }
        return false;
    }

    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

}
