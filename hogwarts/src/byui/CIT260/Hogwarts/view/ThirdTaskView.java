/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.TaskControl;
import byui.CIT260.Hogwarts.exceptions.TaskControlException;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class ThirdTaskView extends View {

    public ThirdTaskView() {
        super("\n-----------------------------------------------"
                + "\n     |   Welcome to the Third Task    |"
                + "\n-----------------------------------------------"
                + "\n For this task you need to"
                + "\n locate a cylinder shaped chest"
                + "\n inside of a maze. Once you have "
                + "\n located the chest you will need"
                + "\n to solve the given equation in"
                + "\n order to get out of the maze and "
                + "\n complete this task."
                + "\n Good luck!"
                + "\n-----------------------------------------------"
                + "\n Solve the area of the cylinder."
                + "\n The radius is 8 and the height is 10."
                + "\n Round your answer to the nearest whole number."
                + "\n Enter your answer below: ");

    }

    @Override
    public boolean doAction(String value) {

        //determine if value is between boundaries
        //boolean answer = TaskControl.checkCylinderArea(8, 10, solution);
        //if not then:
        try {
            double solution = Double.parseDouble(value);
            TaskControl.checkCylinderArea(8, 10, solution);
        } catch (NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(),"Letter is not a valid answer. ");
            return false;
        } catch (TaskControlException tce) {
            ErrorView.display(this.getClass().getName(),tce.getMessage());
            return false;
        }
       
        this.console.println("\n Success! The cylinder has been opened."
                + "\n Inside is the Quad Wizard Tournament trophy. "
                + "\n Congratulations, you have won the game!");

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

        return true;

    }
}
