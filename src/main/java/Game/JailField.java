package Game;

import Controller.ChanceCardController;
import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

public class JailField extends Field
{
    private int bail;

    public JailField(int positionID, String colorID, String name)
    {
        super(positionID, colorID, name);
        bail = 1;
    }
    public String getName()
    {
        return name;
    }
    public void goToJail(Player currentPlayer)
    {
        currentPlayer.setPlayerPosition(6);
        currentPlayer.setIsInJail(true);
        if(currentPlayer.getHasGetOutOfJailCard()==false)
        {
            currentPlayer.getPlayerAccount().subtractBalance(1);
        }
    }
    public void landOnField(FieldController fieldController, Player currentPlayer, Player[] playerArray, GUIController guiController, GUI_Player guiPlayer, GUI_Player[] guiPlayerArray, ChanceCardController chanceCardController)
    {
        goToJail(currentPlayer);
        guiController.showMessege("du kommer i fængslet");
        guiController.movePlayer(18,12, guiPlayer);
    }
}
