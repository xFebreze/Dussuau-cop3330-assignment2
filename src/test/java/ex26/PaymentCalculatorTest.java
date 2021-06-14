package ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Dussuau Alek
 */
import ex26.base.PaymentCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentCalculatorTest {

    @Test
    public void CalculatorTest(){
        PaymentCalculator AppTest = new PaymentCalculator();

        int expected = 70;
        int actual = AppTest.calculateMonthsUntilPaidOff(5000,12,100);
        assertEquals(expected,actual);
    }

}
