package Controller;

import Game.Dice;

public class DiceController {
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();


    /**
     * rolls the 2 dice
     * to get value use DiceValue()
     */
    public void DiceRoll(){
        dice1.roll();
        dice2.roll();
    }
    public int DiceValue(){
        return dice1.getFaceValue()+dice2.getFaceValue();
    }
    public String toString(){
        return "Du slog"+dice1.getFaceValue()+" "+dice2.getFaceValue();

    }

}