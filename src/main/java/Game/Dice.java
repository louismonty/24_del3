package Game;

import java.util.Random;

public class Dice {
    private int faceValue;
    public Dice(){}
    public void roll(){
        this.faceValue = new Random(6).nextInt();
    }
    public int getFaceValue(){
        return this.faceValue;
    }
    public void setFaceValue(int newValue){
        this.faceValue = newValue;
    }

}

