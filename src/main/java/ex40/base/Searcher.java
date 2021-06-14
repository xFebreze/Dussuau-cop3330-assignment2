package ex40.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class Searcher {

    public static void searcher(List<Map<String,String>> list){
        List<String> firstnameList = firstnameListMaker(list);
        List<String> lastnameList = lastnameListMaker(list);

        String searched = Search();

        System.out.println("Name\t\t\t\t   | Position\t\t   | Separation Date");
        System.out.println("---------------------------------------------------------------------");

        for(int i = 0; i < list.size(); i++){

            if(searched.equals((firstnameList.get(i)).substring(0,searched.length())) || searched.equals((lastnameList.get(i)).substring(0,searched.length()))){
                System.out.printf("%10s %11s | %17s | %11s",(list.get(i)).get("firstname"),(list.get(i)).get("lastname"),
                        (list.get(i)).get("position"),(list.get(i)).get("startDate"));
                System.out.println();
            }

        }


    }

    public static List<String> firstnameListMaker(List<Map<String,String>> list){
        List<String> firstnameList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            firstnameList.add((list.get(i)).get("firstname").toString());
        }
        return firstnameList;
    }

    public static List<String> lastnameListMaker(List<Map<String,String>> list){
        List<String> lastnameList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            lastnameList.add((list.get(i)).get("lastname").toString());
        }
        return lastnameList;
    }

    public static String Search(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        return input.nextLine();
    }
}
