import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }

    // ... (add more test cases similarly) ...

    @Test
    void testLargeNumbers() {
        assertEquals(2000000.0, AverageCalculator.calculateAverage(1000000, 2000000, 3000000));
    }

     @Test
     void testOverflow() {
         assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); // Expecting Infinity
     }


}
