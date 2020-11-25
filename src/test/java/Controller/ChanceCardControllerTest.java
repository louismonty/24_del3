package Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceCardControllerTest {

    @Test
    void drawChanceCard() {
    }

    @Test
    void shuffleChanceCardDeck() {
        ChanceCardController chanceCardController = new ChanceCardController();
        chanceCardController.shuffleChanceCardDeck();
        int[] notShuffled = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        boolean shuffled = false;
        for(int i = 0; i<18;i++ ){
            if(chanceCardController.drawChanceCard().getChanceCardID() != notShuffled[i]){
                shuffled = true;
            }
        }
        assertEquals(shuffled, true);
    }
}