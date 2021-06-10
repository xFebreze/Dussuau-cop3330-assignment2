package ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class Validity {
    public int PasswordStrength(String pass){
        if(pass.length() < 8){
            if(OnlyNum(pass)){
                return 1;
            }else{
                return 2;
            }
        }else{
            if(!NoSpecialChar(pass)){
                return 4;
            }else{
                return 3;
            }
        }

    }

    public boolean OnlyNum(String pass){
        return((pass != null) && (!pass.equals("")) && ( pass.matches("^[0-9]*$")));
    }

    public boolean NoSpecialChar(String pass){
        return((pass != null) && (!pass.equals("")) && ( pass.matches("^[a-zA-Z0-9]*$")));
    }

}
