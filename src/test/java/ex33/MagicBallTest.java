package ex33;

import ex33.base.App33;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicBallTest {

    @Test
    public void Magic_Ball_Input1(){
        App33 AppTest = new App33();

        String expected = "Yes";
        String actual = AppTest.magicBall(0);
        assertEquals(expected,actual);
    }

    @Test
    public void Magic_Ball_Input2(){
        App33 AppTest = new App33();

        String expected = "No";
        String actual = AppTest.magicBall(1);
        assertEquals(expected,actual);
    }

    @Test
    public void Magic_Ball_Input3(){
        App33 AppTest = new App33();

        String expected = "Maybe";
        String actual = AppTest.magicBall(2);
        assertEquals(expected,actual);
    }

    @Test
    public void Magic_Ball_Input4(){
        App33 AppTest = new App33();

        String expected = "Ask again later.";
        String actual = AppTest.magicBall(3);
        assertEquals(expected,actual);
    }
}
