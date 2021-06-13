package ex35.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.List;
import java.util.Scanner;

public class PrizePicker {

    public static boolean listAdder(List<String> kekw){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String tempName = input.nextLine();

        if(tempName.equals("")){
            pickWinner(kekw);
            return false;
        }else{
            kekw.add(tempName);
        }
        return true;
    }

    public static void pickWinner(List<String> pogo){
        double random_double = Math.random() * 100;
        int random_int = (int)random_double;
        int winner_num = random_int%pogo.size();

        String winner = pogo.get(winner_num);
        System.out.println("The winner is... "+winner);
    }
}
