package ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.Scanner;

public class Game {
    static Scanner input = new Scanner(System.in);

    public static void game(){
        boolean play = true;
        while(play) {
            double temp = Math.random() * difficulty();
            double RNum = (int) temp;
            int count = gameLoop(RNum);
            String output = "You got it in " + count + " guess!\n";
            System.out.println(output);
            play = playAgain();
        }
    }

    public static boolean playAgain(){
        String play_temp = "";
        System.out.print("Do you wish to play again (Y/N)");
        play_temp = input.next();
        if(play_temp.equals("Y") || play_temp.equals("y")){
            return true;
        }else if(play_temp.equals("N") || play_temp.equals("n")){
            return false;
        }else {
            return false;
        }
    }

    public static int gameLoop(double num){
        int count = 1;
        int guess = 0;
        String temp = "";
        while(!OnlyNum(temp)){
            System.out.print("I have my number. What's your guess? ");
            temp = input.next();
        }
        guess = Integer.parseInt(temp);
        while(true){
            temp = "";
            if(guess == num){
                return count;
            }
            if(guess < num){
                System.out.println("Too low. Guess again: ");
            }else{
                System.out.println("Too high. Guess again: ");
            }
            while(!OnlyNum(temp)){
                System.out.print("I have my number. What's your guess? ");
                temp = input.next();
            }
            guess = Integer.parseInt(temp);
            count += 1;
        }

    }

    public static int difficulty(){
        while(true) {
            int diff = 0;
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String temp = input.next();
            if(OnlyNum(temp)){
                diff = Integer.parseInt(temp);
            }
            if(diff == 1){
                return 10;
            }else if(diff == 2){
                return 100;
            }else if(diff == 3){
                return 1000;
            }
            System.out.println("Please enter a valid input");
        }
    }

    public static boolean OnlyNum(String pass){
        return((pass != null) && (!pass.equals("")) && ( pass.matches("^[0-9]*$")));
    }

}
