package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;
import Controller.ChanceCardController;



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

    public void landOnField(FieldController fieldController, Player currentPlayer, Player[] playerArray, GUIController guiController, GUI_Player guiPlayer, GUI_Player[] guiPlayerArray, ChanceCardController chanceCardController)
    {
    ChanceCard currentChanceCard = chanceCardController.drawChanceCard();
    chanceCardController.executeChanceCard(fieldController,currentPlayer, playerArray,guiController, guiPlayer, guiPlayerArray,currentChanceCard);

    }
}
