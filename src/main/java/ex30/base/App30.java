package ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class App30 {
    public static void main(String[] args){
        System.out.print(multiTable());

    }

    public static String multiTable(){
        String ret = "";

        for(int i = 1; i <= 12; i++){

            for(int j = 1; j <= 12; j++){
                ret += String.format("%4d", i * j);
            }
            ret += "\n";
        }
        return ret;
    }
}
