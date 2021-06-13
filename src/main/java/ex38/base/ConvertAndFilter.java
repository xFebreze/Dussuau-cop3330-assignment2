package ex38.base;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class ConvertAndFilter {

    public static String Filter(String str){
        int[] num_arr = Convert(str);
        List<Integer> int_list = new ArrayList<>();

        for(int i = 0; i < num_arr.length; i++){
            if(num_arr[i]%2 == 0){
                int_list.add(num_arr[i]);
            }
        }

        return (Arrays.toString(int_list.toArray()));
    }

    public static int[] Convert(String str){
        String[] str_arr = str.split(" ");
        int[] num_arr = new int[str_arr.length];

        for(int i = 0; i < str_arr.length; i++){
            num_arr[i] = Integer.parseInt(str_arr[i]);
        }

        return num_arr;
    }


}
