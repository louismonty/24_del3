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
/* Needs player color and next turn option
    public void carCard()
    {
        if(Player.color == "Green")

    }

 */
/*
    public void startCard()
    {
        StartField.addStartBonus();
    }

    public void fiveFieldsForwardCard()
    {
        int fieldsToMove;
        Scanner chanceScan = new Scanner(System.in);
        System.out.println("Du kan rykke op til 5 felter frem. Indtast hvor mange felter du ønsker at rykke:");
        fieldsToMove = chanceScan.nextInt();
        while(fieldsToMove<1 || fieldsToMove>5)
        {
            System.out.println("Indtast et tal mellem 1-5");
            fieldsToMove = chanceScan.nextInt();
        }
        newPlayerPosition(fieldsToMove);
    }*/

}
