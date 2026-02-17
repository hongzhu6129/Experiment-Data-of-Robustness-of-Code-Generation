import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    // Add tests for the other cases similarly...
    @Test
    void testIntegerOverflow() {
         assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)); // Or check for an exception
    }
     // ... more tests
}
