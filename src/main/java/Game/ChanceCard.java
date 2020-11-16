package Game;
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
        Account.AddBalance(StartField.getStartBonus());
    }

    public void fiveFieldsForwardCard()
    {
        int fieldsToMove = 0;
        Scanner chanceScan = new Scanner(System.in);
        System.out.println("Du kan rykke op til 5 felter frem. Indtast hvor mange felter du ønsker at rykke:");

        while(fieldsToMove<1 || fieldsToMove>5)
        {
            System.out.println("Indtast et tal mellem 1-5");
            fieldsToMove = chanceScan.nextInt();
        }
        newPlayerPosition(fieldsToMove);
    }



}
