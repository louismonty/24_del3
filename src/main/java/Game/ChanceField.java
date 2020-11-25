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

    public void landOnField(FieldController fieldController, Player currentPlayer,Player[] Players, GUIController guiController, GUI_Player player, GUI_Player[] PlayerArray, ChanceCardController chanceCardController)
    {
    ChanceCard currentChanceCard = chanceCardController.drawChanceCard();
    chanceCardController.executeChanceCard(fieldController,currentPlayer,Players,guiController,player,PlayerArray,currentChanceCard);
    if(currentChanceCard.isMove){
        fieldController.getGameboard()[currentPlayer.getPlayerPosition()%24].landOnField(fieldController, currentPlayer, Players, guiController, player, PlayerArray,chanceCardController);
    }

    }
}
