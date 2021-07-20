package ex35;

import ex32.base.Game;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrizePickerTest {

    @Test
    public void listAdderTrue(){
        ex35.base.PrizePicker AppTest = new ex35.base.PrizePicker();
        List<String> temp = new ArrayList<>();
        temp.add("one");

        Boolean expected = true;
        Boolean actual = AppTest.listAdder(temp,"1");
        assertEquals(expected,actual);
    }

    @Test
    public void listAdderFalse(){
        ex35.base.PrizePicker AppTest = new ex35.base.PrizePicker();
        List<String> temp = new ArrayList<>();
        temp.add("one");


        Boolean expected = false;
        Boolean actual = AppTest.listAdder(temp,"");
        assertEquals(expected,actual);
    }
}
