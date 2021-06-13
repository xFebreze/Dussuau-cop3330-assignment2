package ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App34 {
    public static void main(String[] args){
        Remover rmv = new Remover();
        String[] nameList = {"Alek Dussuau","Christopher Rivera","Justin Smith","Benjamin Giang","Marc Cross"};
        List<String> myList = new ArrayList(Arrays.asList(nameList));

        printNames(myList);

        List<String> newNameList = rmv.nameRemover(myList);

        printNames(newNameList);
    }

    public static void printNames(List<String> nameList){
        System.out.printf("There are %d employees: \n", nameList.size());
        for(int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
    }
}
