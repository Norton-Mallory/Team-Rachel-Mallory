/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Item;
import byui.CIT260.Hogwarts.model.ItemEnum;
import byui.CIT260.Hogwarts.model.Location;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.model.Scene;
import byui.CIT260.Hogwarts.model.SceneType;
import hogwarts.Hogwarts;

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
        Game game = new Game();
        Hogwarts.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] itemList = GameControl.createItemList();
        game.setItems(itemList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }
    
    public static Item[] createItemList() {
        //create an array of items
        
        Item[] items = new Item[6];
        
        Item broomstick = new Item();
        broomstick.setInventoryType("Broomstick");
        broomstick.setQuantityInStock(1);
        broomstick.setRequiredAmount(1);
        items[ItemEnum.broomstick.ordinal()] = broomstick;
        
        Item wand = new Item();
        wand.setInventoryType("wand");
        wand.setQuantityInStock(1);
        wand.setRequiredAmount(1);
        items[ItemEnum.wand.ordinal()] = wand;
        
        Item gillyweed =  new Item();
        gillyweed.setInventoryType("Gillyweed");
        gillyweed.setQuantityInStock(1);
        gillyweed.setRequiredAmount(1);
        items[ItemEnum.gillyweed.ordinal()] = gillyweed;
        
        Item goldenEgg = new Item();
        goldenEgg.setInventoryType("Golden Egg");
        goldenEgg.setQuantityInStock(1);
        goldenEgg.setRequiredAmount(1);
        items[ItemEnum.golden_egg.ordinal()] = goldenEgg;
        
        Item coins = new Item();
        coins.setInventoryType("Coins");
        coins.setQuantityInStock(30);
        coins.setRequiredAmount(30);
        items[ItemEnum.coins.ordinal()] = coins;
        
        Item trophy = new Item();
        trophy.setInventoryType("Tournament Trophy");
        trophy.setQuantityInStock(1);
        trophy.setRequiredAmount(1);
        items[ItemEnum.trophy.ordinal()] = trophy;
        
        return null;
    }
   
    
    static void assignScenesToLocations(Map map, Scene[] scenes){
        Location [][] locations = map.getLocations();
        
        //start point
        
        locations[1][1].setScene(scenes[SceneType.mcgonagall_office.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.gryffindor_dormitory.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.chamber_of_secrets.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.green_houses.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.black_lake.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.classroom.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.stairway.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.library.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.hagrids_hut.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.forbidden_forest.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.dumbledore_office.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.great_hall.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.quidditch_field.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.forbidden_forest.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.girls_lavatory.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.hospital_wing.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.classroom.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.front_walk.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.room_of_requirement.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.snape_office.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.slytherin_dormitory.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.dungeon.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.garden.ordinal()]);

        
    }
}