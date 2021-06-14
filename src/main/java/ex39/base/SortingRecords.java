package ex39.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SortingRecords {

    public static void sortingRecords(List<Map<String,String>> list){

        List<String> lastnameList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            lastnameList.add((list.get(i)).get("lastname").toString());
        }

        Collections.sort(lastnameList);

        printSortedRecords(list, lastnameList);
    }

    public static void printSortedRecords(List<Map<String,String>> list, List<String> lastnameList){
        System.out.println("Name\t\t\t\t   | Position\t\t   | Separation Date");
        System.out.println("--------------------------------------------------------------------------------------");
        for(int i = 0; i < lastnameList.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if((lastnameList.get(i)).equals((list.get(j)).get("lastname"))){
                    System.out.printf("%10s %11s | %17s | %11s",(list.get(j)).get("firstname"),(list.get(j)).get("lastname"),
                                      (list.get(j)).get("position"),(list.get(j)).get("startDate"));
                    System.out.println();
                }
            }
        }
    }
}
