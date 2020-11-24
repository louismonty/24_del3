package Game;

import Game.Account;

import java.awt.*;

public class Player {
    //playerName Getter
    public String getPlayerName()
    {
        return playerName;
    }

    //playerName Setter
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }

    //playerAge Getter

    public int[] getPlayerAge()
    {
        return playerAge;
    }

    //playerAge Setter
    public void setPlayerAge(int[] playerAge)
    {
        this.playerAge = playerAge;
    }

    //playerAccount Getter
    public Account getPlayerAccount()
    {
        return playerAccount;
    }

    //playerAccount Setter
    public void setPlayerAccount(Account playerAccount)
    {
        this.playerAccount = playerAccount;
    }

    //playerPosition Getter
    public int getPlayerPosition()
    {
        return playerPosition;
    }

    //playerPosition Setter
    public void setPlayerPosition(int playerPosition)
    {
        this.playerPosition = playerPosition;
    }

    public void setHasChanceCard(boolean hasChanceCard)
    {
        this.hasChanceCard = hasChanceCard;
    }
    public void setHasGetOutOfJailCard(boolean hasGetOutOfJailCard)
    {
        this.hasGetOutOfJailCard = hasGetOutOfJailCard;
    }
    public boolean getIsInJail(){return this.isInJail;}
    public void setIsInJail(boolean jail){ isInJail =jail;}
    public int getPlayerId(){return this.playerId;}
    public Color getPlayerColor(){return  this.playerColor;}

    public boolean getHasChanceCard()
    {
        return hasChanceCard;
    }
    public boolean getHasGetOutOfJailCard()
    {
        return hasGetOutOfJailCard;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    //Class attributes
    private String playerName;
    private int year;
    private int month;
    private int day;
    private int playerAge[] = {year, month, day};
    private Account playerAccount;
    private int playerPosition;
    private Color playerColor;
    private int playerId;
    private boolean hasChanceCard;
    private boolean hasGetOutOfJailCard;
    private boolean isInJail;


    //Class constructor for the Player class
    public Player(String playerName, int playerAge[], Account playerAccount, Color playerColor,int playerId)
    {
        this.playerColor = playerColor;
        this.playerPosition = 0;
        this.playerAccount = playerAccount;
        this.playerName = playerName;
        this.playerAge = playerAge;
        hasChanceCard = false;
        hasGetOutOfJailCard = false;
        isInJail = false;
        this.playerColor = playerColor;
        this.playerId = playerId;
    }
}