package Game;

public class JailField extends Field
{
    private int bail;

    public JailField(int positionID, String colorID, String name)
    {
        super(positionID, colorID, name);
        bail = 1;
    }
    public String getName()
    {
        return name;
    }
    public void landOnField()
    {}
}
