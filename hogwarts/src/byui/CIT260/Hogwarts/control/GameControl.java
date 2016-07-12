/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import byui.CIT260.Hogwarts.exceptions.MapControlException;
import byui.CIT260.Hogwarts.exceptions.GameControlException;
import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.House;
import byui.CIT260.Hogwarts.model.Item;
import byui.CIT260.Hogwarts.model.ItemEnum;
import byui.CIT260.Hogwarts.model.Location;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.model.Scene;
import byui.CIT260.Hogwarts.model.SceneType;
import byui.CIT260.Hogwarts.model.Character;
import hogwarts.Hogwarts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author rachelbarnes
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlException {
        if (name == null) {
            throw new GameControlException("The name is null");
        }
        Player player = new Player();
        player.setName(name);
        return player;

    }

    public static int totalItems(Item[] items) throws GameControlException {

        if (items.length > 6) {

            throw new GameControlException("The length is greater than 6");
        }

        int total = 0;
        for (Item item : items) {

            total += 1;

        }

        return total;
    }

    public static int totalInHouse(Character[] character, House house) throws GameControlException {
        if (character == null) {
            throw new GameControlException("The character is null");
        }
        if (character.length == 0) {
            throw new GameControlException("The length cannot be equal to 0");
        }

        int total = 0;
        for (Character characters : character) {
            if (characters.getHouse() == house) {
                total++;
            }

        }
        return total;
    }

    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game();
        Hogwarts.setCurrentGame(game);

        game.setPlayer(player);

        Item[] itemList = GameControl.createItemList();
        game.setItems(itemList);

        Map map = MapControl.createMap();
        game.setMap(map);
        
        GameControl.assignItemsToLocations(map, itemList);

        MapControl.moveActorsToStartingLocation(map);
    }

    public static void saveGame(Game game, String filePath)
            throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getRestartExistingGame(String filePath)
            throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        Hogwarts.setCurrentGame(game);
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

        Item gillyweed = new Item();
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
        coins.setQuantityInStock(19);
        coins.setRequiredAmount(19);
        items[ItemEnum.coins.ordinal()] = coins;

        Item trophy = new Item();
        trophy.setInventoryType("Tournament Trophy");
        trophy.setQuantityInStock(1);
        trophy.setRequiredAmount(1);
        items[ItemEnum.trophy.ordinal()] = trophy;

        return items;
    }

    static void assignItemsToLocations(Map map, Item[] items) {

        Location[][] locations = map.getLocations();

        //start pointlocations[0][0].setScene(scenes[SceneType.mcgonagall_office.ordinal()]);
        locations[0][0].setItem(items[ItemEnum.coins.ordinal()]);
        locations[0][1].setItem(items[ItemEnum.broomstick.ordinal()]);
        locations[0][2].setItem(items[ItemEnum.wand.ordinal()]);
        locations[0][3].setItem(items[ItemEnum.gillyweed.ordinal()]);
        locations[0][4].setItem(items[ItemEnum.golden_egg.ordinal()]);
        locations[1][0].setItem(items[ItemEnum.coins.ordinal()]);
        locations[1][1].setItem(items[ItemEnum.trophy.ordinal()]);
        locations[1][2].setItem(items[ItemEnum.coins.ordinal()]);
        locations[1][3].setItem(items[ItemEnum.coins.ordinal()]);
        locations[1][4].setItem(items[ItemEnum.coins.ordinal()]);
        locations[2][0].setItem(items[ItemEnum.coins.ordinal()]);
        locations[2][1].setItem(items[ItemEnum.coins.ordinal()]);
        locations[2][2].setItem(items[ItemEnum.coins.ordinal()]);
        locations[2][3].setItem(items[ItemEnum.coins.ordinal()]);
        locations[2][4].setItem(items[ItemEnum.coins.ordinal()]);
        locations[3][0].setItem(items[ItemEnum.coins.ordinal()]);
        locations[3][1].setItem(items[ItemEnum.coins.ordinal()]);
        locations[3][2].setItem(items[ItemEnum.coins.ordinal()]);
        locations[3][3].setItem(items[ItemEnum.coins.ordinal()]);
        locations[3][4].setItem(items[ItemEnum.coins.ordinal()]);
        locations[4][0].setItem(items[ItemEnum.coins.ordinal()]);
        locations[4][1].setItem(items[ItemEnum.coins.ordinal()]);
        locations[4][2].setItem(items[ItemEnum.coins.ordinal()]);
        locations[4][3].setItem(items[ItemEnum.coins.ordinal()]);
        locations[4][4].setItem(items[ItemEnum.coins.ordinal()]);

    }

    public static void itemLocation(String filePath) throws GameControlException {
        try (PrintWriter pws = new PrintWriter(filePath)) {

            pws.println("\n             Item List                ");
            pws.printf("%n%-20s%10s%10s", "Item", "row", "column");
            pws.printf("%n%-20s%10s%10s", "--------", "----", "----");
            
            Location[][] locations = Hogwarts.getCurrentGame().getMap().getLocations();
            
            for (int i = 0; i < locations.length; i++) {
 
                for (int j = 0; j < locations[i].length; j++) {
                    
                    Location location  = locations[i][j];
                    String itemType = location.getItem().getInventoryType();
                    
                    pws.printf("%n%-20s%10s%10s", itemType, i, j);
                }
                
            }
            
                    
                    //filePath);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void listOfSceneLocations(String filePath) throws GameControlException {
        try (PrintWriter out = new PrintWriter(filePath)) {
           
            out.println("\n\n                   Scene Report           ");
            out.printf("%n%-30s%10s%10s", "Scene", "row", "column");
            out.printf("%n%-30s%10s%10s", "--------", "------", "--------");
 
            Location[][] locations = Hogwarts.getCurrentGame().getMap().getLocations();
            
               for (int i = 0; i < locations.length; i++) {
 
                for (int j = 0; j < locations[i].length; j++) {
                    
                    Location location  = locations[i][j];
                    String sceneType = location.getScene().getDescription();
                    
                    out.printf("%n%-30s%10s%10s", sceneType, i, j);
                }
                
            }
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
}
