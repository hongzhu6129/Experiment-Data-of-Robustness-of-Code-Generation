import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToOctalTest {

    @Test
    void testFunctionOne() {
        assertEquals("17", DecimalToOctal.functionone(15));
        assertEquals("0", DecimalToOctal.functionone(0));
        assertEquals("7", DecimalToOctal.functionone(7));
        assertEquals("10", DecimalToOctal.functionone(8));
        // ... add more test cases from the table above
        assertEquals("-37777777777", DecimalToOctal.functionone(-1)); // For negative testing.
        assertEquals("7777777777", DecimalToOctal.functionone(Integer.MAX_VALUE));
        assertEquals("10000000000", DecimalToOctal.functionone(Integer.MIN_VALUE));
    }
}
