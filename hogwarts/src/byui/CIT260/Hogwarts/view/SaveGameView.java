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
public class SaveGameView extends View {

    public SaveGameView() {
        super("\nEnter the file path where you would like to "
              + "save the game");
    }

    @Override
    public boolean doAction(String value) {
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(Hogwarts.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        return true;
    }
    
    
    
}
