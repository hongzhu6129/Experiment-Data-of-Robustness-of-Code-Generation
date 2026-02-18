import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositive() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    // Add more tests for other test cases (including corner cases)
    @Test
    void testCalculateAverageLargePositive() {
        assertEquals(7.15827882E9, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));

    }

     @Test
    void testCalculateAverageInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, 0)); 
    }

    @Test
    void testCalculateAverageNaN() {
         assertTrue(Double.isNaN(AverageCalculator.calculateAverage(Double.NaN, 1, 2))); // Use assertTrue with Double.isNaN
    }


}
