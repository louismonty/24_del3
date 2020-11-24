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
        if(currentPlayer.getHasGetOutOfJailCard()==false)
        {
            currentPlayer.getPlayerAccount().SubtractBalance(1);
        }
    }
    public void landOnField(FieldController FC, Player currentPlayer, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray)
    {}
}
