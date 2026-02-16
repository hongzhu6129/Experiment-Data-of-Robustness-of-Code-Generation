import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositive() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

     // ... Add tests for other cases including corner cases (large numbers, min/max values)

    @Test
    void testCalculateAverageOverflow() {
        // Check behavior with very large numbers.  May vary by Java version.
         assertThrows(ArithmeticException.class, () -> {  // Or assertEquals(Double.POSITIVE_INFINITY...
            AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
         });
    }



}
