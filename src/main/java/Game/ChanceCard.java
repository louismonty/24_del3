package Game;
import Controller.FieldController;
import Controller.GUIController;
import Controller.PlayerController;

import java.util.Scanner;

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
        currentPlayer.getPlayerAccount().AddBalance(field.getStartBonus());
    }

    public void fiveFieldsForwardCard(Player currentPlayer)
    {
        int newPosition = (int) GUIController.intigerInput("Ryk op til 5 felter frem.", 1, 5);
        newPosition = newPosition + currentPlayer.getPlayerPosition();
        currentPlayer.setPlayerPosition(newPosition);
    }

    public void freeOrangeField(Player currentPlayer, PropertyField currentField)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Burgerbaren", "Pizzariaet").equals("Burgerbaren") ==true)
            currentPlayer.setPlayerPosition(1);
        else currentPlayer.setPlayerPosition(2);
        if(currentField.getIsPropertyBought()==false)
        {
            currentField.setOwner(currentPlayer);
        }
        else
        {
            currentField.payRent(currentPlayer);
        }
    }

    public void freeLightBlueField(Player currentPlayer)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Slikbutikken", "Iskiosken").equals("Burgerbaren") ==true)
            currentPlayer.setPlayerPosition(4);
        else currentPlayer.setPlayerPosition(5);
    }

    public void freeRedField(Player currentPlayer)
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Spillehallen", "Biografen").equals("Burgerbaren") ==true)
            currentPlayer.setPlayerPosition(13);
        else currentPlayer.setPlayerPosition(14);
    }



}
