package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import ex24.base.AnagramDetector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramDetectorTest {

    @Test
    public void isAnagram_return_true(){
        AnagramDetector AppTest = new AnagramDetector();

        boolean expected = true;
        boolean actual = AppTest.isAnagram("note", "onet");
        assertEquals(expected, actual);
    }

    @Test
    public void isAnagram_return_false(){
        AnagramDetector AppTest = new AnagramDetector();

        boolean expected = false;
        boolean actual = AppTest.isAnagram("note", "dog");
        assertEquals(expected, actual);
    }
}
