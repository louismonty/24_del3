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
        chanceCardDeck[0] = new ChanceCard(0, "chanceGreen",false);
        chanceCardDeck[1] = new ChanceCard(1, "chanceStart",true);
        chanceCardDeck[2] = new ChanceCard(2, "chanceMoveForward",true);
        chanceCardDeck[3] = new ChanceCard(3, "chanceFreeOrange",true);
        chanceCardDeck[4] = new ChanceCard(4, "chanceMoveOrChance",true);
        chanceCardDeck[5] = new ChanceCard(5, "chanceBlue",false);
        chanceCardDeck[6] = new ChanceCard(6, "chanceCandy",false);
        chanceCardDeck[7] = new ChanceCard(7, "chanceFreeOrangeOrGreen",true);
        chanceCardDeck[8] = new ChanceCard(8, "chanceFreeLightblue",true);
        chanceCardDeck[9] = new ChanceCard(9, "chanceGetOutOfJail",false);
        chanceCardDeck[10] = new ChanceCard(10, "chanceStrandpromenaden",true);
        chanceCardDeck[11] = new ChanceCard(11, "chanceRed",false);
        chanceCardDeck[12] = new ChanceCard(12, "chanceBlack",false);
        chanceCardDeck[13] = new ChanceCard(13, "chanceBirthday",false);
        chanceCardDeck[14] = new ChanceCard(14, "chanceFreePinkOrBlue",true);
        chanceCardDeck[15] = new ChanceCard(15, "chanceHomework",true);
        chanceCardDeck[16] = new ChanceCard(16, "chance FreeRed",true);
        chanceCardDeck[17] = new ChanceCard(17, "chanceSkaterparken",true);
    }
    public ChanceCard drawChanceCard()
    {
        for(int i = 0; i<=chanceCardDeck.length-1; i++)
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

        for (int i = 0; i < chanceCardDeck.length; i++) {

            int r = i + random.nextInt((chanceCardDeck.length ) - i);

            ChanceCard temp = chanceCardDeck[r];
            chanceCardDeck[r] = chanceCardDeck[i];
            chanceCardDeck[i] = temp;
        }
        random=null;
    }
    public void executeChanceCard(FieldController fieldController, Player currentPlayer,Player[] players, GUIController guiController, GUI_Player player,
                                  GUI_Player[] PlayerArray, ChanceCard currentChanceCard){
        switch (currentChanceCard.getChanceCardID()) {
            case 0:
                currentChanceCard.greenPlayerCard(players[0]);
                guiController.showChanceCard("Giv dette kort til grøn spiller, og tag et chancekort mere." +
                        "\nGrøn spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                guiController.showMessege("Træk et nyt chancekort");
                drawChanceCard();
                break;
            case 1:
                currentChanceCard.startCard(currentPlayer,player,(StartField) fieldController.getGameboard()[0],guiController);
                guiController.showChanceCard("Ryk frem til start og modtag 2M.");
                break;
            case 2:
                currentChanceCard.fiveFieldsForwardCard(currentPlayer,player,guiController);
                guiController.showChanceCard("Ryk op til 5 felter frem.");
                break;
            case 3:
                currentChanceCard.freeOrangeCard(currentPlayer,fieldController,guiController,player);
                guiController.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et orange felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 4:
                currentChanceCard.moveOneOrDrawChanceCardCard(currentPlayer,guiController,this,player);
                guiController.showChanceCard("Ryk 1 felt frem, eller tag et chancekort mere.");
                break;
            case 5:
                currentChanceCard.bluePlayerCard(players[1]);
                guiController.showChanceCard("Giv dette kort til blå spiller, og tag et chancekort mere." +
                        "\nBlå spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                guiController.showMessege("Træk et nyt chancekort");
                drawChanceCard();
                break;
            case 6:
                currentChanceCard.tooMuchCandyCard(currentPlayer);
                guiController.showChanceCard("Du har spist for meget slik." +
                        "\nBetal 2M til banken.");
                break;
            case 7:
                currentChanceCard.freeOrangeOrGreenCard(currentPlayer,fieldController,guiController,player);
                guiController.showChanceCard("Gratis felt!" +
                        "\nRyke frem til et orange eller grønt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren");
                break;
            case 8:
                currentChanceCard.freeLightBlueCard(currentPlayer,fieldController,guiController,player);
                guiController.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et lyseblåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 9:
                currentChanceCard.getOutOfJailCard(currentPlayer);
                guiController.showChanceCard("Du løslades uden omkostninger." +
                        "\nBehold dette kort, indtil du får brug for det.");
                break;
            case 10:
                currentChanceCard.strandpromenadenCard(currentPlayer,player,guiController);
                guiController.showChanceCard("Ryk frem til Standpromenaden.");
                break;
            case 11:
                guiController.showChanceCard("Giv dette kort til rød spiller, og tag et chancekort mere." +
                        "\nRød spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                guiController.showMessege("Træk et nyt chancekort");
                drawChanceCard();
                if(players[2] != null)
                    currentChanceCard.redPlayerCard(players[2]);
                break;
            case 12:
                guiController.showChanceCard("Giv dette kort til sort spiller, og tag et chancekort mere." +
                        "\nSort spiller: På din næste tur skal du drøne frem til et hvilket som helst ledigt felt og købe det." +
                        "\nHvis der ikke er nogen ledige felter, skal du købe et fra en anden spiller!");
                guiController.showMessege("Træk et nyt chancekort");
                drawChanceCard();
                if(players[3] != null)
                    currentChanceCard.blackPlayerCard(players[3]);
                break;
            case 13:
                currentChanceCard.birthdayCard(currentPlayer,players);
                guiController.showChanceCard("Det er din fødselsdag! Alle giver dig 1M." +
                        "\nTillykke med fødselsdagen!");
                break;
            case 14:
                currentChanceCard.freePinkOrBlueCard(currentPlayer,fieldController,guiController,player);
                guiController.showChanceCard("Gratis felt!" +
                        "\nRyk frem til et pink eller blåt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 15:
                currentChanceCard.homeworkCard(currentPlayer);
                guiController.showChanceCard("Du har lavet alle dine lektier!" +
                        "\nModtage 2M fra banken.");
                break;
            case 16:
                currentChanceCard.freeRedCard(currentPlayer,fieldController,guiController,player);
                guiController.showChanceCard("Gratis felt! Ryk frem til et rødt felt. Hvis det er ledigt, får du det gratis! Ellers skal du betale leje til ejeren.");
                break;
            case 17:
                currentChanceCard.skaterparkenCard(currentPlayer,fieldController,player,guiController);
                guiController.showChanceCard("Gratis felt!" +
                        "\nRyk frem til Skaterparken for at lave det perfekte grind! " +
                        "\nHvis ingen ejer den, får du den gratis! Ellers skal du betale leje til ejeren.");
                break;
            default :
                System.out.println("Der er ikke noget chancekort");

        }
        }
}
