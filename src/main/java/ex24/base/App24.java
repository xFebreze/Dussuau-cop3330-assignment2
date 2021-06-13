package ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App24 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        AnagramDetector ad = new AnagramDetector();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String w1 = ReadInput("Enter the first string: ");
        String w2 = ReadInput("Enter the second string: ");

        boolean result = ad.isAnagram(w1, w2);

        String output = OutputGen(result, w1, w2);

        System.out.println(output);
    }

    public static String ReadInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public static String OutputGen(boolean bool, String w1, String w2){
        if(bool){
            return w1 + " and " + w2 + " are anagrams";
        }else{
            return w1 + " and " + w2 + " are not anagrams";
        }
    }
}
