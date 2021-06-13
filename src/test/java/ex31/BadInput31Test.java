package ex31;

import ex31.base.BadInput31;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadInput31Test {
    @Test
    public void OnlyNum_Test_True(){
        BadInput31 AppTest = new BadInput31();

        boolean expected = true;
        boolean actual = AppTest.OnlyNum("1234123123");
        assertEquals(expected,actual);
    }

    @Test
    public void OnlyNum_Test_False(){
        BadInput31 AppTest = new BadInput31();

        boolean expected = false;
        boolean actual = AppTest.OnlyNum("123412a3123");
        assertEquals(expected,actual);
    }

}
