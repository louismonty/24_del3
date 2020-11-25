package Game;

import Controller.ChanceCardController;
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
    public abstract void landOnField(FieldController fieldController, Player currentPlayer, Player[] playerArray, GUIController guiController, GUI_Player guiPlayer, GUI_Player[] guiPlayerArray, ChanceCardController chanceCardController);
}
