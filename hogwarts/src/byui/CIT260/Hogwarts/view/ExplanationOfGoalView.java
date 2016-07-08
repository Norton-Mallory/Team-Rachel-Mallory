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
public class ExplanationOfGoalView extends View {
    
    public ExplanationOfGoalView() {

        super(    "\n---------------------------------------------------------"
                + "\n |                    Goal of Game                     |"
                + "\n---------------------------------------------------------"
                + "\n The object of the game is to collect coins which"
                + "\n will enable you to unlock tasks of the Tournament."
                + "\n Once all the tasks have been completed, you win the game!"
                + "\n----------------------------------------------------------"
                + "\n Enter 1 to return to the Help Menu.");
                
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
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
