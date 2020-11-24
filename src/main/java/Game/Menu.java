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
        int ageYear = GC.intigerInput("Please enter birth year",1900,2021);
        playerController.getPlayer1().setYear(ageYear);
        int ageMonth = GC.intigerInput("Please enter birth month",1,12);
        playerController.getPlayer1().setYear(ageMonth);
        int ageDay = GC.intigerInput("Please enter birth Day",1,31);
        playerController.getPlayer1().setYear(ageDay);
    }

    public void SetupPlayer2(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 2 name:").toUpperCase();
        playerController.getPlayer2().setPlayerName(playerName);
        int ageYear = GC.intigerInput("Please enter birth year",1900,2021);
        playerController.getPlayer2().setYear(ageYear);
        int ageMonth = GC.intigerInput("Please enter birth month",1,12);
        playerController.getPlayer2().setYear(ageMonth);
        int ageDay = GC.intigerInput("Please enter birth Day",1,31);
        playerController.getPlayer2().setYear(ageDay);
    }

    public void SetupPlayer3(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 3 name:").toUpperCase();
        playerController.getPlayer3().setPlayerName(playerName);
        int ageYear = GC.intigerInput("Please enter birth year",1900,2021);
        playerController.getPlayer3().setYear(ageYear);
        int ageMonth = GC.intigerInput("Please enter birth month",1,12);
        playerController.getPlayer3().setYear(ageMonth);
        int ageDay = GC.intigerInput("Please enter birth Day",1,31);
        playerController.getPlayer3().setYear(ageDay);
    }

    public void SetupPlayer4(GUIController GC)
    {
        String playerName = GC.stringInput("Please enter player 4 name:").toUpperCase();
        playerController.getPlayer4().setPlayerName(playerName);
        int ageYear = GC.intigerInput("Please enter birth year",1900,2021);
        playerController.getPlayer4().setYear(ageYear);
        int ageMonth = GC.intigerInput("Please enter birth month",1,12);
        playerController.getPlayer4().setYear(ageMonth);
        int ageDay = GC.intigerInput("Please enter birth Day",1,31);
        playerController.getPlayer4().setYear(ageDay);
    }
}