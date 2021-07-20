package ex32;

import ex32.base.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void PlayAgain_True(){
        Game AppTest = new Game();

        Boolean expected = true;
        Boolean actual = AppTest.playAgain("Y");
        assertEquals(expected,actual);
    }

    @Test
    public void PlayAgain_False(){
        Game AppTest = new Game();

        Boolean expected = false;
        Boolean actual = AppTest.playAgain("N");
        assertEquals(expected,actual);
    }


}
