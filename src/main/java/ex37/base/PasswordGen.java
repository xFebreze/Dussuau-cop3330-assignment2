package ex37.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import java.util.ArrayList;
import java.util.List;


public class PasswordGen {
    public static String passMaker(int minLength, int special, int number) {
        List<Character> letterList = letterListMaker();
        List<Character> numberList = numberListMaker();
        List<Character> specialList = specialListMaker();

        int length = lengthFinder(minLength,special,number);

        String password = "";

        for(int i = 0; i < length-special-number; i++){
            double randD = Math.random()*100*letterList.size();
            int rand = (int)randD%letterList.size();
            password += letterList.get(rand);
        }

        for(int i = 0; i < special; i++){
            double randD = Math.random()*100*specialList.size();
            int rand = (int)randD%specialList.size();
            password += specialList.get(rand);
        }

        for(int i = 0; i < number; i++){
            double randD = Math.random()*100*numberList.size();
            int rand = (int)randD%numberList.size();
            password += numberList.get(rand);
        }

        return "Your password is " + password;
    }

    public static int lengthFinder(int minLength, int special, int number){
        int SpcAndNum = special + number;
        int length = minLength;
        while(length < SpcAndNum*2){
            length++;
        }
        return length;
    }

    public static List<Character> letterListMaker(){
        String lettersString = "abcdefghijklmnopqrstuvwxyz";
        List<Character> lettersList = new ArrayList<>();
        for(int i = 0; i < lettersString.length(); i++) {
            lettersList.add(lettersString.toCharArray()[i]);
        }
        return lettersList;
    }

    public static List<Character> numberListMaker(){
        String numberString = "1234567890";
        List<Character> numberList = new ArrayList<>();
        for(int i = 0; i < numberString.length(); i++) {
            numberList.add(numberString.toCharArray()[i]);
        }
        return numberList;
    }

    public static List<Character> specialListMaker(){
        String specialString = "!@#$%^&*-_~";
        List<Character> specialList = new ArrayList<>();
        for(int i = 0; i < specialString.length(); i++) {
            specialList.add(specialString.toCharArray()[i]);
        }
        return specialList;
    }
}
