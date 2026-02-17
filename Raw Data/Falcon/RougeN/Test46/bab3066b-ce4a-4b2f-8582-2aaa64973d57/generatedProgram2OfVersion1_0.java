import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase1() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNormalCase2() {
        assertEquals(10.333333333333334, AverageCalculator.calculateAverage(5.5, 10.5, 15.0));
    }

    // ... Add more test cases following the same pattern

    @Test
    void testOverflow() {
        // Instead of assertEquals, check if the result is within an expected range
        // or if an exception is thrown, depending on how you want to handle overflow
        double result = AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertTrue(result > Integer.MAX_VALUE/2); // Example: checking it's larger than half max value

    }

    // ... similarly add tests for underflow, Double.MAX_VALUE, etc.
}

