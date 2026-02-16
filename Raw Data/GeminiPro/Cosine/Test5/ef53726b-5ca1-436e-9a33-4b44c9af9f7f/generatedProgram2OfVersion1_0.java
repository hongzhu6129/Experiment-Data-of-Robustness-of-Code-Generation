import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testZeroValues() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    // ... add tests for other cases (negative numbers, large numbers, etc.)

    @Test
    void testMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

}
