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
        player1 = new Player("UNKNOWN", new int[] {player1.getYear(), player1.getMonth(), player1.getDay()},
                new Account(20), Color.black,0);

        player2 = new Player("UNKNOWN", new int[] {player2.getYear(), player2.getMonth(), player2.getDay()},
                new Account(20), Color.blue,1);

        playerArray = new Player[]{player1, player2};
    }
    public void Make3Players()
    {
        player1 = new Player("UNKNOWN", new int[] {player1.getYear(), player1.getMonth(), player1.getDay()},
                new Account(18), Color.black,0);

        player2 = new Player("UNKNOWN", new int[] {player2.getYear(), player2.getMonth(), player2.getDay()},
                new Account(18), Color.blue,1);

        player3 = new Player("UNKNOWN", new int[] {player3.getYear(), player3.getMonth(), player3.getDay()},
                new Account(18), Color.red,2);

        playerArray = new Player[]{player1, player2, player3};
    }
    public void Make4Players()
    {
        player1 = new Player("UNKNOWN", new int[] {player1.getYear(), player1.getMonth(), player1.getDay()},
                new Account(16), Color.black,0);

        player2 = new Player("UNKNOWN", new int[] {player2.getYear(), player2.getMonth(), player2.getDay()},
                new Account(16), Color.blue,1);

        player3 = new Player("UNKNOWN", new int[] {player3.getYear(), player3.getMonth(), player3.getDay()},
                new Account(16), Color.red,2);

        player4 = new Player("UNKNOWN", new int[] {player4.getYear(), player4.getMonth(), player4.getDay()},
                new Account(16), Color.green,3);

        playerArray = new Player[]{player1, player2, player3, player4};
    }

    public Player playerWithHighestBalance()
    {
        if ((player1.getPlayerAccount().getBalance() >= player2.getPlayerAccount().getBalance())
                && (player1.getPlayerAccount().getBalance() >= player3.getPlayerAccount().getBalance())
                && (player1.getPlayerAccount().getBalance() >= player4.getPlayerAccount().getBalance()))
        {
            return player1;
        }

        else if ((player2.getPlayerAccount().getBalance() >= player3.getPlayerAccount().getBalance())
                && (player2.getPlayerAccount().getBalance() >= player4.getPlayerAccount().getBalance()))
        {
            return player2;
        }

        else if (player3.getPlayerAccount().getBalance() >= player4.getPlayerAccount().getBalance())
        {
            return player3;
        }

        else
        {
            return player4;
        }
    }

    public Player youngestPlayer()
    {
        
    }
}