package ex25;
import ex25.base.Validity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidityTest {

    @Test
    public void PasswordStrengthTest_LessThan8_onlyNumbers(){
        Validity AppTest = new Validity();

        int expected = 1;
        int actual = AppTest.PasswordStrength("1234");
        assertEquals(expected, actual);
    }

    @Test
    public void PasswordStrengthTest_LessThan8_LetterAndNumbers(){
        Validity AppTest = new Validity();

        int expected = 2;
        int actual = AppTest.PasswordStrength("1234t");
        assertEquals(expected, actual);
    }

    @Test
    public void PasswordStrengthTest_MoreThan8_NoSpecial(){
        Validity AppTest = new Validity();

        int expected = 3;
        int actual = AppTest.PasswordStrength("1234goodbye");
        assertEquals(expected, actual);
    }

    @Test
    public void PasswordStrengthTest_MoreThan8_Special(){
        Validity AppTest = new Validity();

        int expected = 4;
        int actual = AppTest.PasswordStrength("1234%$hello");
        assertEquals(expected, actual);
    }
}
