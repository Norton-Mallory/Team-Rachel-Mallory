/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.CIT260.Hogwarts.model.House;
import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.model.Character;
import byui.CIT260.Hogwarts.model.Scene;
import byui.CIT260.Hogwarts.model.Location;
/**
 *
 * @author Mallory
 */
public class Hogwarts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //player
        Player playerOne = new Player();
       
        playerOne.setName("Harry");
        playerOne.setBestTime(5.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // house
        House houseOne = new House();
        
        houseOne.setName("Gryffindor");
        
        String houseInfo = houseOne.toString();
        System.out.println(houseInfo);
        
        //game
        Game gameOne = new Game();
        
        gameOne.setStartTime(4);
        gameOne.setEndTime(5);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Character
        Character characterOne = new Character();
        
        characterOne.setName("Ron");
        characterOne.setDescription("Son of Arthur and Molly Weasley");
        characterOne.setCoordinates("A3-D2");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        //scene
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("The Chamber of Secrets");
        sceneOne.setBlockedLocation("This location is blocked");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        //location
        Location locationOne = new Location();
        
        locationOne.setRow("2");
        locationOne.setColumn("3");
        locationOne.setVisited("Visited");
        locationOne.setAmountRemaining(8);
        locationOne.setCoins("This location has 1 coin");
        locationOne.setType("Wand");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    
    }
    
}
