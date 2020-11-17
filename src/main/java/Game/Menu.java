package Game;
import Controller.PlayerController;
import java.util.Scanner;


public class Menu {

    PlayerController playerController = new PlayerController();

    public void AddPlayer()
    {

        System.out.println("Please enter the amount of players from 2-4");
        Scanner scan = new Scanner(System.in);
        int numberOfPlayers = scan.nextInt();

        switch (numberOfPlayers)
        {
            case 2:
                playerController.Make2Players();
                System.out.println("you created 2 players!");
                SetupPlayer1();
                SetupPlayer2();
                break;

            case 3:
                playerController.Make3Players();
                System.out.println("you created 3 players!");
                SetupPlayer1();
                SetupPlayer2();
                SetupPlayer3();
                break;

            case 4:
                playerController.Make4Players();
                System.out.println("you created 4 players!");
                SetupPlayer1();
                SetupPlayer2();
                SetupPlayer3();
                SetupPlayer4();
                break;
            default:
                System.out.println("ERROR NO PLAYERS ADDED!");
        }
        scan.close();
    }
    public void SetupPlayer1()
    {
        Scanner p1Setup = new Scanner(System.in);
        System.out.println("Please enter player 1 name:");
        String playerName = p1Setup.nextLine().toUpperCase();
        playerController.getPlayer1().setPlayerName(playerName);
        System.out.println("Please enter player 1 age:");
        int playerAge = p1Setup.nextInt();
        playerController.getPlayer1().setPlayerAge(playerAge);
        System.out.println("Player 1/ " + playerController.getPlayer1().getPlayerName() + ", Age: " + playerController.getPlayer1().getPlayerAge());
    }

    public void SetupPlayer2()
    {
        Scanner p2Setup = new Scanner(System.in);
        System.out.println("Please enter player 2 name:");
        String playerName = p2Setup.nextLine().toUpperCase();
        playerController.getPlayer2().setPlayerName(playerName);
        System.out.println("Please enter player 2 age:");
        int playerAge = p2Setup.nextInt();
        playerController.getPlayer2().setPlayerAge(playerAge);
        System.out.println("Player 2/ " + playerController.getPlayer2().getPlayerName() + ", Age: " + playerController.getPlayer2().getPlayerAge());
    }

    public void SetupPlayer3()
    {
        Scanner p3Setup = new Scanner(System.in);
        System.out.println("Please enter player 3 name:");
        String playerName = p3Setup.nextLine().toUpperCase();
        playerController.getPlayer3().setPlayerName(playerName);
        System.out.println("Please enter player 3 age:");
        int playerAge = p3Setup.nextInt();
        playerController.getPlayer3().setPlayerAge(playerAge);
        System.out.println("Player 3/ " + playerController.getPlayer3().getPlayerName() + ", Age: " + playerController.getPlayer3().getPlayerAge());
    }

    public void SetupPlayer4()
    {
        Scanner p4Setup = new Scanner(System.in);
        System.out.println("Please enter player 4 name:");
        String playerName = p4Setup.nextLine().toUpperCase();
        playerController.getPlayer4().setPlayerName(playerName);
        System.out.println("Please enter player 4 age:");
        int playerAge = p4Setup.nextInt();
        playerController.getPlayer4().setPlayerAge(playerAge);
        System.out.println("Player 4/ " + playerController.getPlayer4().getPlayerName() + ", Age: " + playerController.getPlayer4().getPlayerAge());
    }
}