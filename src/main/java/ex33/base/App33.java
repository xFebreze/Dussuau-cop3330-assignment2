package ex33.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question?\n>");
        String str = input.next();

        double tempA = Math.random()*100;
        int tempB = (int)tempA;
        int num = tempB%4;

        magicBall(num);
    }

    public static String magicBall(int num){
        String ret = "";
        if(num == 0){
            ret += "Yes";
        }else if(num == 1){
            ret += "No";
        }else if(num == 2){
            ret += "Maybe";
        }else if(num == 3){
            ret += "Ask again later.";
        }
        return ret;
    }
}
