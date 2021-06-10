package ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;


public class App26 {

    static Scanner input = new Scanner(System.in);
    private static double balance;
    private static double APR;
    private static double monthly_pay;

    public static void main(String[] args){
        PaymentCalculator calc = new PaymentCalculator();

        ReadUserInput();

        int months = calc.calculateMonthsUntilPaidOff(balance, APR, monthly_pay);

        String output = "It will take you " + months + " months to pay off this card.";

        System.out.println(output);
    }

    public static void ReadUserInput(){
        System.out.print("What is your balance? ");
        balance = input.nextDouble();
        System.out.print("What is the APR on the card (As a percent)? ");
        APR = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        monthly_pay = input.nextDouble();
    }


}
