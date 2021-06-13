package ex26;
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
