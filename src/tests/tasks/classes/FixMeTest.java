package tests.tasks.classes;

import application.tasks.classes.FixMe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FixMeTest {
    FixMe fixMe =new FixMe();
    @Test
    void getPlus100() {
        assertEquals(200,fixMe.plus100(100));
    }
}