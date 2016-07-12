/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;
import hogwarts.Hogwarts;

/**
 *
 * @author rachelbarnes
 */
public class ItemLocationList extends View {

    public ItemLocationList() {
        super("\nEnter the file path where you would like to "
                + "print the list.");
    }

    @Override
    public boolean doAction(String value) {
        try {
            GameControl.itemLocation(value);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        this.console.println("\n Successfully printed list.");
        return true;
    }

}
