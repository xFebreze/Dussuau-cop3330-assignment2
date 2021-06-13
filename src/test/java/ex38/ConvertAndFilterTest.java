package ex38;

import ex38.base.ConvertAndFilter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertAndFilterTest {

    @Test
    public void Convert_Test(){
        ConvertAndFilter AppTest = new ConvertAndFilter();


        int[] expected = {1,2,3,4,5,6};
        int[] actual = AppTest.Convert("1 2 3 4 5 6");
        for(int i = 0; i < 6; i++){
            assertEquals(expected[i],actual[i]);
        }
    }

    @Test
    public void Filter_Test(){
        ConvertAndFilter AppTest = new ConvertAndFilter();

        String expected = "[2, 4, 6, 8]";
        String actual = AppTest.Filter("1 2 3 4 5 6 7 8");
        assertEquals(expected, actual);
    }
}
