/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.view.StartProgramView;

/**
 *
 * @author Mallory
 */
public class Hogwarts {
    private static Game currentGame = null;
    private static Player player = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create StartProgramView
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Hogwarts.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Hogwarts.player = player;
    }
    
}
