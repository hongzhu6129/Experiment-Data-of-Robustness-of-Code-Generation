import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeNumbers() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }

    // Add more test methods for other cases

    @Test
    void testCalculateAverageDecimalNumbers() {
        assertEquals(5.466666666666667, AverageCalculator.calculateAverage(2.5, 5.7, 8.2), 0.00001); // Use a delta for floating-point comparisons
    }
}
