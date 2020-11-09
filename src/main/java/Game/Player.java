import Game.Account;

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

    //Class attributes
    private String playerName;
    private int playerAge = 0;
    private String playerId;
    private Account playerAccount;
    private int playerPosition;
    //public GUI playerTexture;

    //Class constructor for the Player class
    public Player(String playerName, int playerAge, Account playerAccount /*, GUI playerTexture*/)
    {
        //this.playerTexture = playerTexture;
        this.playerPosition = 0;
        this.playerAccount = playerAccount;
        this.playerName = playerName;
        this.playerAge = playerAge;
    }
}