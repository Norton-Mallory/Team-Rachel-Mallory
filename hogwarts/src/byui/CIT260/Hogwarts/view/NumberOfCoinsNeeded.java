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
public class NumberOfCoinsNeeded extends View {

    public NumberOfCoinsNeeded() {
        super(    "\n---------------------------------------"
                + "\n Here are the number of coins you will"
                + "\n need to collect before you can attempt"
                + "\n a task:"
                + "\n Task 1 - 5 coins"
                + "\n Task 2 - 10 coins"
                + "\n Task 3 - 15 coins"
                + "\n---------------------------------------"
                + "\n 1 - Quit"
                + "\n---------------------------------------");
    }
    @Override
    public boolean doAction(String numberOfCoinsOption) {
        switch(numberOfCoinsOption){
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
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}