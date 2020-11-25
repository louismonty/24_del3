package Controller;

import Game.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldControllerTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void getGameboard() {
        FieldController fieldController = new FieldController();
        assertEquals(fieldController.getGameboard()[0] instanceof StartField,true);
        assertEquals(fieldController.getGameboard()[1] instanceof PropertyField,true);
        assertEquals(fieldController.getGameboard()[3] instanceof ChanceField,true);
        assertEquals(fieldController.getGameboard()[6] instanceof CustomField,true);
        assertEquals(fieldController.getGameboard()[18] instanceof JailField,true);
    }
}