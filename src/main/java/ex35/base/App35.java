package ex35.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.ArrayList;
import java.util.List;

public class App35 {
    static boolean condition = true;

    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        PrizePicker PP = new PrizePicker();

        while(condition){
            condition = PP.listAdder(myList);
        }
    }
}
