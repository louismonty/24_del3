package Game;

import Controller.ChanceCardController;
import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

public class CustomField extends Field
{


    public CustomField(int positionID, String colorID, String name)
    {
        super(positionID, colorID,name);
    }
    public String getName()
    {
        return name;
    }
    public void landOnField(FieldController fieldController, Player currentPlayer, Player[] playerArray, GUIController guiController, GUI_Player guiPlayer, GUI_Player[] guiPlayerArray, ChanceCardController chanceCardController)
    {}

}
