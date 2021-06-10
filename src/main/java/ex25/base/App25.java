package ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class App25 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Validity valid = new Validity();

        //Ask and read password
        String pass = ReadInput("Enter a password to check its strength: ");

        //send password to validity checker
        int strength = valid.PasswordStrength(pass);

        //Password strength -> String
        String output = Strength_Scale(strength, pass);

        //output validity
        System.out.println(output);
    }

    public static String ReadInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public static String Strength_Scale(int strength, String pass){
        switch(strength){
            case 1:
                return "The password '" + pass + "' is a very weak password.";
            case 2:
                return "The password '" + pass + "' is a weak password.";
            case 3:
                return "The password '" + pass + "' is a strong password.";
            case 4:
                return "The password '" + pass + "' is a very strong password.";
        }
        return "Could not calculate the password's strength";
    }
}
