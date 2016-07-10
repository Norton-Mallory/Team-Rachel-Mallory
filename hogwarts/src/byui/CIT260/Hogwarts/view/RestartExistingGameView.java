/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.GameControl;

/**
 *
 * @author rachelbarnes
 */
public class RestartExistingGameView extends View {

    public RestartExistingGameView() {
        super("Restart Existing Game");
    }

    @Override
    public boolean doAction(String value) {
        
        
        String filePath = this.getInput();
        
        try {
            GameControl.getRestartExistingGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
    } return true;
    
    
    
}
}
