package Game;

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
    public int getPlayerAge()
    {
        return playerAge;
    }

    //playerAge Setter
    public void setPlayerAge(int playerAge)
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
    public Color getPlayerColor(){return playerColor;}

    public void addBalance(int bal){
        this.playerAccount.AddBalance((this.playerAccount.getBalance()+bal));
    }
    public int getPlayerId(){
        return this.playerId;
    }

    //Class attributes
    private String playerName;
    private int playerAge = 0;
    private Account playerAccount;
    private int playerPosition;
    public Color playerColor;
    int playerId;

    //Class constructor for the Player class
    public Player(String playerName, int playerAge, Account playerAccount, Color playerColor, int playerId)
    {
        this.playerColor = playerColor;
        this.playerPosition = 0;
        this.playerAccount = playerAccount;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerId= playerId;
    }
}