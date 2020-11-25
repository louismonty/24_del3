package Game;

import Controller.ChanceCardController;
import Controller.FieldController;
import Controller.GUIController;
import Controller.PlayerController;
import gui_fields.GUI_Player;

import java.awt.*;

public class Rules {
        public void startRules(Player currentPlayer,GUIController guiController){
            //start rules changes player position
            if(currentPlayer.getPlayerPosition()>=24){
                currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()+2);
                currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition()-24);
                guiController.showMessege("du får 2 m for at komme over start");
            }
        }
        public void hasChanceCard(FieldController fieldController, Player currentPlayer,Player[] playerArray, GUIController guiController, GUI_Player guiPlayer,
                                  GUI_Player[] guiPlayerArray,ChanceCardController chanceCardController){
            if(currentPlayer.getHasChanceCard()){
                ChanceCard currentChanceCard = chanceCardController.drawChanceCard();
                chanceCardController.executeChanceCard(fieldController,currentPlayer, playerArray,guiController, guiPlayer, guiPlayerArray,currentChanceCard);
            }
        }
        public boolean win(Player currentPlayer, GUIController guiController,PlayerController playerController){
            if(currentPlayer.getPlayerAccount().getBalance() <0){
                // den med flest penge vinder
                guiController.showMessege(playerController.playerWithHighestBalance().getPlayerName()+"  won");
                return false;
            }
            return true;
        }
        public void startCardRule(GUIController guiController, Player currentPlayer, FieldController fieldController)
        {

            int felt = guiController.intigerInput("Vælg et felt som nummer",1, 25);
            currentPlayer.setPlayerPosition(felt-1);
            PropertyField field = ((PropertyField)fieldController.getGameboard()[currentPlayer.getPlayerPosition()]);
            if(field.getIsPropertyBought()==false)
            {
                field.setOwner(currentPlayer);
            }
            else
            {
                field.payRent(field, currentPlayer, field.getOwner());
            }
        }
    }
