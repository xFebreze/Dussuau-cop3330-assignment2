package ex39;

import ex34.base.Remover;
import ex39.base.App39;
import ex39.base.SortingRecords;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingRecordsTest {

    @Test
    public void sortingRecordsTest(){
        SortingRecords AppTest = new SortingRecords();
        App39 AppTest2 = new App39();

        Map<String, String> map1 = AppTest2.MapMaker("John","Johnson","Manager","2016-12-31");
        Map<String, String> map2 = AppTest2.MapMaker("Tou","Xiong","Software Engineer","2016-10-05");
        Map<String, String> map3 = AppTest2.MapMaker("Michaela","Michaelson","District Manager","2015-12-19");
        Map<String, String> map4 = AppTest2.MapMaker("Jake","Jacobson","Programmer","");
        Map<String, String> map5 = AppTest2.MapMaker("Jacquelyn","Jackson","DBA","");
        Map<String, String> map6 = AppTest2.MapMaker("Sally","Weber","Web Developer","2015-12-18");

        List<String> expected = new ArrayList<>();
        expected.add("Jackson");
        expected.add("Jacobson");
        expected.add("Johnson");
        expected.add("Michaelson");
        expected.add("Weber");
        expected.add("Xiong");
        List<String> actual = AppTest.sortingRecords(AppTest2.ListMaker(map1,map2,map3,map4,map5,map6));
        assertEquals(expected,actual);
    }

}
