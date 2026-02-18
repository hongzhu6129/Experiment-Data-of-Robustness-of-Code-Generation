import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveIntegers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeZeroPositive() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    @Test
    void testFloatingPointNumbers() {
        assertEquals(3.466666666666667, AverageCalculator.calculateAverage(2.5, 3.7, 4.2));
    }

     // ... Add tests for other cases

    @Test
    void testDoubleMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, 1, 1));
    }

}

