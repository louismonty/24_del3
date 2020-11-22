package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

public class ChanceField extends Field
{
    public ChanceField(int positionID, String colorID, String name)
    {
        super(positionID, colorID, name);
    }
    public String getName()
    {
        return name;
    }
    public void landOnField(FieldController FC, Player currentPlayer, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray)
    {}
}
