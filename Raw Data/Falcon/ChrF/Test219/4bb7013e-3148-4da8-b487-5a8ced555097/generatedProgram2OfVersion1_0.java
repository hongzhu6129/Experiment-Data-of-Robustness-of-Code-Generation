import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testZeroInput() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-20.0, AverageCalculator.calculateAverage(-10, -20, -30));
    }
     @Test
    void testDoubleMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, 10, 20));
    }

    // Add more test cases as needed...
}
