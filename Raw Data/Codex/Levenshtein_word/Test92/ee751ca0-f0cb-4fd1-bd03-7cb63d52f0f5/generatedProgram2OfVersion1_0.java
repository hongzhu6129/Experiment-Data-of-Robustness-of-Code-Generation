import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositive() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }
      // Add more JUnit test cases here covering the corner cases (NaN, Infinity, overflows, etc.) 
}
