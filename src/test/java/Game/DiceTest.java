package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll() {
        boolean isDiceLegal = true;
        Dice d1 = new Dice();
        for(int i = 0;i < 1000;i++){
            d1.roll();
            if( 0<=d1.getFaceValue() && d1.getFaceValue()<=6){
                //
            }else{
                isDiceLegal = false;
                break;}
            assertEquals(isDiceLegal, true);

        }
    }


    @Test
    void setFaceValue() {
        Dice d1 = new Dice();
        d1.setFaceValue(2);
        assertEquals(d1.getFaceValue(),2);
    }
}