package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

public abstract class Field
{
    protected int positionID;
    protected String colorID;
    protected String name;
    public Field(int positionID, String colorID, String name)
    {
        this.positionID = positionID;
        this.colorID = colorID;
        this.name = name;
    }
    public abstract void landOnField(FieldController FC, Player currentPlayer,Player[] Players, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray);
}
