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

    public static void magicBall(int num){
        if(num == 0){
            System.out.println("Yes");
        }else if(num == 1){
            System.out.println("No");
        }else if(num == 2){
            System.out.println("Maybe");
        }else if(num == 3){
            System.out.println("Ask again later.");
        }
    }
}
