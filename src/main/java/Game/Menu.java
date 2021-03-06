package Game;
import Controller.GUIController;
import Controller.PlayerController;
import java.util.Scanner;



public class Menu {




    public void AddPlayer(GUIController guiController,PlayerController PlayerController)
    {

        Scanner scan = new Scanner(System.in);
        int numberOfPlayers = guiController.intigerInput("Please enter the amount of players from 2-4",2,4);

        switch (numberOfPlayers)
        {
            case 2:
                PlayerController.Make2Players();
                System.out.println("you created 2 players!");
                SetupPlayer1(guiController,PlayerController);
                SetupPlayer2(guiController,PlayerController);
                break;

            case 3:
                PlayerController.Make3Players();
                System.out.println("you created 3 players!");
                SetupPlayer1(guiController,PlayerController);
                SetupPlayer2(guiController,PlayerController);
                SetupPlayer3(guiController,PlayerController);
                break;

            case 4:
                PlayerController.Make4Players();
                System.out.println("you created 4 players!");
                SetupPlayer1(guiController,PlayerController);
                SetupPlayer2(guiController,PlayerController);
                SetupPlayer3(guiController,PlayerController);
                SetupPlayer4(guiController,PlayerController);
                break;
            default:
                System.out.println("ERROR NO PLAYERS ADDED!");
        }
        scan.close();
    }
    public void SetupPlayer1(GUIController guiController, PlayerController PlayerController)
    {
        String playerName = guiController.stringInput("Please enter player 1 name:").toUpperCase();
        PlayerController.getPlayer1().setPlayerName(playerName);
        double playerAge = guiController.intigerInput("Enter birth day like such: yyyymmdd",19000101,20201212);
        PlayerController.getPlayer1().setPlayerAge(playerAge);

    }

    public void SetupPlayer2(GUIController guiController,PlayerController PlayerController)
    {
        String playerName = guiController.stringInput("Please enter player 2 name:").toUpperCase();
        PlayerController.getPlayer2().setPlayerName(playerName);
        double playerAge = guiController.intigerInput("Enter birth day like such: yyyymmdd",19000101,20201212);
        PlayerController.getPlayer2().setPlayerAge(playerAge);

    }

    public void SetupPlayer3(GUIController guiController,PlayerController PlayerController)
    {
        String playerName = guiController.stringInput("Please enter player 3 name:").toUpperCase();
        PlayerController.getPlayer3().setPlayerName(playerName);
        double playerAge = guiController.intigerInput("Enter birth day like such: yyyymmdd",19000101,20201212);
        PlayerController.getPlayer3().setPlayerAge(playerAge);

    }

    public void SetupPlayer4(GUIController guiController,PlayerController PlayerController)
    {
        String playerName = guiController.stringInput("Please enter player 4 name:").toUpperCase();
        PlayerController.getPlayer4().setPlayerName(playerName);
        double playerAge = guiController.intigerInput("Enter birth day like such: yyyymmdd",19000101,20201212);
        PlayerController.getPlayer4().setPlayerAge(playerAge);

    }
}