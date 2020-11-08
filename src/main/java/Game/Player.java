package Game;

public class Player {

    //Class attributes
    public String playerName;
    public int playerAge = 0;
    public String playerId;
    public Account playerAccount;
    //public GUI playerTexture;
    public int playerPosition;

    //Class constructor for the Player class
    public Player(String playerName, int playerAge, String playerId, Account playerAccount /*, GUI playerTexture*/)
    {
        //this.playerTexture = playerTexture;
        this.playerPosition = 0;
        this.playerAccount = playerAccount;
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerId = playerId;
    }

    //Method for user choosing player name
    public String AddName(String newName)
    {
        this.playerName = newName;
        return playerName;
    }

    //Method for user choosing player age
    public int AddAge(int newAge)
    {
        this.playerAge = newAge;
        return playerAge;
    }
}