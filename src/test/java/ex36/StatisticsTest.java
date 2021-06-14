package ex36;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import ex36.base.Statistics;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest {

    public static List<Integer> list = new ArrayList<>();

    @Test
    public void setVar(){
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
    }

    @Test
    public void avgTest(){


        Statistics AppTest = new Statistics();

        double expected = 400.0;
        double actual = AppTest.avg(list);
        assertEquals(expected, actual);
    }

    @Test
    public void minTest(){
        Statistics AppTest = new Statistics();

        int expected = 100;
        int actual = AppTest.min(list);
        assertEquals(expected, actual);
    }

    @Test
    public void maxTest(){
        Statistics AppTest = new Statistics();

        int expected = 1000;
        int actual = AppTest.max(list);
        assertEquals(expected, actual);
    }

    @Test
    public void stdTest(){
        Statistics AppTest = new Statistics();

        double expected = 353.553391;
        double actual = AppTest.std(list);
        assertEquals(expected, actual);
    }
}
