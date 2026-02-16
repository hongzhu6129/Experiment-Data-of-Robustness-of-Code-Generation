import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-20.0, AverageCalculator.calculateAverage(-10, -20, -30));
    }
    // ... Add tests for other cases (zeros, decimals, overflow, etc.)
    @Test
    void testPositiveOverflow(){
        assertEquals(Double.POSITIVE_INFINITY,  AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

}
