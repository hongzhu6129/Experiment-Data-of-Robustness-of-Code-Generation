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

    // Add more test cases similarly...

     @Test
    void testOverflow() {   // Demonstrating overflow handling (not ideal, but a start)
        double veryLarge = Double.MAX_VALUE/3;
        assertTrue(Double.isInfinite(AverageCalculator.calculateAverage(veryLarge, veryLarge, veryLarge))); // Expecting infinity
    }

}
