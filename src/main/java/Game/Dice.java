package Game;

import java.util.Random;

public class Dice {
    Random rand = new Random();
    private int faceValue;
    public Dice(){}
    public void roll(){
        this.faceValue = rand.nextInt(6)+1;
    }
    public int getFaceValue(){
        return this.faceValue;
    }
    public void setFaceValue(int newValue){
        this.faceValue = newValue;
    }

}

