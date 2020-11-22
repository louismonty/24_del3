package Game;
import Controller.*;
import gui_fields.GUI_Player;

import java.awt.*;



public class Gameloop {
    private static DiceController Dc = new DiceController();
private static FieldController FC = new FieldController();
private static GUIController GC = new GUIController();
private static PlayerController PC = new PlayerController();
private static Menu Mn = new Menu();
private static ruels rl = new ruels();
private static boolean isGameRunning = true;
private static int roll;
public static void gameloop(){
    Player[] playerArray;
    PC.setPlayerArray(Mn.AddPlayer(GC));
    FC.createGameBoardFields();
    FC.createChanceCardDeck();
    Player currentPlayer = PC.getCurrentPlayer();
    GUI_Player[] GuiPlayers = GC.createplayer(PC.getPlayerArray());
    while(isGameRunning) {

        currentPlayer = PC.getCurrentPlayer();
        rollDice(currentPlayer,GuiPlayers);
        FC.getGameboard()[currentPlayer.getPlayerPosition()].landOnField(FC,GC,currentPlayer,GuiPlayers);
        rl.afterRuels(currentPlayer,GC);
        GuiPlayers[currentPlayer.getPlayerId()].setBalance(currentPlayer.getPlayerAccount().getBalance());
        isGameRunning = rl.win(currentPlayer, GC);
        PC.NextPlayer();
    }
}
    public static void main(String[] args){
    gameloop();
    }
    public static void rollDice(Player currentPlayer, GUI_Player[] GuiPlayers){
        GC.oneButton("its" + " " + currentPlayer.getPlayerName() + " " + "to roll click roll", "roll");
        Dc.diceRoll();
        roll = Dc.diceValue();
        GC.showDice(roll);
        int newPlayerPosition = (currentPlayer.getPlayerPosition() + roll) % 24;
        GC.movePlayer(currentPlayer.getPlayerPosition(), roll, GuiPlayers[currentPlayer.getPlayerId()]);
        currentPlayer.setPlayerPosition(newPlayerPosition);
    }
}
