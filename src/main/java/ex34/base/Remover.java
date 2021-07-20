package ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.List;
import java.util.Scanner;

public class Remover {

    public static List<String> nameRemover(List<String> nameList, String removeName){

        nameList.remove(removeName);

        return nameList;
    }
}
