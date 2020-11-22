package Game;

import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

import java.awt.*;

public class Rules {
        public void afterRules(Player currentPlayer,GUIController GC){
            //start rules changes player position
            if(currentPlayer.getPlayerPosition()>=24){
                currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()+2);
                currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition()-24);
                GC.showMessege("du får 2 m for at komme over start");
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
    }
