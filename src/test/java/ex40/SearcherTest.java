package ex40;


import ex40.base.App40;
import ex40.base.Searcher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class SearcherTest {
    @Test
    public void firstNameTest(){
        Searcher AppTest = new Searcher();
        App40 AppTest2 = new App40();

        Map<String, String> map1 = AppTest2.MapMaker("John","Johnson","Manager","2016-12-31");
        Map<String, String> map2 = AppTest2.MapMaker("Tou","Xiong","Software Engineer","2016-10-05");
        Map<String, String> map3 = AppTest2.MapMaker("Michaela","Michaelson","District Manager","2015-12-19");
        Map<String, String> map4 = AppTest2.MapMaker("Jake","Jacobson","Programmer","");
        Map<String, String> map5 = AppTest2.MapMaker("Jacquelyn","Jackson","DBA","");
        Map<String, String> map6 = AppTest2.MapMaker("Sally","Weber","Web Developer","2015-12-18");

        List<String> expected = new ArrayList<>();
        expected.add("John");
        expected.add("Tou");
        expected.add("Michaela");
        expected.add("Jake");
        expected.add("Jacquelyn");
        expected.add("Sally");
        List<String> actual = AppTest.firstnameListMaker(AppTest2.ListMaker(map1,map2,map3,map4,map5,map6));
        assertEquals(expected,actual);
    }

    @Test
    public void lastNameTest(){
        Searcher AppTest = new Searcher();
        App40 AppTest2 = new App40();

        Map<String, String> map1 = AppTest2.MapMaker("John","Johnson","Manager","2016-12-31");
        Map<String, String> map2 = AppTest2.MapMaker("Tou","Xiong","Software Engineer","2016-10-05");
        Map<String, String> map3 = AppTest2.MapMaker("Michaela","Michaelson","District Manager","2015-12-19");
        Map<String, String> map4 = AppTest2.MapMaker("Jake","Jacobson","Programmer","");
        Map<String, String> map5 = AppTest2.MapMaker("Jacquelyn","Jackson","DBA","");
        Map<String, String> map6 = AppTest2.MapMaker("Sally","Weber","Web Developer","2015-12-18");

        List<String> expected = new ArrayList<>();
        expected.add("Johnson");
        expected.add("Xiong");
        expected.add("Michaelson");
        expected.add("Jacobson");
        expected.add("Jackson");
        expected.add("Weber");
        List<String> actual = AppTest.lastnameListMaker(AppTest2.ListMaker(map1,map2,map3,map4,map5,map6));
        assertEquals(expected,actual);
    }
}
