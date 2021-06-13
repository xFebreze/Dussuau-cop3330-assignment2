package ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class BadInput31 {

    static Scanner input = new Scanner(System.in);

    public int ValidInput(String prompt){
       boolean condition = false;
       String input = "";

       while(!condition){
           input = ReadInput(prompt);

           if(OnlyNum(input)){
               int num = Integer.parseInt(input);
               if(num > 0){
                   return num;
               }

           }
           System.out.println("Sorry. That's not a valid input.");
       }
       return 0;
    };

    public static String ReadInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public boolean OnlyNum(String pass){
        return((pass != null) && (!pass.equals("")) && ( pass.matches("^[0-9]*$")));
    }
}
