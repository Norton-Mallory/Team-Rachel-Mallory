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
public class ThirdTaskView {
    
    private String third;

    public ThirdTaskView() {
        this.third= 
                 "\n---------------------------------------------"
                +"\n |   Welcome to the Third Task    |"
                +"\n---------------------------------------------"
                +"\n For this task you need to"
                +"\n locate a cylinder shaped chest"
                +"\n inside of a maze. Once you have "
                +"\n located the chest you will need"
                +"\n to solve the given equation in"
                +"\n order to get out of the maze and "
                +"\n complete this task."
                +"\n Good luck!"
                +"\n----------------------------------------------"
                +"\n Solve the area of the cylinder."
                +"\n The radius is 8 and the height is 10."
                +"\n Round your answer to the nearest whole number."
                +"\n Enter your answer below: ";
       
                 
        
    }
    

   public void displayThirdTaskView() {
       boolean done = false;
        do {
            // display then menu and get the menu option
            String solution = this.getSolution();
            
            if (solution.equals("Q")) {
                done = true;
                break;
            }
            
            done = this.doAction(solution);
        } while (!done);
        
   
   } 

    private String getSolution() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {

            System.out.println("\n" + this.third);
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n Invalid value: value cannot be blank");
                continue;

            }

            valid = true;
        }
        return value;
    }

    private boolean doAction(String value) {
        double solution = Double.parseDouble(value);
        //determine if value is between boundaries
        boolean answer = TaskControl.checkCylinderArea(8, 10, solution);
        //if not then:
        if (answer == false) {
            System.out.println("\n Answer is incorrect. Try again.");
            return false;
        }
        else {
            System.out.println("\n Success! The cylinder has been opened."
                    + "\n Inside is the Quad Wizard Tournament trophy. "
                    + "\n Congratulations, you have won the game!");
            
           
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.displayGameMenu();
    
        }
             
    return true;
    
    
    }
    }

