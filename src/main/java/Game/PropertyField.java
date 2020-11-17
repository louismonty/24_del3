package Game;

public class PropertyField extends Field
{
    private int price;
    private int rent;
    private boolean isPropertyBought;
    Field partner;
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
    public Player getOwner(){return owner;}
    public void setIsPropertyBought(boolean isBought)
    {
        isPropertyBought = isBought;
    }
    public String getName()
    {
        return name;
    }
    public void setOwner(Player currentPlayer)
    {
        owner = currentPlayer;
    }
    public void payRent(Player currentPlayer)
    {
        currentPlayer.addBalance(-rent);
    }

}
