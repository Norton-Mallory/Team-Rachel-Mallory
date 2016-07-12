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
    public boolean doAction(String value) {

        try {
            GameControl.listOfSceneLocations(value);
        } catch (GameControlException gce) {
            ErrorView.display(this.getClass().getName(), gce.getMessage());
        }
        return true;
    }
}