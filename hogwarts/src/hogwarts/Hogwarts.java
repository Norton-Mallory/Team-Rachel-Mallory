/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Item;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.model.Tools;

/**
 *
 * @author Mallory
 */
public class Hogwarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
       
        playerOne.setName("Harry");
        playerOne.setBestTime(5.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Game gameOne = new Game();
        
        gameOne.setStartTime(4);
        gameOne.setEndTime(5);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Map mapOne = new Map();
        
        mapOne.setName("library");
        mapOne.setNumberOfColumns(3);
        mapOne.setNumberOfRows(2);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Item itemOne = new Item();
        
        itemOne.setInventoryType("Broomstick");
        itemOne.setQuantityInStock(1);
        itemOne.setRequiredAmount(1);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Tools toolBroom = new Tools();
        
        toolBroom.setFunction("This will enable you to fly around");
        
        String toolInfo = toolBroom.toString();
        System.out.println(toolBroom);
    }
    
}
