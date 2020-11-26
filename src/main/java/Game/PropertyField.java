package Game;

import Controller.ChanceCardController;
import Controller.FieldController;
import Controller.GUIController;
import gui_fields.GUI_Player;

public class PropertyField extends Field
{
    private int price;
    private int rent;
    private boolean isPropertyBought;
    private Field partner;
    private Player owner;

    public PropertyField(int positionID, String colorID, String name, int price, int rent, Field partner)
    {
        super(positionID, colorID, name);
        this.price = price;
        this.rent = rent;
        this.isPropertyBought = false;
        this.partner = partner;
        Player owner;
    }

    public int getPrice()
    {
        return price;
    }
    public int getRent()
    {
        return rent;
    }
    public boolean getIsPropertyBought()
    {
        return isPropertyBought;
    }
    public void setIsPropertyBought(boolean isBought)
    {
        isPropertyBought = isBought;
    }
    public String getName()
    {
        return name;
    }
    public Field getPartner()
    {
        return partner;
    }
    public void setOwner(Player currentPlayer)
    {
        owner = currentPlayer;
    }
    public Player getOwner()
    {
        return owner;
    }
    public void payRent(PropertyField field, Player currentPlayer, Player ownerOfField)
    {
        if(isPairBought(field)==true)
        {
            currentPlayer.getPlayerAccount().subtractBalance(rent * 2);
            ownerOfField.getPlayerAccount().addBalance(rent * 2);
        }
        else
        {
            currentPlayer.getPlayerAccount().subtractBalance(rent);
            ownerOfField.getPlayerAccount().addBalance(rent);
        }
    }
    public boolean isPairBought(PropertyField field)
    {
        if(field.getOwner().equals(field.getPartner())==true)
            return true;
        else
            return false;
    }
    public void landOnField(FieldController fieldController, Player currentPlayer, Player[] playerArray, GUIController guiController, GUI_Player guiPlayer, GUI_Player[] guiPlayerArray, ChanceCardController chanceCardController){
        PropertyField cf =(PropertyField) fieldController.getGameboard()[currentPlayer.getPlayerPosition()];
        if(!cf.getIsPropertyBought()){
            guiController.showMessege("du købte "+cf.getName());
            if( currentPlayer.getPlayerAccount().getBalance() > cf.getPrice()){
                guiController.makeOwner(currentPlayer.getPlayerPosition(), guiPlayer.getPrimaryColor());
                cf.setOwner(currentPlayer);
                cf.setIsPropertyBought(true);
                currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()-cf.getPrice());
            }
        }
        else if(cf.getOwner().equals(currentPlayer)) {
            //
        }
        else{
            guiController.showMessege("du skal betale penge til"+cf.getOwner().getPlayerName());
            currentPlayer.getPlayerAccount().setBalance(currentPlayer.getPlayerAccount().getBalance()-cf.getPrice());
            cf.getOwner().getPlayerAccount().setBalance(cf.getOwner().getPlayerAccount().getBalance()+cf.getRent());
            guiController.updatePlayerBal(cf.getOwner().getPlayerAccount().getBalance(), guiPlayerArray[cf.getOwner().getPlayerId()]);
        }
    }

}
