package Game;

public class PropertyField extends Field
{
    private int price;
    private int rent;
    private boolean isPropertyBought;

    public PropertyField(int positionID, String colorID, String name, int price, int rent)
    {
        super(positionID, colorID, name);
        this.price = price;
        this.rent = rent;
        this.isPropertyBought = false;
    }
}
