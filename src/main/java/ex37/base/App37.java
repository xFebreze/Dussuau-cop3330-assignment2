package ex37.base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class App37 {

    static int length = 0;
    static int spcChars = 0;
    static int nums = 0;

    public static void main(String[] args){
        PasswordGen gen = new PasswordGen();

        UserInputs();

        String output = PasswordGen.passMaker(length,spcChars,nums);

        System.out.print(output);
    }

    public static void UserInputs(){
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        length = input.nextInt();
        System.out.print("How many special characters? ");
        spcChars = input.nextInt();
        System.out.print("How many numbers? ");
        nums = input.nextInt();
    }
}
