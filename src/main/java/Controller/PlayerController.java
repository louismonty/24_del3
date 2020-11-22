package Controller;

import Game.Account;
import Game.Player;

import java.awt.*;

public class PlayerController {

    private Player player1;
    public Player getPlayer1()
    {
        this.player1 = player1;
        return player1;
    }

    public void setPlayer1(Player player) {
        this.player1 = player;
    }

    private Player player2;
    public Player getPlayer2()
    {
        this.player2 = player2;
        return player2;
    }

    public void setPlayer2(Player player) {
        this.player2 = player;
    }

    private Player player3;
    public Player getPlayer3()
    {
        this.player3 = player3;
        return player3;
    }

    public void setPlayer3(Player player) {
        this.player3 = player;
    }

    private Player player4;
    public Player getPlayer4()
    {
        this.player4 = player4;
        return player4;
    }

    public void setPlayer4(Player player) {
        this.player4 = player;
    }

    private Player[] playerArray;

    public Player[] getPlayerArray() {
        this.playerArray = playerArray;
        return playerArray;
    }

    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    public Player getCurrentPlayer() {
        return playerArray[currentPlayer];
    }

    private int currentPlayer = 0;

    public void NextPlayer()
    {
        currentPlayer = (currentPlayer + 1)% (playerArray.length);
    }

    public void Make2Players()
    {
        player1 = new Player("UNKNOWN", 0, new Account(1), Color.black,1);
        player2 = new Player("UNKNOWN", 0, new Account(1), Color.blue,2);
        playerArray = new Player[]{player1, player2};
    }
    public void Make3Players()
    {
        player1 = new Player("UNKNOWN", 0, new Account(1), Color.black,1);
        player2 = new Player("UNKNOWN", 0, new Account(1), Color.blue,2);
        player3 = new Player("UNKNOWN", 0, new Account(1), Color.red,3);
        playerArray = new Player[]{player1, player2, player3};
    }
    public void Make4Players()
    {
        player1 = new Player("UNKNOWN", 0, new Account(1), Color.black,1);
        player2 = new Player("UNKNOWN", 0, new Account(1), Color.blue,2);
        player3 = new Player("UNKNOWN", 0, new Account(1), Color.red,3);
        player4 = new Player("UNKNOWN", 0, new Account(1), Color.green,4);
        playerArray = new Player[]{player1, player2, player3, player4};
    }
}