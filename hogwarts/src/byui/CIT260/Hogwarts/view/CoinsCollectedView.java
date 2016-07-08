/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.CIT260.Hogwarts.view;

/**
 *
 * @author rachelbarnes
 */
public class CoinsCollectedView extends View {
    
    public CoinsCollectedView() {

        super("\n---------------------------------------------"
                + "\n| Coins Collected                              |"
                + "\n---------------------------------------------"
                + "\n You have collected _____ coins."
                + "\n---------------------------------------------"
                + "\n Enter 1 to return to the Game Menu.");
                
    }
    
    @Override
    public boolean doAction(String quitMenu) {
        switch (quitMenu){
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
