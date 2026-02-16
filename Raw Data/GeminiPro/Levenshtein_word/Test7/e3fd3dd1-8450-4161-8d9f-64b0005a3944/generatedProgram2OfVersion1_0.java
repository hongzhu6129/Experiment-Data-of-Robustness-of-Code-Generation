import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

     // ... more test cases
}
