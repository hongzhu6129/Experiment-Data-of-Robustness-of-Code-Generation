import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageDecimalNumbers() {
        assertEquals(5.466666666666667, AverageCalculator.calculateAverage(2.5, 5.7, 8.2));
    }

    // Add more test cases similarly...

    @Test
    void testCalculateAverageOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

}
