package Controller;

import Game.ChanceCard;

import java.util.Random;

public class ChanceCardController
{
    private ChanceCard chanceCardDeck[] = new ChanceCard[18];
    public ChanceCardController()
    {
        chanceCardDeck[0] = new ChanceCard(0, "chanceCar");
        chanceCardDeck[1] = new ChanceCard(1, "chanceStart");
        chanceCardDeck[2] = new ChanceCard(2, "chanceMoveForward");
        chanceCardDeck[3] = new ChanceCard(3, "chanceFreeOrange");
        chanceCardDeck[4] = new ChanceCard(4, "chanceMoveOrChance");
        chanceCardDeck[5] = new ChanceCard(5, "chanceShip");
        chanceCardDeck[6] = new ChanceCard(6, "chanceCandy");
        chanceCardDeck[7] = new ChanceCard(7, "chanceFreeOrangeOrGreen");
        chanceCardDeck[8] = new ChanceCard(8, "chanceFreeLightblue");
        chanceCardDeck[9] = new ChanceCard(9, "chanceGetOutOfJail");
        chanceCardDeck[10] = new ChanceCard(10, "chanceStrandpromenaden");
        chanceCardDeck[11] = new ChanceCard(11, "chanceCat");
        chanceCardDeck[12] = new ChanceCard(12, "chanceDog");
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
}