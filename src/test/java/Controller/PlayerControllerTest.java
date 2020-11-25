package Controller;

import Game.Account;
import Game.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerControllerTest {


    @Test
    void setCurrentPlayer() {
        PlayerController playerController = new PlayerController();
        playerController.Make2Players();
        playerController.setCurrentPlayer(1);
        assertEquals(playerController.getCurrentPlayer().getPlayerId(),1);

    }

    @Test
    void nextPlayer() {
    }

    @Test
    void make2Players() {
        PlayerController playerController = new PlayerController();
        playerController.Make2Players();
        assertEquals(playerController.getPlayerArray().length,2);
    }

    @Test
    void make3Players() {
        PlayerController playerController = new PlayerController();
        playerController.Make3Players();
        assertEquals(playerController.getPlayerArray().length,3);
    }

    @Test
    void make4Players() {
        PlayerController playerController = new PlayerController();
        playerController.Make4Players();
        assertEquals(playerController.getPlayerArray().length,4);
    }

    @Test
    void playerWithHighestBalance() {
        PlayerController playerController = new PlayerController();
        playerController.Make4Players();
        playerController.getPlayer3().getPlayerAccount().setBalance(1000);
        assertEquals(playerController.playerWithHighestBalance(),playerController.getPlayer3());
    }

    @Test
    void youngestPlayer() {
        PlayerController playerController = new PlayerController();
        playerController.Make4Players();
        playerController.getPlayer4().setPlayerAge(19000102);
        assertEquals(playerController.youngestPlayer(),playerController.getPlayer4());
    }
}