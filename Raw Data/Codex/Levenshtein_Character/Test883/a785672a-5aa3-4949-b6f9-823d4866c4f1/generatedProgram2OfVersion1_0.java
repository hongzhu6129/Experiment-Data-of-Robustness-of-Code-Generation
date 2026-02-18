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

    // Add more tests for the other cases listed above
     @Test
    void testInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.POSITIVE_INFINITY, 10, 20));
    }

    @Test
    void testNaN() {
         assertTrue(Double.isNaN(AverageCalculator.calculateAverage(Double.NaN, 10, 20)));
    }

}
