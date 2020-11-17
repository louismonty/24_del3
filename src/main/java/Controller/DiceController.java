package Controller;

import Game.Dice;

public class DiceController {
    private static Dice dice1 = new Dice();



    /**
     * rolls the 2 dice
     * to get value use DiceValue()
     */
    public static void diceRoll(){
        dice1.roll();
    }
    public int diceValue(){
        return dice1.getFaceValue();
    }
    public String toString(){
        return "Du slog"+" "+dice1.getFaceValue();

    }

}