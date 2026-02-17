import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveIntegers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    @Test
    void testAllZeros() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    @Test
    void testFloatingPointNumbers() {
        assertEquals(2.5, AverageCalculator.calculateAverage(1.5, 2.5, 3.5));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, 1, 1)); // Or check for a specific range if overflow handling is implemented
    }

    @Test
    void testSmallNumbers() { // This tests the behavior with very small numbers
         assertEquals(0.6666666666666666, AverageCalculator.calculateAverage(Double.MIN_VALUE, 1, 1), 1e-10); // Using a delta for comparison due to potential precision issues.
    }


    // Add more tests as needed (e.g., for overflow/underflow if specific handling is implemented)
}
