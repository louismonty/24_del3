package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

import java.awt.*;

public class ruels {
    public void propertyField(FieldController FC, Player currentPlayer, GUIController GC, GUI_Player player){
        PropertyField cf =(PropertyField) FC.getGameboard()[currentPlayer.getPlayerPosition()];
        if(!cf.getIsPropertyBought()){
            if( currentPlayer.getPlayerAccount().getBalance() > cf.getPrice()){
                GC.makeOwner(currentPlayer.getPlayerPosition(),player.getPrimaryColor());
                cf.setOwner(currentPlayer);
                cf.setIsPropertyBought(true);
                currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()-cf.getPrice());
            }
        }
        else if(cf.getOwner().equals(currentPlayer)) {
            //
        }
        else{
            currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()-cf.getPrice());
        }
    }
}
