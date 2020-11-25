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

    //Player Array Getter
    private Player[] playerArray;
    public Player[] getPlayerArray() {
        this.playerArray = playerArray;
        return playerArray;
    }

    //Player Array Setter
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }

    //Get current player
    private int currentPlayer = 0;
    public Player getCurrentPlayer() {
        return playerArray[currentPlayer];
    }

    public void setCurrentPlayer(int firstPlayer){
        this.currentPlayer = firstPlayer;
    }

    //Next player method
    public void NextPlayer()
    {
        currentPlayer = (currentPlayer + 1)% (playerArray.length);
    }

    //Makes 2 player objects and assigns default values
    public void Make2Players()
    {
        player1 = new Player("UNKNOWN",19000101, new Account(20), Color.green,0);
        player2 = new Player("UNKNOWN",19000101, new Account(20), Color.blue,1);
        playerArray = new Player[]{player1, player2};
    }

    //Makes 3 player objects and assigns default values
    public void Make3Players()
    {
        player1 = new Player("UNKNOWN", 19000101, new Account(18), Color.green,0);
        player2 = new Player("UNKNOWN", 19000101, new Account(18), Color.blue,1);
        player3 = new Player("UNKNOWN", 19000101, new Account(18), Color.red,2);
        playerArray = new Player[]{player1, player2, player3};
    }

    //Makes 4 player objects and assigns default values
    public void Make4Players()
    {
        player1 = new Player("UNKNOWN", 19000101, new Account(16), Color.green,0);
        player2 = new Player("UNKNOWN", 19000101, new Account(16), Color.blue,1);
        player3 = new Player("UNKNOWN", 19000101, new Account(16), Color.red,2);
        player4 = new Player("UNKNOWN", 19000101, new Account(16), Color.black,3);
        playerArray = new Player[]{player1, player2, player3, player4};
    }

    //Method for checking with player has the highest balance
    public Player playerWithHighestBalance()
    {
        if (playerArray.length == 4)
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

        if (playerArray.length == 3)
        {
            if ((player1.getPlayerAccount().getBalance() >= player2.getPlayerAccount().getBalance())
                    && (player1.getPlayerAccount().getBalance() >= player3.getPlayerAccount().getBalance()))
            {
                return player1;
            }
            else if ((player2.getPlayerAccount().getBalance() >= player3.getPlayerAccount().getBalance()))
            {
                return player2;
            }
            else
            {
                return player3;
            }
        }
        if (playerArray.length == 2)
        {
            if (player1.getPlayerAccount().getBalance() >= player2.getPlayerAccount().getBalance())
            {
                return player1;
            }
            else
            {
                return player2;
            }
        }
        return player1;
    }

    /**
     * Method for checking with player is youngest
     * @return The youngest player as array
     */
    public Player youngestPlayer()
    {
        if (playerArray.length == 4)
        {
            if ((player1.getPlayerAge() >= player2.getPlayerAge()) && (player1.getPlayerAge() >= player3.getPlayerAge())
                    && (player1.getPlayerAge() >= player4.getPlayerAge()))
            {
                return player1;
            }
            else if ((player2.getPlayerAge() >= player3.getPlayerAge()) && (player2.getPlayerAge() >= player4.getPlayerAge()))
            {
                return player2;
            }
            else if (player3.getPlayerAge() >= player4.getPlayerAge())
            {
                return player3;
            }
            else
            {
                return player4;
            }
        }
        if (playerArray.length == 3)
        {
            if ((player1.getPlayerAge() >= player2.getPlayerAge()) && (player1.getPlayerAge() >= player3.getPlayerAge()))
            {
                return player1;
            }
            else if (player2.getPlayerAge() >= player3.getPlayerAge())
            {
                return player2;
            }
            else
            {
                return player3;
            }
        }
        if (playerArray.length == 2)
        {
            if (player1.getPlayerAge() >= player2.getPlayerAge())
            {
                return player1;
            }
            else
            {
                return player2;
            }
        }
        else
        {
            return player1;
        }
    }
}