package ex36.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class Statistics {

    public static boolean numList(List<Integer> list){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String tempString = input.nextLine();

        if(tempString.equalsIgnoreCase("done")){
            printList(list);
            printStats(list);
            return false;
        }else if(OnlyNum(tempString)){
            int num = Integer.parseInt(tempString);
            list.add(num);
        }else{
            System.out.println("Please enter a valid input :)");
        }
        return true;
    }

    public static void printList(List<Integer> list){
        System.out.print("Numbers: ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size()-1){
                System.out.print(", ");
            }
        }
    }

    public static void printStats(List<Integer> list){
        System.out.println("\nThe average is "+avg(list));
        System.out.println("The minimum is "+min(list));
        System.out.println("The maximum is "+max(list));
        System.out.printf("The Standard deviation is %.2f",std(list));
    }

    public static double avg(List<Integer> list){
        double sum = 0.0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum/list.size();
    }

    public static double avgD(List<Double> list){
        double sum = 0.0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum/list.size();
    }

    public static int min(List<Integer> list){
        Collections.sort(list);
        return list.get(0);
    }

    public static int max(List<Integer> list){
        Collections.sort(list);
        return list.get(list.size()-1);
    }

    public static double std(List<Integer> list){
        double avg = avg(list);
        List <Double> stdList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            stdList.add((list.get(i)-avg) * (list.get(i)-avg));
        }
        double stdavg = avgD(stdList);
        return Math.sqrt(stdavg);
    }

    public static boolean OnlyNum(String pass){
        return((pass != null) && (!pass.equals("")) && ( pass.matches("^[0-9]*$")));
    }
}
