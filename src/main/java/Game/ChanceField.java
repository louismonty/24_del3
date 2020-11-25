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

    public void landOnField(FieldController FC, Player currentPlayer,Player[] Players, GUIController GC, GUI_Player player, GUI_Player[] PlayerArray, ChanceCardController CC)
    {
    ChanceCard currentChanceCard = CC.drawChanceCard();
    CC.executeChanceCard(FC,currentPlayer,Players,GC,player,PlayerArray,currentChanceCard);

    }
}
