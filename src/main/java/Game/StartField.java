package Game;

public class StartField extends Field
{
    private int startBonus;
    public StartField(int positionID, String colorID, String name)
    {
        super(positionID, colorID, name);
        this.startBonus = 2;
    }
    public int getStartBonus()
    {
        return startBonus;
    }
}
