/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwarts;

import byui.CIT260.Hogwarts.model.Game;
import byui.CIT260.Hogwarts.model.Player;
import byui.CIT260.Hogwarts.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mallory
 */
public class Hogwarts {

    private static Game currentGame = null;
    private static Player player = null;
    private static PrintWriter outFile = null;
    private static BufferedReader InFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create StartProgramView
        try {
            Hogwarts.InFile = new BufferedReader(new InputStreamReader(System.in));
            Hogwarts.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            Hogwarts.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println("Exception: " + te.toString()
                    + "\nCause: " + te.getCause()
                    + "\nMessage: " + te.getMessage());

            te.printStackTrace();

        } finally {
            try {
                if (Hogwarts.InFile != null) {
                    Hogwarts.InFile.close();
                }

                if (Hogwarts.outFile != null) {
                    Hogwarts.outFile.close();
                }

                if (Hogwarts.logFile != null) {
                    Hogwarts.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }

        }

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Hogwarts.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return InFile;
    }

    public static void setInFile(BufferedReader InFile) {
        Hogwarts.InFile = InFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Hogwarts.logFile = logFile;
    }
    
    

    public static Game getCreateMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
