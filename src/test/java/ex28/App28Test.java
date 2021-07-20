package ex28;


import ex28.base.App28;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class App28Test {

    @Test
    public void loopTest(){
        App28 AppTest = new App28();



        int expected = 15;
        int actual = AppTest.loop(new int[]{1,2,3,4,5});
        assertEquals(expected,actual);
    }

}
