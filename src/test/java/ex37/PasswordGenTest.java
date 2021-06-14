package ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
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
