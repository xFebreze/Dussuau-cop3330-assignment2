package ex26.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import static java.lang.Math.*;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double bal, double APR, double monthly){
        double APR2 = APR/100;
        double daily_rate = APR2/365;
        double daily_rate_plus1 = daily_rate + 1;
        double part_1 = -(1.0 / 30);
        double part_2a = pow(daily_rate_plus1,30);
        double part_2b = (bal / monthly) * (1 - part_2a);
        double part_2 = log(1 + part_2b);
        double part_3 = log(daily_rate_plus1);
        double temp = (part_1 * part_2 / part_3);
        return (int)ceil(temp);
    }
}
