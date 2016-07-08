/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

/**
 *
 * @author Mallory
 */
public class HowToMoveView extends View {

    public HowToMoveView() {
        super(    "\n------------------------------------------"
                + "\n In order to move around on the "
                + "\n map and visit different locations"
                + "\n you will need to enter in certain"
                + "\n commands on the key board. The "
                + "\n commands are as follows:"
                + "\n d - Move down"
                + "\n u - Move up"
                + "\n l - Move left"
                + "\n r - Move right"
                + "\n Upon entering in one of the following"
                + "\n commands, the computer will move you"
                + "\n one space in the designated direction."
                + "\n To speed up your movement you can enter "
                + "\n one of the above commands followed by a"
                + "\n number. For example if you enter in 'd5' "
                + "\n you will be moved down 5 spaces."
                + "\n------------------------------------------"
                + "\n 1 - Quit"
                + "\n------------------------------------------");
    }
    @Override
    public boolean doAction(String howToMoveOption) {
        switch(howToMoveOption){
            case "1":
                this.quit();
                break;
             default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break; 
           
        }
        return false;
        }

    private void quit() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
