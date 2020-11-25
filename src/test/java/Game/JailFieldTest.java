package Game;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class JailFieldTest {

    @Test
    void goToJail() {
        Player player = new Player("test",2.0,new Account(10), Color.BLACK,1);
        JailField jailField = new JailField(1,"t","test");
        jailField.goToJail(player);
        assertEquals(player.getIsInJail(),true);
    }
}