package Game;

import Controller.ChanceCardController;
import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;
public class StartField extends Field
{
    private int startBonus;
    public StartField(int positionID, String colorID, String name)
    {
        super(positionID, colorID, name);
        this.startBonus = 2;
    }
    public int getStartBonus()
    {
        return startBonus;
    }
    public String getName()
    {
        return name;
    }
    public void landOnField(FieldController FC, Player currentPlayer,Player[] Players, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray, ChanceCardController CC)
    {}
}
