package Controller;

import Game.ChanceCard;
import Game.Player;
import Game.StartField;
import gui_fields.GUI_Player;

import java.util.Random;

public class ChanceCardController
{
    private ChanceCard chanceCardDeck[] = new ChanceCard[18];
    public ChanceCardController()
    {
        chanceCardDeck[0] = new ChanceCard(0, "chanceGreen");
        chanceCardDeck[1] = new ChanceCard(1, "chanceStart");
        chanceCardDeck[2] = new ChanceCard(2, "chanceMoveForward");
        chanceCardDeck[3] = new ChanceCard(3, "chanceFreeOrange");
        chanceCardDeck[4] = new ChanceCard(4, "chanceMoveOrChance");
        chanceCardDeck[5] = new ChanceCard(5, "chanceBlue");
        chanceCardDeck[6] = new ChanceCard(6, "chanceCandy");
        chanceCardDeck[7] = new ChanceCard(7, "chanceFreeOrangeOrGreen");
        chanceCardDeck[8] = new ChanceCard(8, "chanceFreeLightblue");
        chanceCardDeck[9] = new ChanceCard(9, "chanceGetOutOfJail");
        chanceCardDeck[10] = new ChanceCard(10, "chanceStrandpromenaden");
        chanceCardDeck[11] = new ChanceCard(11, "chanceRed");
        chanceCardDeck[12] = new ChanceCard(12, "chanceBlack");
        chanceCardDeck[13] = new ChanceCard(13, "chanceBirthday");
        chanceCardDeck[14] = new ChanceCard(14, "chanceFreePinkOrBlue");
        chanceCardDeck[15] = new ChanceCard(15, "chanceHomework");
        chanceCardDeck[16] = new ChanceCard(16, "chance FreeRed");
        chanceCardDeck[17] = new ChanceCard(17, "chanceSkaterparken");
    }
    public ChanceCard drawChanceCard()
    {
        for(int i = 0; i<=chanceCardDeck.length; i++)
        {
            if(i==chanceCardDeck.length-1)
            {
                chanceCardDeck[i] = chanceCardDeck[0];
            }
            else
            chanceCardDeck[i] = chanceCardDeck[i+1];
        }
        return chanceCardDeck[0];
    }

    /**
     * method copied from https://www.geeksforgeeks.org/shuffle-a-deck-of-cards-3/
     */
    public void shuffleChanceCardDeck()
    {
        Random random = new Random();

        for (int i = 0; i <= chanceCardDeck.length; i++) {

            int r = i + random.nextInt((chanceCardDeck.length - 1) - i);

            ChanceCard temp = chanceCardDeck[r];
            chanceCardDeck[r] = chanceCardDeck[i];
            chanceCardDeck[i] = temp;
        }
        random=null;
    }
    public void executeChanceCard(FieldController FC, Player currentPlayer, GUIController GC, GUI_Player player,
                                  GUI_Player[] PlayerArray, ChanceCard currentChanceCard){
        switch (currentChanceCard.getChanceCardID()) {
            case 0:
                currentChanceCard.greenPlayerCard(Player[0]);
                GC.showChanceCard("Giv dette kort til grøn spiller, og tag et chancekort mere." +
                        "\nGrøn spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                break;
            case 1:
                currentChanceCard.startCard(currentPlayer,(StartField) FC.getGameboard()[0]);
                GC.showChanceCard("Ryk frem til start og modtag 2M.");
                break;
            case 2:
                currentChanceCard.fiveFieldsForwardCard(currentPlayer,GC);
                GC.showChanceCard("Ryk op til 5 felter frem.");
                break;
            case 3:
                currentChanceCard.freeOrangeCard(currentPlayer,FC,GC);
                GC.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 4:
                currentChanceCard.moveOneOrDrawChanceCardCard(currentPlayer,GC,this);
                GC.showChanceCard("Ryk 1 felt frem, eller tag et chancekort mere.");
                break;
            case 5:
                currentChanceCard.bluePlayerCard(Player[1]);
                GC.showChanceCard("Giv dette kort til blå spiller, og tag et chancekort mere." +
                        "\nBlå spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                break;
            case 6:
                currentChanceCard.tooMuchCandyCard(currentPlayer);
                GC.showChanceCard("Du har spist for meget slik." +
                        "\nBetal 2M til banken.");
                break;
            case 7:
                currentChanceCard.freeOrangeOrGreenCard(currentPlayer,FC,GC);
                GC.showChanceCard("Gratis felt!" +
                        "\nRyke frem til et orange eller grønt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren");
                break;
            case 8:
                currentChanceCard.freeLightBlueCard(currentPlayer,FC,GC);
                GC.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 9:
                currentChanceCard.getOutOfJailCard(currentPlayer);
                GC.showChanceCard("Du løslades uden omkostninger." +
                        "\nBehold dette kort, indtil du får brug for det.");
                break;
            case 10:
                currentChanceCard.strandpromenadenCard(currentPlayer);
                GC.showChanceCard("Ryk frem til Standpromenaden.");
                break;
            case 11:
                currentChanceCard.redPlayerCard(Player[2]);
                GC.showChanceCard("Giv dette kort til rød spiller, og tag et chancekort mere." +
                        "\nRød spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                break;
            case 12:
                currentChanceCard.blackPlayerCard(player[3]);
                GC.showChanceCard("Giv dette kort til sort spiller, og tag et chancekort mere." +
                        "\nSort spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                break;
            case 13:
                currentChanceCard.birthdayCard(currentPlayer,Player);
                GC.showChanceCard("Det er din fødselsdag! Alle giver dig 1M." +
                        "\nTillykke med fødselsdagen!");
                break;
            case 14:
                currentChanceCard.freePinkOrBlueCard(currentPlayer,FC,GC);
                GC.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et pink eller blåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 15:
                currentChanceCard.homeworkCard(currentPlayer);
                GC.showChanceCard("Du har lavet alle dine lektier!" +
                        "\nModtage 2M fra banken.");
                break;
            case 16:
                currentChanceCard.freeRedCard(currentPlayer,FC,GC);
                GC.showChanceCard("Gratis felt! Ryk frem til et rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 17:
                currentChanceCard.skaterparkenCard(currentPlayer,FC);
                GC.showChanceCard("Gratis felt!" +
                        "\nRyk frem til Skaterparken for at lave det perfekte grind! " +
                        "\nHvis ingen ejer den, får du den gratis! Ellers skal du betale leje til ejeren.");
                break;
            default :
                System.out.println("Der er ikke noget chancekort");

        }
        }
}
