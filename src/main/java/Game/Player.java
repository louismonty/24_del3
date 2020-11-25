package Game;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {

    public String getPlayerName()
    {
        return playerName;
    }


    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }



    public double getPlayerAge()
    {
        return playerAge;
    }


    public void setPlayerAge(double playerAge)
    {
        this.playerAge = playerAge;
    }


    public Account getPlayerAccount()
    {
        return playerAccount;
    }


    public void setPlayerAccount(Account playerAccount)
    {
        this.playerAccount = playerAccount;
    }


    public int getPlayerPosition()
    {
        return playerPosition;
    }


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


    //Class attributes
    private String playerName;
    private Account playerAccount;
    private int playerPosition;
    private Color playerColor;
    private double playerAge;
    private int playerId;
    private boolean hasChanceCard;
    private boolean hasGetOutOfJailCard;
    private boolean isInJail;


    //Class constructor for the Player class
    public Player(String playerName, double playerAge, Account playerAccount, Color playerColor, int playerId)
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