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

        try {
            GameControl.getRestartExistingGame(value);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        return true;

    }
}
