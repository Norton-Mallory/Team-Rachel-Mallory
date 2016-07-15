/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.MapControl;
import byui.CIT260.Hogwarts.exceptions.MapControlException;
import byui.CIT260.Hogwarts.model.SymbolEnum;
import hogwarts.Hogwarts;
import byui.CIT260.Hogwarts.model.Character;

import java.awt.Point;


/**
 *
 * @author Mallory
 */
public class MoveToNewLocation extends View {

    public MoveToNewLocation() {
        super("\n Please enter the symbol of the location you would like to move to:");
    }

    @Override
    public boolean doAction(String value) {

        switch (value) {
            case "PMO":
                this.pmo();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void pmo() {
      
            //match the symbol entered by the user to the point in SymbolEnum
            //Get the symbol from the SymbolEnum
            //get the character and pass in
        Point coordinates = SymbolEnum.PMO.getCoordinates();
        
        
        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();
            
        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage() );
        }
            
            
           
            
            //print out success message
            this.console.println("\n You have successfully moved to a new location!");
       
    }
}
