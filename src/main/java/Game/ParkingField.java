package Game;

public class ParkingField extends Field
{
    public ParkingField(int positionID, String colorID, String name)
    {
        super(positionID, colorID,name);
    }
    public String getName()
    {
        return name;
    }
    public void landOnField()
    {}
}
