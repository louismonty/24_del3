package Controller;

import Game.*;

public class FieldController
{
    Field gameboard[] = new Field[24];
    ChanceCard chanceCardDeck[] = new ChanceCard[18];
    public FieldController()
    {

    }

    /**
     * Creates gameboard by making an array of fields inheriting the Field class.
     */
    public void createGameBoardFields()
    {
        gameboard[0] = new StartField(0, "white", "Start");
        gameboard[1] = new PropertyField(1, "orange", "Burgerbaren", 1, 1);
        gameboard[2] = new PropertyField(2, "orange", "Pizzariaet", 1, 1);
        gameboard[3] = new ChanceField(3, "white", "Chance");
        gameboard[4] = new PropertyField(4, "lightblue", "Slikbutikken", 1, 1);
        gameboard[5] = new PropertyField(5, "lightblue", "Iskiosken", 1, 1);
        gameboard[6] = new JailField(6, "white", "I fængsel");
        gameboard[7] = new PropertyField(7, "purple", "Museet", 2, 2);
        gameboard[8] = new PropertyField(8, "purple", "Biblioteket", 2, 2);
        gameboard[9] = new ChanceField(9, "white", "Chance");
        gameboard[10] = new PropertyField(10, "gold", "Skaterparken", 2, 2);
        gameboard[11] = new PropertyField(11, "gold", "Swimmingpoolen", 2, 2);
        gameboard[12] = new ParkingField(12, "white", "Parkering");
        gameboard[13] = new PropertyField(13, "red", "Spillehallen", 3, 3);
        gameboard[14] = new PropertyField(14, "red", "Biografen", 3, 3);
        gameboard[15] = new ChanceField(15, "white", "Chance");
        gameboard[16] = new PropertyField(16, "yellow", "Legetøjsbutikken", 3, 3);
        gameboard[17] = new PropertyField(17, "yellow", "Dyrehandlen", 3, 3);
        gameboard[18] = new JailField(18, "white", "Gå i fængsel");
        gameboard[19] = new PropertyField(19, "green", "Bowlinghallen", 4, 4);
        gameboard[20] = new PropertyField(20, "green", "Zoo", 4, 4);
        gameboard[21] = new ChanceField(21, "white", "Chance");
        gameboard[22] = new PropertyField(22, "blue", "Vandlandet", 5, 5);
        gameboard[23] = new PropertyField(23, "blue", "Vandlandet", 5, 5);
    }
    public void createChanceCardDeck()
    {
        chanceCardDeck[0] = new ChanceCard();
        chanceCardDeck[1] = new ChanceCard();
        chanceCardDeck[2] = new ChanceCard();
        chanceCardDeck[3] = new ChanceCard();
        chanceCardDeck[4] = new ChanceCard();
        chanceCardDeck[5] = new ChanceCard();
        chanceCardDeck[6] = new ChanceCard();
        chanceCardDeck[7] = new ChanceCard();
        chanceCardDeck[8] = new ChanceCard();
        chanceCardDeck[9] = new ChanceCard();
        chanceCardDeck[10] = new ChanceCard();
        chanceCardDeck[11] = new ChanceCard();
        chanceCardDeck[12] = new ChanceCard();
        chanceCardDeck[13] = new ChanceCard();
        chanceCardDeck[14] = new ChanceCard();
        chanceCardDeck[15] = new ChanceCard();
        chanceCardDeck[16] = new ChanceCard();
        chanceCardDeck[17] = new ChanceCard();
    }
}
