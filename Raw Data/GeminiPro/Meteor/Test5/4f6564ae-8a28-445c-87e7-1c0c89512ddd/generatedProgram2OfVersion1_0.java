import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    public void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    public void testAllZeros() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    @Test
    public void testNegativeAndPositive() {
        assertEquals(6.666666666666667, AverageCalculator.calculateAverage(-10, 20, 10));
    }

    @Test
    public void testIntegerOverflow() {
         assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    // Add more tests for other corner cases...

}
