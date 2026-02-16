import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverageDecimals() {
        assertEquals(2.5, AverageCalculator.calculateAverage(1.5, 2.5, 3.5));
    }

    // ... Add more tests for other cases (edge cases, NaN, Infinity, etc.)
    @Test
    void calculateAverageOverflow() {
       assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }


    @Test
    void calculateAverageNaN() {
       assertTrue(Double.isNaN(AverageCalculator.calculateAverage(Double.NaN, 10, 20))); // Use assertTrue and Double.isNaN
    }

   // ... (Add more tests similarly)

}
