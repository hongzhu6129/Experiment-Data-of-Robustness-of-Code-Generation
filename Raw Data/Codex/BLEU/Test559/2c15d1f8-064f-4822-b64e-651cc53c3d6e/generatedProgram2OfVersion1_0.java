import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToOctalTest {

    @Test
    void testFunctionOneZero() {
        assertEquals("0", DecimalToOctal.functionone(0));
    }

    @Test
    void testFunctionOneOne() {
        assertEquals("1", DecimalToOctal.functionone(1));
    }

    @Test
    void testFunctionOneSeven() {
        assertEquals("7", DecimalToOctal.functionone(7));
    }

    @Test
    void testFunctionOneEight() {
        assertEquals("10", DecimalToOctal.functionone(8));
    }
     // ... add more test cases similarly ...

     @Test
    void testFunctionOneNegative() {
        assertEquals("-1", DecimalToOctal.functionone(-1)); 
    }

    @Test
    void testFunctionOneMaxValue() {
        assertEquals("17777777777", DecimalToOctal.functionone(Integer.MAX_VALUE));
    }

    @Test
    void testFunctionOneMinValue() {
        assertEquals("-20000000000", DecimalToOctal.functionone(Integer.MIN_VALUE));
    }
}
