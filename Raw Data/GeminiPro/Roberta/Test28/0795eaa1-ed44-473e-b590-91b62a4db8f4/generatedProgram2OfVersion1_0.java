import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {

    @Test
    void testPositiveNumber() {
        assertEquals(15, SumOfDigits.function(12345));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(30, SumOfDigits.function(-9876));
    }

    // ... add more test cases similarly ...

    @Test
    void testIntegerMinValue() {
        assertEquals(47, SumOfDigits.function(Integer.MIN_VALUE));
    }

    @Test
    void testIntegerMaxValue() {
        assertEquals(46, SumOfDigits.function(Integer.MAX_VALUE));
    }
}
