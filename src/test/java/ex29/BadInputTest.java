package ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import ex29.base.BadInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadInputTest {
    @Test
    public void OnlyNum_Test_True(){
        BadInput AppTest = new BadInput();

        boolean expected = true;
        boolean actual = AppTest.OnlyNum("1234123123");
        assertEquals(expected,actual);
    }

    @Test
    public void OnlyNum_Test_False(){
        BadInput AppTest = new BadInput();

        boolean expected = false;
        boolean actual = AppTest.OnlyNum("123412a3123");
        assertEquals(expected,actual);
    }
}
