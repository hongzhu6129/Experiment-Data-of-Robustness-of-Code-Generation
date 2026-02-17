import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testAllZeros() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(2.147483647E9, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }


    // Add more test cases similarly...  (NaN, Infinity, etc.)
}
