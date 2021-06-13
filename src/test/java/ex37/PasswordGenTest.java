package ex37;

import ex37.base.PasswordGen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordGenTest {

    @Test
    public void lengthFinderTest(){
        PasswordGen AppTest = new PasswordGen();

        int expected = 8;
        int actual = AppTest.lengthFinder(8,2,2);
        assertEquals(expected,actual);
    }
}
