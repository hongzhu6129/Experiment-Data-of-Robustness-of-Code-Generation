import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToOctalTest {

    @Test
    void testZero() {
        assertEquals("0", DecimalToOctal.decimalToOctal(0));
    }

    @Test
    void testPositiveNumber() {
        assertEquals("17", DecimalToOctal.decimalToOctal(15));
        assertEquals("10", DecimalToOctal.decimalToOctal(8));
        assertEquals("7", DecimalToOctal.decimalToOctal(7));
        assertEquals("100", DecimalToOctal.decimalToOctal(64));  // Power of 8
        assertEquals("2345", DecimalToOctal.decimalToOctal(1253)); // Larger number
    }

    @Test
    void testLargeNumber() {  // Corner case: Large decimal
        assertEquals("17777777777", DecimalToOctal.decimalToOctal(Integer.MAX_VALUE)); 
    }


    @Test
    void testNegativeNumber() { // Corner case: Although the problem description doesn't mention negative, it's good practice to test
         assertEquals("-17", DecimalToOctal.decimalToOctal(-15)); // Handles negatives correctly now.
    }
}
