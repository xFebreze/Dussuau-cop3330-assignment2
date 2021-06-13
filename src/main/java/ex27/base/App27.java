package ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App27 {

    static Scanner input = new Scanner(System.in);
    static String FName = "";
    static String LName = "";
    static String ID = "";
    static String Zip = "";


    public static void main(String[] args){
        Validator valid = new Validator();

        ReadUserInput();

        String temp = valid.validateInput(FName, LName, Zip, ID);

        System.out.print(temp);
    }

    public static void ReadUserInput(){
        System.out.print("Enter the first name: ");
        FName = input.nextLine();
        System.out.print("Enter the last name: ");
        LName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        Zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = input.nextLine();
    }

}
