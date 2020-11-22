package Game;
import Controller.GUIController;
import Controller.PlayerController;
import java.util.Scanner;


public class Menu {

    PlayerController playerController = new PlayerController();


    public Player[] AddPlayer(GUIController GC)
    {

        Scanner scan = new Scanner(System.in);
        int numberOfPlayers = GC.intigerInput("Please enter the amount of players from 2-4",2,4);

        switch (numberOfPlayers)
        {
            case 2:
                playerController.Make2Players();
                System.out.println("you created 2 players!");
                SetupPlayer1(GC);
                SetupPlayer2(GC);
                break;

            case 3:
                playerController.Make3Players();
                System.out.println("you created 3 players!");
                SetupPlayer1(GC);
                SetupPlayer2(GC);
                SetupPlayer3(GC);
                break;

            case 4:
                playerController.Make4Players();
                System.out.println("you created 4 players!");
                SetupPlayer1(GC);
                SetupPlayer2(GC);
                SetupPlayer3(GC);
                SetupPlayer4(GC);
                break;
            default:
                System.out.println("ERROR NO PLAYERS ADDED!");
        }
        scan.close();
        return playerController.getPlayerArray();
    }
    public void SetupPlayer1(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 1 name:").toUpperCase();
        playerController.getPlayer1().setPlayerName(playerName);
        int playerAge = GC.intigerInput("Please enter player 1 age:",0,130);
        playerController.getPlayer1().setPlayerAge(playerAge);
    }

    public void SetupPlayer2(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 2 name:").toUpperCase();
        playerController.getPlayer2().setPlayerName(playerName);
        int playerAge = GC.intigerInput("Please enter player 2 age:",0,130);
        playerController.getPlayer2().setPlayerAge(playerAge);
    }

    public void SetupPlayer3(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 3 name:").toUpperCase();
        playerController.getPlayer3().setPlayerName(playerName);
        int playerAge = GC.intigerInput("Please enter player 3 age:",0,130);
        playerController.getPlayer3().setPlayerAge(playerAge);
    }

    public void SetupPlayer4(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 4 name:").toUpperCase();
        playerController.getPlayer4().setPlayerName(playerName);
        int playerAge = GC.intigerInput("Please enter player 4 age:",0,130);
        playerController.getPlayer4().setPlayerAge(playerAge);
    }
}