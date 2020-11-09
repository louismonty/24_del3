package Game;
import java.util.List;
import java.util.Scanner;

public class Menu {

    //Make List that contains Player objects
    List<PlayerController> playerControllers;

    //Method that add player objects when button pushed
    public void AddPlayerButton()
    {
        int nextButtonHit = 0;
        while (nextButtonHit != 1) {
            String key;
            Scanner input = new Scanner(System.in);
            key = input.nextLine();
            //key should be == addPlayerGUI button
            if (key == "n") {
                CreatePlayerController();
            }

            //key should be == nextGUI button
            if (key == "m") {

                if (playerControllers.size() != 0) {
                    SetUpPlayers();
                    nextButtonHit = 1;
                }
            }
        }
    }

    private void CreatePlayerController()
    {
        if(playerControllers.size() < 4)
        {
            playerControllers.add(new PlayerController());
        }
    }
    public void SetUpPlayers()
    {
        for (int i = 0; i < playerControllers.size(); i++) {
            Scanner input = new Scanner(System.in);
            playerControllers.get(i).getPlayer().setPlayerName(input.nextLine());
            System.out.println(playerControllers.get(i).getPlayer().getPlayerName());
            input.close();

        }
    }
    public void StartGameButton()
    {

    }
}