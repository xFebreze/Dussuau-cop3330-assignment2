package ex36.base;

import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class App36 {

    static boolean condition = true;

    public static void main(String[] args){
        List<Integer> myList = new ArrayList();
        Statistics STATS = new Statistics();

        while(condition){
            condition = STATS.numList(myList);
        }
    }
}
