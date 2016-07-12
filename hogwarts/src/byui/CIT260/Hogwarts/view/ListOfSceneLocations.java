/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import byui.CIT260.Hogwarts.exceptions.GameControlException;
import byui.CIT260.Hogwarts.exceptions.MapControlException;
import hogwarts.Hogwarts;

/**
 *
 * @author Mallory
 */
public class ListOfSceneLocations extends View {

    public ListOfSceneLocations() {

        super("\n Enter in a file path to save the report to: ");
    }

    @Override
    public boolean doAction(String filePath) {

        try {
            GameControl.listOfSceneLocations(filePath);
            this.console.println("\n You have successfully saved the report!");
        } catch (GameControlException gce) {
            ErrorView.display("GameMenuView", gce.getMessage());
        }
        return true;
    }
}