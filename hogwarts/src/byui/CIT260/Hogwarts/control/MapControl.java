/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.control;

import static byui.CIT260.Hogwarts.control.MapControl.createScenes;
import byui.CIT260.Hogwarts.exceptions.MapControlException;
import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Location;
import byui.CIT260.Hogwarts.model.Map;
import byui.CIT260.Hogwarts.model.Character;
import byui.CIT260.Hogwarts.model.Scene;
import byui.CIT260.Hogwarts.model.SceneType;
import hogwarts.Hogwarts;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author rachelbarnes
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
        //create the map
        Map map = new Map(5, 5);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to locations
        assignScenesToLocations(map, scenes);

        return map;
    }

    public static Scene[] createScenes() throws MapControlException {

        Scene[] scenes = new Scene[SceneType.values().length];

        if (scenes == null || SceneType.values().length == 0) {
            throw new MapControlException("Invalid scenes");
        }

        Scene mcgonagallOfficeScene = new Scene();
        mcgonagallOfficeScene.setDescription("Professor McGonagall's office");
        mcgonagallOfficeScene.setMapSymbol("PMO");
        mcgonagallOfficeScene.setBlocked(false);
        scenes[SceneType.mcgonagall_office.ordinal()] = mcgonagallOfficeScene;

        Scene classroomScene = new Scene();
        classroomScene.setDescription("an empty classroom");
        classroomScene.setMapSymbol("CL");
        classroomScene.setBlocked(false);
        scenes[SceneType.classroom.ordinal()] = classroomScene;

        Scene dumbledoreOfficeScene = new Scene();
        dumbledoreOfficeScene.setDescription("Professor Dumbledore's Office");
        dumbledoreOfficeScene.setMapSymbol("PDO");
        dumbledoreOfficeScene.setBlocked(false);
        scenes[SceneType.dumbledore_office.ordinal()] = dumbledoreOfficeScene;

        Scene girlsLavatoryScene = new Scene();
        girlsLavatoryScene.setDescription("the girl's bathroom");
        girlsLavatoryScene.setMapSymbol("GL");
        girlsLavatoryScene.setBlocked(false);
        scenes[SceneType.girls_lavatory.ordinal()] = girlsLavatoryScene;

        Scene roomOfRequirementScene = new Scene();
        roomOfRequirementScene.setDescription("The room of Requirement");
        roomOfRequirementScene.setMapSymbol("ROR");
        roomOfRequirementScene.setBlocked(false);
        scenes[SceneType.room_of_requirement.ordinal()] = roomOfRequirementScene;

        Scene gryffindorDormitoryScene = new Scene();
        gryffindorDormitoryScene.setDescription("The Gryffindor Dormitory");
        gryffindorDormitoryScene.setMapSymbol("GD");
        gryffindorDormitoryScene.setBlocked(false);
        scenes[SceneType.gryffindor_dormitory.ordinal()] = gryffindorDormitoryScene;

        Scene stairwayScene = new Scene();
        stairwayScene.setDescription("Stairway");
        stairwayScene.setMapSymbol("S");
        stairwayScene.setBlocked(false);
        scenes[SceneType.stairway.ordinal()] = stairwayScene;

        Scene hallwayScene = new Scene();
        hallwayScene.setDescription("hallway");
        hallwayScene.setMapSymbol("H");
        hallwayScene.setBlocked(false);
        scenes[SceneType.hallway.ordinal()] = hallwayScene;

        Scene hospitalWingScene = new Scene();
        hospitalWingScene.setDescription("Hospital Wing");
        hospitalWingScene.setMapSymbol("HW");
        hospitalWingScene.setBlocked(false);
        scenes[SceneType.hospital_wing.ordinal()] = hospitalWingScene;

        Scene snapeOfficeScene = new Scene();
        snapeOfficeScene.setDescription("Professor Snape's Office");
        snapeOfficeScene.setMapSymbol("PSO");
        snapeOfficeScene.setBlocked(false);
        scenes[SceneType.snape_office.ordinal()] = snapeOfficeScene;

        Scene chamberOfSecretsScene = new Scene();
        chamberOfSecretsScene.setDescription("The Chamber of Secrets");
        chamberOfSecretsScene.setMapSymbol("COS");
        chamberOfSecretsScene.setBlocked(false);
        scenes[SceneType.chamber_of_secrets.ordinal()] = chamberOfSecretsScene;

        Scene libraryScene = new Scene();
        libraryScene.setDescription("The library");
        libraryScene.setMapSymbol("L");
        libraryScene.setBlocked(false);
        scenes[SceneType.library.ordinal()] = libraryScene;

        Scene greatHallScene = new Scene();
        greatHallScene.setDescription("The Great Hall");
        greatHallScene.setMapSymbol("GH");
        greatHallScene.setBlocked(false);
        scenes[SceneType.great_hall.ordinal()] = greatHallScene;

        Scene slytherinDormitoryScene = new Scene();
        slytherinDormitoryScene.setDescription("The Slytherin Dormitory");
        slytherinDormitoryScene.setMapSymbol("SD");
        slytherinDormitoryScene.setBlocked(false);
        scenes[SceneType.slytherin_dormitory.ordinal()] = slytherinDormitoryScene;

        Scene greenHousesScene = new Scene();
        greenHousesScene.setDescription("The Green Houses");
        greenHousesScene.setMapSymbol("GrH");
        greenHousesScene.setBlocked(false);
        scenes[SceneType.green_houses.ordinal()] = greenHousesScene;

        Scene hagridsHutScene = new Scene();
        hagridsHutScene.setDescription("Hagrids Hut");
        hagridsHutScene.setMapSymbol("HH");
        hagridsHutScene.setBlocked(false);
        scenes[SceneType.hagrids_hut.ordinal()] = hagridsHutScene;

        Scene quidditchFieldScene = new Scene();
        quidditchFieldScene.setDescription("Quidditch Field");
        quidditchFieldScene.setMapSymbol("QF");
        quidditchFieldScene.setBlocked(false);
        scenes[SceneType.quidditch_field.ordinal()] = quidditchFieldScene;

        Scene dungeonScene = new Scene();
        dungeonScene.setDescription("Dungeon");
        dungeonScene.setMapSymbol("D");
        dungeonScene.setBlocked(false);
        scenes[SceneType.dungeon.ordinal()] = dungeonScene;

        Scene blackLakeScene = new Scene();
        blackLakeScene.setDescription("The Black Lake");
        blackLakeScene.setMapSymbol("BL");
        blackLakeScene.setBlocked(false);
        scenes[SceneType.black_lake.ordinal()] = blackLakeScene;

        Scene forbiddenForestScene = new Scene();
        forbiddenForestScene.setDescription("The Forbidden Forest Scene");
        forbiddenForestScene.setMapSymbol("FF");
        forbiddenForestScene.setBlocked(false);
        scenes[SceneType.forbidden_forest.ordinal()] = forbiddenForestScene;

        Scene frontWalkScene = new Scene();
        frontWalkScene.setDescription("The front walk");
        frontWalkScene.setMapSymbol("FW");
        frontWalkScene.setBlocked(false);
        scenes[SceneType.front_walk.ordinal()] = frontWalkScene;

        Scene gardenScene = new Scene();
        gardenScene.setDescription("The gardens");
        gardenScene.setMapSymbol("G");
        gardenScene.setBlocked(false);
        scenes[SceneType.garden.ordinal()] = gardenScene;

        return scenes;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) throws MapControlException {
        if (scenes == null || map == null) {
            throw new MapControlException("Invalid map");

        }
        Location[][] locations = map.getLocations();

        //start point
        locations[0][0].setScene(scenes[SceneType.mcgonagall_office.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.gryffindor_dormitory.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.chamber_of_secrets.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.green_houses.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.black_lake.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.classroom.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.stairway.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.library.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.hagrids_hut.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.forbidden_forest.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.dumbledore_office.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.great_hall.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.quidditch_field.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.forbidden_forest.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.girls_lavatory.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.hospital_wing.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.classroom.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.hallway.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.front_walk.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.room_of_requirement.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.snape_office.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.slytherin_dormitory.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.dungeon.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.garden.ordinal()]);

    }

    static void moveActorsToStartingLocation(Map map) throws MapControlException {

        if (map == null) {
            throw new MapControlException("Invalid map");
        } else {
            System.out.println("\n *** moveActors() function called ***");
        }
    }

    public static void moveCharacter(Character character, Point coordinates) throws MapControlException {
       if (character == null || coordinates == null) {
           throw new MapControlException("Character cannot be null");
        }

        Point currentCoordinates = character.getCoordinates();
        Location[][] locations = Hogwarts.getCurrentGame().getMap().getLocations();

        int row = currentCoordinates.x;
        int column = currentCoordinates.y;

        if (row < 0 || row > 4) {
            throw new MapControlException("Out of bounds coordinates");
        }
        if (column < 0 || column > 4) {
            throw new MapControlException("Out of bounds coordinates");
        }

        Location current = locations[row][column];

        current.getCharacters().remove(character);

        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        Location newLocation = locations[newRow][newColumn];

        newLocation.getCharacters().add(character);

        currentCoordinates.x = newRow;
        currentCoordinates.y = newColumn;

       
    }
}
