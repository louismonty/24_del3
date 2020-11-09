package Game;

public abstract class Field
{
    protected int positionID;
    protected String colorID;
    protected String name;
    public Field(int positionID, String colorID, String name)
    {
        this.positionID = positionID;
        this.colorID = colorID;
        this.name = name;
    }
}
