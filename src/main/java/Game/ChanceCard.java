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
        player1.setHasChanceCard(true);
    }

    public void shipCard()
    {
        player2.setHasChanceCard(true);
    }

    public void catCard()
    {
        player3.setHasChanceCard(true);
    }

    public void carCard()
    {
        player4.setHasChanceCard(true);
    }

    public void startCard()
    {
        getCurrentPlayer().setPosition(0);
        getCurrentPlayer().AddBalance(gameboard[0].getStartBonus());
    }

    public void fiveFieldsForwardCard()
    {
        int temp = (int) GUIController.intigerInput("Ryk op til 5 felter frem.", 1, 5);
        temp = temp + getCurrentPlayerPosition() ;
        setCurrentPlayerPosition(temp);
    }

    public void freeOrangeField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Burgerbaren", "Pizzariaet").equals("Burgerbaren") ==true)
            getCurrentPlayer().setPlayerPosition(1);
        else getCurrentPlayer().setPlayerPosition(2);
        if(getCurrentField.getIsPropertyBought()==false)
        {
            getCurrentField().setOwner(getCurrentPlayer());
        }
        else
        {
            getCurrentField().payRent();
        }
    }

    public void freeLightBlueField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Slikbutikken", "Iskiosken").equals("Burgerbaren") ==true)
            getCurrentPlayer().setPlayerPosition(4);
        else getCurrentPlayer().setPlayerPosition(5);
    }

    public void freeRedField()
    {
        if(GUIController.twoButtons("Gratis felt! Ryk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren", "Spillehallen", "Biografen").equals("Burgerbaren") ==true)
            getCurrentPlayer().setPlayerPosition(13);
        else getCurrentPlayer().setPlayerPosition(14);
    }



}
