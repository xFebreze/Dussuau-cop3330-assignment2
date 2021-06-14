package ex39.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App39 {

    public static void main(String[] args){

        SortingRecords sr = new SortingRecords();

        Map<String, String> map1 = MapMaker("John","Johnson","Manager","2016-12-31");
        Map<String, String> map2 = MapMaker("Tou","Xiong","Software Engineer","2016-10-05");
        Map<String, String> map3 = MapMaker("Michaela","Michaelson","District Manager","2015-12-19");
        Map<String, String> map4 = MapMaker("Jake","Jacobson","Programmer","");
        Map<String, String> map5 = MapMaker("Jacquelyn","Jackson","DBA","");
        Map<String, String> map6 = MapMaker("Sally","Webber","Web Developer","2015-12-18");

        List<Map<String, String>> list = ListMaker(map1,map2,map3,map4,map5,map6);

        sr.sortingRecords(list);
    }

    public static Map MapMaker(String FName, String LName, String Pos, String Date){
        Map<String, String> map = new HashMap<String, String>();
        map.put("firstname",FName);
        map.put("lastname",LName);
        map.put("position",Pos);
        map.put("startDate",Date);
        return map;
    }

    public static List<Map<String, String>> ListMaker(Map<String, String> m1,Map<String, String> m2,Map<String, String> m3,Map<String, String> m4,Map<String, String> m5,Map<String, String> m6){
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        return list;
    }

}
