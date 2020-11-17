package Game;
import Controller.*;
import gui_fields.GUI_Player;

import java.awt.*;



public class Gameloop {
    public static DiceController Dc = new DiceController();
public static FieldController FC = new FieldController();
public static GUIController GC = new GUIController();
public static PlayerController PC = new PlayerController();
public static Menu Mn = new Menu();
public static ruels rl = new ruels();
private static boolean isGameRunning = true;
private static int roll;
public static void gameloop(){
    Player[] playerArray;
    int newPlayerPosition;
    PC.setPlayerArray(Mn.AddPlayer());
    FC.createGameBoardFields();
    FC.createChanceCardDeck();
    Player currentPlayer = PC.getCurrentPlayer();
    GUI_Player[] GuiPlayers = GC.createplayer(PC.getPlayerArray());
    while(isGameRunning){
        currentPlayer = PC.getCurrentPlayer();
        GC.oneButton("its"+" "+currentPlayer.getPlayerName()+" "+"to roll click roll","roll");
        Dc.diceRoll();
        roll = Dc.diceValue();
        GC.showDice(roll);
        newPlayerPosition = (currentPlayer.getPlayerPosition()+roll)%24;
        GC.movePlayer(currentPlayer.getPlayerPosition(),roll,GuiPlayers[currentPlayer.getPlayerId()]);
        currentPlayer.setPlayerPosition(newPlayerPosition);
        if(GC.isInstanceOfField(currentPlayer.getPlayerPosition())){
            rl.propertyField(FC,currentPlayer,GC,GuiPlayers[currentPlayer.getPlayerId()]);
        }
        GuiPlayers[currentPlayer.getPlayerId()].setBalance(currentPlayer.getPlayerAccount().getBalance());
        if(currentPlayer.getPlayerAccount().getBalance() <0){
            GC.showMessege(currentPlayer.getPlayerName()+"  lost");
            isGameRunning = false;
        }
        PC.NextPlayer();


    }

}
    public static void main(String[] args){
    gameloop();
    }

}
