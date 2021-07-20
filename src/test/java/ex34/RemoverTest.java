package ex34;

import ex34.base.Remover;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoverTest {


    @Test
    public void listAdderTrue(){
        Remover AppTest = new Remover();
        List<String> expected = new ArrayList<>();
        List<String> actual  = new ArrayList<>();
        expected.add("Alek Dussuau");
        actual.add("Alek Dussuau");
        actual.add("Justin Smith");

        AppTest.nameRemover(actual, "Justin Smith");
        assertEquals(expected,actual);
    }

}
