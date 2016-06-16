/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import byui.CIT260.Hogwarts.model.Player;

/**
 *
 * @author rachelbarnes
 */
public class GameControl {
    

    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        return player;
       
     

        
    }  
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function ***");
    }
    public static void saveCharacter (String name){
        System.out.println("\n*** saveCharacterCalled stub function ***");
    }
}