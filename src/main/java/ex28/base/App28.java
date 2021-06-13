package ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App28 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int ans = loop();
        System.out.println("The total is " + ans + ".");
    }

    public static int loop(){
        int ans = 0;
        for(int i = 0; i < 5; i++){
            ans += ReadInput();
        }

        return ans;
    }

    public static int ReadInput(){
        System.out.print("Enter a number: ");
        return input.nextInt();
    }
}
