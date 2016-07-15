/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.MapControl;
import byui.CIT260.Hogwarts.exceptions.MapControlException;
import byui.CIT260.Hogwarts.model.SymbolEnum;
import hogwarts.Hogwarts;
import byui.CIT260.Hogwarts.model.Character;

import java.awt.Point;

/**
 *
 * @author Mallory
 */
public class MoveToNewLocation extends View {

    public MoveToNewLocation() {
        super("\n Please enter the symbol of the location you would like to move to:");
    }

    @Override
    public boolean doAction(String value) {

        switch (value) {
            case "PMO":
                this.pmo();
                break;
            case "GD":
                this.gd();
                break;
            case "COS":
                this.cos();
                break;
            case "GrH":
                this.grh();
                break;
            case "BL":
                this.bl();
                break;
            case "CL":
                this.cl();
                break;
            case "S":
                this.s();
                break;
            case "L":
                this.l();
                break;
            case "HH":
                this.hh();
                break;
            case "FF":
                this.ff();
                break;
            case "PDO":
                this.pdo();
                break;
            case "H":
                this.h();
                break;
            case "GH":
                this.gh();
                break;
            case "QF":
                this.qf();
                break;
            case "GL":
                this.gl();
                break;
            case "HW":
                this.hw();
                break;
            case "FW":
                this.fw();
                break;
            case "ROR":
                this.ror();
                break;
            case "PSO":
                this.pso();
                break;
            case "sd":
                this.sd();
                break;
            case "D":
                this.d();
                break;
            case "G":
                this.g();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void pmo() {

        //match the symbol entered by the user to the point in SymbolEnum
        //Get the symbol from the SymbolEnum
        //get the character and pass in
        Point coordinates = SymbolEnum.PMO.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }

        //print out success message
        this.console.println("\n You have successfully moved to a new location!");

    }

    private void gd() {
        Point coordinates = SymbolEnum.GD.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void cos() {
       Point coordinates = SymbolEnum.COS.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void grh() {
       Point coordinates = SymbolEnum.GrH.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void bl() {
        Point coordinates = SymbolEnum.BL.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void cl() {
       Point coordinates = SymbolEnum.CL.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void s() {
        Point coordinates = SymbolEnum.S.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void l() {
       Point coordinates = SymbolEnum.L.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void hh() {
       Point coordinates = SymbolEnum.HH.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void ff() {
        Point coordinates = SymbolEnum.FF.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void pdo() {
        Point coordinates = SymbolEnum.PDO.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void h() {
        Point coordinates = SymbolEnum.H.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void gh() {
       Point coordinates = SymbolEnum.GH.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void qf() {
       Point coordinates = SymbolEnum.QF.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void gl() {
       Point coordinates = SymbolEnum.GL.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void hw() {
      Point coordinates = SymbolEnum.HW.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void fw() {
      Point coordinates = SymbolEnum.FW.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void ror() {
        Point coordinates = SymbolEnum.ROR.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void pso() {
        Point coordinates = SymbolEnum.PSO.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void sd() {
        Point coordinates = SymbolEnum.SD.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void d() {
       Point coordinates = SymbolEnum.D.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }

    private void g() {
       Point coordinates = SymbolEnum.G.getCoordinates();

        Character character = Hogwarts.getCurrentGame().getPlayer().getCharacter();

        try {
            MapControl.moveCharacter(character, coordinates);
        } catch (MapControlException ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
        //print out success message
        this.console.println("\n You have successfully moved to a new location!");
    }
}
