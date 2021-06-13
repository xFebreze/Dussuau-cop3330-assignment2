package ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App29 {

    public static void main(String[] args){
        BadInput verification = new BadInput();

        int n = verification.ValidInput();

        int years = 72/n;

        String output = "It will take " + years + " years to double your initial investment.";

        System.out.println(output);
    }


}
