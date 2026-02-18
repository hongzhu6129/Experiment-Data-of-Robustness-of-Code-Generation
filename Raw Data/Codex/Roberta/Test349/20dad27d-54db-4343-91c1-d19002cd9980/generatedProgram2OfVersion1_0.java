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

    // Add more test cases similarly...

     @Test
    void testVeryLargeNumbers() {
       assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE/2));
    }


    @Test
    void testVerySmallNumbers() {
        assertEquals(2.0E-7, AverageCalculator.calculateAverage(0.0000001, 0.0000002, 0.0000003), 1e-9); // using a delta for comparison of very small numbers
    }



}
