package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import ex27.base.Validator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidatorTest {

    @Test
    public void Name_Filled_True(){
        Validator AppTest = new Validator();

        boolean expected = true;
        boolean actual = AppTest.name_filled("Poggers");
        assertEquals(expected,actual);
    }
    @Test
    public void Name_Filled_False(){
        Validator AppTest = new Validator();

        boolean expected = false;
        boolean actual = AppTest.name_filled("");
        assertEquals(expected,actual);
    }

    @Test
    public void Name_2Chars_True(){
        Validator AppTest = new Validator();

        boolean expected = true;
        boolean actual = AppTest.name_2chars("Poggers");
        assertEquals(expected,actual);
    }
    @Test
    public void Name_2Chars_False(){
        Validator AppTest = new Validator();

        boolean expected = false;
        boolean actual = AppTest.name_2chars("I");
        assertEquals(expected,actual);
    }

    @Test
    public void ID_True(){
        Validator AppTest = new Validator();

        boolean expected = true;
        boolean actual = AppTest.ID_validation("AA-1234");
        assertEquals(expected,actual);
    }
    @Test
    public void ID_False(){
        Validator AppTest = new Validator();

        boolean expected = false;
        boolean actual = AppTest.ID_validation("1234-aa");
        assertEquals(expected,actual);
    }

    @Test
    public void Zipcode_True(){
        Validator AppTest = new Validator();

        boolean expected = true;
        boolean actual = AppTest.zipcode_validation("12345");
        assertEquals(expected,actual);
    }
    @Test
    public void Zipcode_False(){
        Validator AppTest = new Validator();

        boolean expected = false;
        boolean actual = AppTest.zipcode_validation("123456");
        assertEquals(expected,actual);
    }

}
