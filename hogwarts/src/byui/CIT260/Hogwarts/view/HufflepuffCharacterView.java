/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

import java.util.Scanner;

/**
 *
 * @author Mallory
 */
class HufflepuffCharacterView extends View{
 

    public HufflepuffCharacterView() {
        super("\n Please enter a valid value"
                          +"\n-----------------------------"
                          +"\n 1 - Cedric Diggory"
                          +"\n 2 - Zacharias Smith"
                          +"\n 3 - Justin Finch-Fletchley"
                          +"\n 4 - Hannah Longbottom"
                          +"\n 5 - Ernie Macmillan"
                          +"\n 6 - Susan Bones"
                          +"\n 7 - Anthony Otterburn"
                          +"\n 8 - Quit"
                          +"\n-----------------------------");
    }
    
    @Override
    public boolean doAction(String hufflepuffCharacterOption) {
      
        switch(hufflepuffCharacterOption){
            case "1":
                this.cedricDiggory();
                break;
            case "2":
                this.zachariasSmith();
                break;
            case "3":
                this.justinFinchFletchley();
                break;
            case "4":
                this.hannahLongbottom();
                break;
            case "5":
                this.ernieMacmillan();
                break;
            case "6":
                this.susanBones();
                break;
            case "7":
                this.anthonyOtterburn();
                break;
            case "8":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
    }

    private void cedricDiggory() {
        
        System.out.println("\n Welcome to the Quad Wizard Tournament Cedric. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void zachariasSmith() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Zacharias. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void justinFinchFletchley() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Justin. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void hannahLongbottom() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Hannah. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void ernieMacmillan() {
       System.out.println("\n Welcome to the Quad Wizard Tournament Ernie. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void susanBones() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Susan. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void anthonyOtterburn() {
        System.out.println("\n Welcome to the Quad Wizard Tournament Anthony. Good Luck!");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    private void quit() {
        HouseMenuView houseMenu = new HouseMenuView();
        houseMenu.display();
    }
}
