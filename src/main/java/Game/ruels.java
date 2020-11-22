package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

import java.awt.*;

public class ruels {
    public void afterRuels(Player currentPlayer){
        //start ruelse changes player position
        if(currentPlayer.getPlayerPosition()>=24){
            currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()+2);
            currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition()-24);
    }
    }
    public boolean win(Player currentPlayer,GUIController GC){
        if(currentPlayer.getPlayerAccount().getBalance() <0){
            // den med flest penge vinder
            GC.showMessege(currentPlayer.getPlayerName()+"  lost");
        return false;
        }
        return true;
    }

    public void propertyField(FieldController FC, Player currentPlayer, GUIController GC, GUI_Player player,GUI_Player[] PlayerArray){
        PropertyField cf =(PropertyField) FC.getGameboard()[currentPlayer.getPlayerPosition()];
        if(!cf.getIsPropertyBought()){
            GC.showMessege("du købte "+cf.getName());
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
            GC.showMessege("du skal betale penge til"+cf.getOwner());
            currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()-cf.getPrice());
            cf.getOwner().getPlayerAccount().setBalance(cf.getOwner().getPlayerAccount().getBalance()+cf.getRent());
            GC.updatePlayerBal(cf.getOwner().getPlayerAccount().getBalance(),PlayerArray[cf.getOwner().getPlayerId()]);
        }
    }
}
