package Controller;

import Game.*;

public class FieldController
{
    private Field gameboard[] = new Field[24];

    public FieldController()
    {

        gameboard[0] = new StartField(0, "white", "Start");
        gameboard[1] = new PropertyField(1, "orange", "Burgerbaren", 1, 1, gameboard[2]);
        gameboard[2] = new PropertyField(2, "orange", "Pizzariaet", 1, 1, gameboard[1]);
        gameboard[3] = new ChanceField(3, "white", "Chance");
        gameboard[4] = new PropertyField(4, "lightblue", "Slikbutikken", 1, 1, gameboard[5]);
        gameboard[5] = new PropertyField(5, "lightblue", "Iskiosken", 1, 1, gameboard[4]);
        gameboard[6] = new CustomField(6, "white", "I fængsel");
        gameboard[7] = new PropertyField(7, "pink", "Museet", 2, 2, gameboard[8]);
        gameboard[8] = new PropertyField(8, "pink", "Biblioteket", 2, 2, gameboard[7]);
        gameboard[9] = new ChanceField(9, "white", "Chance");
        gameboard[10] = new PropertyField(10, "gold", "Skaterparken", 2, 2, gameboard[11]);
        gameboard[11] = new PropertyField(11, "gold", "Swimmingpoolen", 2, 2, gameboard[10]);
        gameboard[12] = new CustomField(12, "white", "Parkering");
        gameboard[13] = new PropertyField(13, "red", "Spillehallen", 3, 3, gameboard[14]);
        gameboard[14] = new PropertyField(14, "red", "Biografen", 3, 3, gameboard[13]);
        gameboard[15] = new ChanceField(15, "white", "Chance");
        gameboard[16] = new PropertyField(16, "yellow", "Legetøjsbutikken", 3, 3, gameboard[17]);
        gameboard[17] = new PropertyField(17, "yellow", "Dyrehandlen", 3, 3, gameboard[16]);
        gameboard[18] = new JailField(18, "white", "Gå i fængsel");
        gameboard[19] = new PropertyField(19, "green", "Bowlinghallen", 4, 4, gameboard[20]);
        gameboard[20] = new PropertyField(20, "green", "Zoo", 4, 4, gameboard[19]);
        gameboard[21] = new ChanceField(21, "white", "Chance");
        gameboard[22] = new PropertyField(22, "blue", "Vandlandet", 5, 5, gameboard[23]);
        gameboard[23] = new PropertyField(23, "blue", "Strandpromenaden", 5, 5, gameboard[22]);
    }
    public Field[] getGameboard()
    {
        return gameboard;
    }
}
