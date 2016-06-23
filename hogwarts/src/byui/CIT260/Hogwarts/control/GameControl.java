/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Item;
import byui.CIT260.Hogwarts.model.ItemEnum;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Player;
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
    
}