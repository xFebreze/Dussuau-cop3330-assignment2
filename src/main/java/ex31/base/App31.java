package ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class App31 {

    public static void main(String[] args){
        BPMTarget output = new BPMTarget();
        BadInput31 checkInput = new BadInput31();

        //ReadUserInput();
        int resting_pulse = checkInput.ValidInput("Resting Pulse: ");
        int age = checkInput.ValidInput("Age: ");

        System.out.println("Intensity | Rate\n----------|---------");

        output.Intensity_Rate(resting_pulse,age);
    }


}
