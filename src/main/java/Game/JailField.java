package Game;

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
    public void landOnField(FieldController FC, Player currentPlayer,Player[] Players, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray)
    {
        goToJail(currentPlayer);
        GC.showMessege("du kommer i fængslet");
        GC.movePlayer(18,12,player);
    }
}
