package ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.List;
import java.util.Scanner;

public class Remover {
    public static List<String> nameRemover(List<String> nameList){
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter an employee name to remove: ");
        String removeName = input.nextLine();

        nameList.remove(removeName);

        return nameList;
    }
}
