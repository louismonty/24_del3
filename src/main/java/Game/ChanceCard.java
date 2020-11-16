package Game;
import Controller.FieldController;
import Controller.GUIController;

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
    public void dogCard()
    {
        Player1.setHasChanceCard(true);
    }

    public void shipCard()
    {
        Player2.setHasChanceCard(true);
    }

    public void catCard()
    {
        Player3.setHasChanceCard(true);
    }

    public void carCard()
    {
        Player4.setHasChanceCard(true);
    }

    public void startCard()
    {
        Player.setPosition(0);
        Account.AddBalance(StartField.getStartBonus());
    }

    public void fiveFieldsForwardCard()
    {
        GUIController.fiveButtons("Ryk op til 5 felter frem.", "1", "2", "3", "4", "5");
        if(fiveButtons)
    }

    public void freeOrangeField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Burgerbaren", "Pizzariaet").equals("Burgerbaren") ==true)
            Player.setPlayerPosition(1);
        else Player.setPlayerPosition(2);
        if(PropertyField.getIsPropertyBought()==false)
        {
            PropertyField.setOwner(Player);
        }
        else
        {
            PropertyField.payRent();
        }
    }

    public void freeLightBlueField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Slikbutikken", "Iskiosken").equals("Burgerbaren") ==true)
            Player.setPlayerPosition(4);
        else Player.setPlayerPosition(5);
    }

    public void freeRedField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Spillehallen", "Biografen").equals("Burgerbaren") ==true)
            Player.setPlayerPosition(13);
        else Player.setPlayerPosition(14);
    }



}
