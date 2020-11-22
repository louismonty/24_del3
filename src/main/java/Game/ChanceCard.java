package Game;
import Controller.ChanceCardController;
import Controller.GUIController;

public class ChanceCard
{
    int chanceCardID;
    String chanceCardName;

    public ChanceCard(int id, String name)
    {
        chanceCardID = id;
        chanceCardName = name;
    }
    public void blackPlayerCard(Player player1)
    {
        player1.setHasChanceCard(true);
    }
    public void bluePlayerCard(Player player2)
    {
        player2.setHasChanceCard(true);
    }
    public void redPlayerCard(Player player3)
    {
        player3.setHasChanceCard(true);
    }
    public void greenPlayerCard(Player player4)
    {
        player4.setHasChanceCard(true);
    }
    public void startCard(Player currentPlayer, StartField field)
    {
        currentPlayer.setPlayerPosition(0);
        currentPlayer.getPlayerAccount().addBalance(field.getStartBonus());
    }
    public void fiveFieldsForwardCard(Player currentPlayer, GUIController GUIController)
    {
        int newPosition = GUIController.intigerInput("Ryk op til 5 felter frem.", 1, 5);
        newPosition = newPosition + currentPlayer.getPlayerPosition();
        currentPlayer.setPlayerPosition(newPosition);
    }
    public void checkIfPropertyIsBought(Player player, PropertyField field)
    {
        if(field.getIsPropertyBought()==false)
        {
            field.setOwner(player);
        }
        else
        {
            field.payRent(player.getPlayerAccount(), field.getOwner().getPlayerAccount());
        }
    }
    public void tooMuchCandyCard(Player currentPlayer)
    {
        currentPlayer.getPlayerAccount().subtractBalance(2);
    }
    public void strandpromenadenCard(Player currentPlayer)
    {
        currentPlayer.setPlayerPosition(23);
    }
    public void homeworkCard(Player currentPlayer)
    {
        currentPlayer.getPlayerAccount().addBalance(2);
    }
    public void skaterparkenCard(Player currentPlayer, PropertyField field)
    {
        currentPlayer.setPlayerPosition(10);
        checkIfPropertyIsBought(currentPlayer, field);
    }
    public void freeOrangeCard(Player currentPlayer, PropertyField currentField, GUIController GUIController)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. " +
                "\nHvis det er ledigt, får du det gratis! " +
                "\nEllers skal du betale leje til ejeren", "Skaterparken", "Swimmingpoolen").equals("Skaterparken") ==true)
            currentPlayer.setPlayerPosition(10);
        else currentPlayer.setPlayerPosition(11);
        checkIfPropertyIsBought(currentPlayer, currentField);
    }
    public void freeLightBlueCard(Player currentPlayer, PropertyField currentField, GUIController GUIController)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et lyseblåt felt. " +
                "\nHvis det er ledigt, får du det gratis! " +
                "\nEllers skal du betale leje til ejeren", "Slikbutikken", "Iskiosken").equals("Slikbutikken") ==true)
            currentPlayer.setPlayerPosition(4);
        else currentPlayer.setPlayerPosition(5);
        checkIfPropertyIsBought(currentPlayer, currentField);
    }
    public void freeRedCard(Player currentPlayer, PropertyField currentField, GUIController GUIController)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et rødt felt. " +
                "\nHvis det er ledigt, får du det gratis! " +
                "\nEllers skal du betale leje til ejeren", "Spillehallen", "Biografen").equals("Spillehallen") ==true)
            currentPlayer.setPlayerPosition(13);
        else currentPlayer.setPlayerPosition(14);
        checkIfPropertyIsBought(currentPlayer, currentField);
    }
    public void freeOrangeOrGreenCard(Player currentPlayer, PropertyField currentField, GUIController GUIController)
    {
        String button = GUIController.fourButtons("Gratis felt! Ryk frem til et orange eller grønt felt." +
                "\nHvis det er ledigt, får du det gratis! " +
                "\nEllers skal du betale leje til ejeren.", "Skaterparken", "Swimmingpoolen", "Bowlinghallen", "Zoo");
        if(button.equals("Skaterparken"))
        {
            currentPlayer.setPlayerPosition(4);
        }
        else if(button.equals("Swimmingpoolen"))
        {
            currentPlayer.setPlayerPosition(5);
        }
        else if(button.equals("Bowlinghallen"))
        {
            currentPlayer.setPlayerPosition(19);
        }
        else
        {
            currentPlayer.setPlayerPosition(20);
        }
        checkIfPropertyIsBought(currentPlayer, currentField);
    }
    public void freePinkOrBlueCard(Player currentPlayer, PropertyField currentField, GUIController GUIController)
    {
        String button = GUIController.fourButtons("Gratis felt! Ryk frem til et pink eller blåt felt." +
                "\nHvis det er ledigt, får du det gratis! " +
                "\nEllers skal du betale leje til ejeren.", "Museet", "Biblioteket", "Vandlandet", "Strandpromenaden");
        if(button.equals("Museet"))
        {
            currentPlayer.setPlayerPosition(7);
        }
        else if(button.equals("Biblioteket"))
        {
            currentPlayer.setPlayerPosition(8);
        }
        else if(button.equals("Vandlandet"))
        {
            currentPlayer.setPlayerPosition(22);
        }
        else
        {
            currentPlayer.setPlayerPosition(23);
        }
        checkIfPropertyIsBought(currentPlayer, currentField);
    }
    public void moveOneOrDrawChanceCardCard(Player currentPlayer, GUIController GUIController, ChanceCardController chanceCardController)
    {
        if(GUIController.twoButtons("Vælg en af to muligheder: ", "Ryk 1 felt frem", "Træk et nyt chance kort").equals("Ryk 1 felt frem") ==true)
        {
            currentPlayer.setPlayerPosition(currentPlayer.getPlayerPosition()+1);
        }
        else
        {
            chanceCardController.drawChanceCard();
        }
    }
}
