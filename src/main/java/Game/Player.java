package Game;

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

    //playerId Getter
    public int getPlayerId() {
        return playerId;
    }

    //playerId Setter
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    //Class attributes
    private String playerName;
    private int playerAge = 0;
    private Account playerAccount;
    private int playerPosition;
    private int playerId;
    //public GUI playerTexture;

    //Class constructor for the Player class
    public Player(String playerName, int playerAge, int playerId, Account playerAccount /*, GUI playerTexture*/)
    {
        //this.playerTexture = playerTexture;
        this.playerId = playerId;
        this.playerPosition = 0;
        this.playerAccount = playerAccount;
        this.playerName = playerName;
        this.playerAge = playerAge;
    }
}