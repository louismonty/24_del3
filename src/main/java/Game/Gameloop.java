package Game;
import Controller.*;
import gui_fields.GUI_Player;


public class Gameloop {
    private static DiceController diceController = new DiceController();
private static FieldController fieldController = new FieldController();
private static GUIController guiController = new GUIController();
private static PlayerController playerController = new PlayerController();
private static Menu menu = new Menu();
private static Rules rules = new Rules();
private static ChanceCardController chanceCardController = new ChanceCardController();
private static boolean isGameRunning = true;
private static int roll;
public static void gameloop(){
    Player[] playerArray;
    // ADDPlayer
    menu.AddPlayer(guiController, playerController);
    //setCurrentplayer og youngestplayer
    playerController.setCurrentPlayer(playerController.youngestPlayer().getPlayerId());
    //shuffleChanceCardDeck
    chanceCardController.shuffleChanceCardDeck();
    Player currentPlayer;
    //creatplayer and getPlayerArray
    GUI_Player[] GuiPlayers = guiController.createplayer(playerController.getPlayerArray());
    //gameloop
    while(isGameRunning) {
            //get currentPlayer
            currentPlayer = playerController.getCurrentPlayer();
            //hasChancecard
            rules.hasChanceCard(fieldController,currentPlayer,playerController.getPlayerArray(),guiController,GuiPlayers[currentPlayer.getPlayerId()],GuiPlayers,chanceCardController);
            //rollDice
            rollDice(currentPlayer, GuiPlayers);
            //startRueles
            rules.startRules(currentPlayer, guiController);
            //landonField (måske getgameboard)
            fieldController.getGameboard()[currentPlayer.getPlayerPosition()%24].landOnField(fieldController, currentPlayer, playerController.getPlayerArray(), guiController, GuiPlayers[currentPlayer.getPlayerId()], GuiPlayers, chanceCardController);
            //updates balance på GUIen(lad stå)
            GuiPlayers[currentPlayer.getPlayerId()].setBalance(currentPlayer.getPlayerAccount().getBalance());
            //win
            isGameRunning = rules.win(currentPlayer, guiController, playerController);
            //nextPlayer
        playerController.NextPlayer();
    }
}

    public static void rollDice(Player currentPlayer, GUI_Player[] GuiPlayers){
        guiController.oneButton("its" + " " + currentPlayer.getPlayerName() + " " + "to roll click roll", "roll");
        diceController.diceRoll();
        roll = diceController.diceValue();
        guiController.showDice(roll);
        int newPlayerPosition = (currentPlayer.getPlayerPosition() + roll);
        guiController.movePlayer(currentPlayer.getPlayerPosition(), roll, GuiPlayers[currentPlayer.getPlayerId()]);
        currentPlayer.setPlayerPosition(newPlayerPosition);
    }
}
