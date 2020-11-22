package Game;

public class CustomField extends Field
{


    public CustomField(int positionID, String colorID, String name)
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
