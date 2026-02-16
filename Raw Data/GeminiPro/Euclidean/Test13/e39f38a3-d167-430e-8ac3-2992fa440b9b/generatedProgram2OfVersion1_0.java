import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplyTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(50, MultiplyTwoNumbers.multiply(5, 10));
    }

    @Test
    void testNegativeNum1() {
        assertEquals(-50, MultiplyTwoNumbers.multiply(-5, 10));
    }

    // Add more test methods for the other test cases...

    @Test
    void testLongMaxValueOverflow() {
        assertEquals(-2, MultiplyTwoNumbers.multiply(Long.MAX_VALUE, 2));  // Overflow
    }

    @Test
    void testLongMinValue() {
        assertEquals(-9223372036854775808L, MultiplyTwoNumbers.multiply(Long.MIN_VALUE, 1));
    }

        @Test
    void testLongMinValueOverflow() {
        assertEquals(9223372036854775808L, MultiplyTwoNumbers.multiply(Long.MIN_VALUE, -1));  // Overflow
    }
}
