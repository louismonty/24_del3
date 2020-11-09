package Controller;

import Game.Account;
import Game.Player;

public class PlayerController {

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    private Player player;

    public void CreatePlayer()
    {
        player = new Player("UNKNOWN", 0, new Account(1));
    }
}