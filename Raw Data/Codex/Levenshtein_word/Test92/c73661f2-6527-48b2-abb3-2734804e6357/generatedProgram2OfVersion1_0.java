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

    // Add more test cases similarly...  Include the edge cases like MAX_VALUE and MIN_VALUE

    @Test
    void testCalculateAverageMaxValue() {
        assertEquals(Double.MAX_VALUE, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); // Expected Infinity if not handled
    }


}
