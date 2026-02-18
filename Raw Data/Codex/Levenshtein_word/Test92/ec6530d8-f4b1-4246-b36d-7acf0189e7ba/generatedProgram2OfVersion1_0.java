import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testRegularPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testLargeNumbers() {
        assertEquals(2.0E9, AverageCalculator.calculateAverage(1000000000, 2000000000, 3000000000));
    }
    // ... Add more tests for other cases
    @Test
    void testNaNInput() {
         assertTrue(Double.isNaN(AverageCalculator.calculateAverage(Double.NaN, 20, 30)));
    }


}
