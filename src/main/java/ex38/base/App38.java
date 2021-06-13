package ex38.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class App38 {
    public static void main(String[] args){
        ConvertAndFilter CnV = new ConvertAndFilter();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = input.nextLine();

        //convert string of numbers and spaces into a array (In other class) //Get rid of odd numbers (in other class)
        String outputNum = CnV.Filter(numbers);

        //print output
        output(outputNum);
    }

    public static void output(String outputNum){
        String output = "The even numbers are: " + outputNum;
        System.out.println(output);
    }
}
