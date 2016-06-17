/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import byui.CIT260.Hogwarts.control.TaskControl;
import java.util.Scanner;

/**
 *
 * @author Mallory
 */
public class SecondTaskView extends View {
    public SecondTaskView() {

        super(    "\n----------------------------------------------"
                + "\n  |              Second Task                |"
                + "\n----------------------------------------------"
                + "\n Welcome to the Second Task of the Tournament!"
                + "\n Your task is to swim to the bottom of the "
                + "\n Black Lake. Your friend is being held captive"
                + "\n by mermaids. In order to free your friend, "
                + "\n you must solve an equation."
                + "\n----------------------------------------------"
                + "\n Solve for X in the following equation"
                + "\n x^2-2x+1 = 0"
                + "\n Enter the value 1");
    }
   @Override
    public boolean doAction(String quitMenu) {
        switch (quitMenu){
            case "1":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;    
        }
        return false;
    }
     
    private void quit() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
}
