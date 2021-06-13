package ex27.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class Validator {
    public static String validateInput(String FName, String LName, String zip, String ID){
        String temp = "";
        if(!name_filled(FName)){
            temp += "The first name must be filled in.\n";
        }
        if(!name_filled(LName)){
            temp += "The last name must be filled in.\n";
        }
        if(!name_2chars(FName)){
            temp += "The first name must be longer than 2 characters.\n";
        }
        if(!name_2chars(LName)){
            temp += "The last name must be longer than 2 characters.\n";
        }
        if(!zipcode_validation(zip)){
            temp += "The ZIP code must be a 5 digit number.\n";
        }
        if(!ID_validation(ID)){
            temp += "The employee ID must be in the format of AA-1234.\n";
        }
        if(temp == ""){
            temp = "There were no errors found.\n";
        }
        return temp;
    }

    public static boolean name_filled(String name){
        if(name != ""){
            return true;
        }else{
            return false;
        }
    }

    public static boolean name_2chars(String name){
        if(name.length() >= 2){
            return true;
        }else{
            return false;
        }
    }

    public static boolean ID_validation(String ID){
        char[] ID_array = ID.toCharArray();
        if(ID.length() != 7){
            System.out.println("1");
            return false;
        }
        for(int i = 0; i < 2; i++){
            if(!Character.isAlphabetic(ID_array[i])){
                System.out.println("2");
                return false;
            }
        }
        for(int i = 3; i < 7; i++){
            if(!Character.isDigit(ID_array[i])){
                System.out.println("4");
                return false;
            }
        }
        if(ID_array[2] != '-'){
            System.out.println("3");
            return false;
        }
        return true;
    }

    public static boolean zipcode_validation(String zipcode){
        if(zipcode.length() == 5 && zipcode.matches("^[0-9]*$")){
            return true;
        }else{
            return false;
        }
    }
}
