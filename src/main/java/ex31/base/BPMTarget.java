package ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
public class BPMTarget {

    public void Intensity_Rate(int hr, int age){

        for(int i = 55; i <= 95; i += 5){
            double temp = (((220 - age) - hr ) * (i/100.0)) + hr;
            int bpm = (int)(temp);
            PrintOutput(i, bpm);
        }

    }

    public void PrintOutput(int intensity, int rate){
        System.out.printf("%d%%\t\t  | %d bpm\n",intensity,rate);

    }
}
