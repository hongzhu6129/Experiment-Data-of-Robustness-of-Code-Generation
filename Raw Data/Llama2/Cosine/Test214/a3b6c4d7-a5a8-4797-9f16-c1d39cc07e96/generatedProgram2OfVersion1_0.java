import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

    @Test
    void testAllZeros() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }


    @Test
    void testFloatingPointNumbers() {
        assertEquals(2.3333333333333335, AverageCalculator.calculateAverage(1.5, 2.5, 3.0));
    }

    @Test
    void testIntegerMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void testIntegerMinValue() {
         assertEquals(Double.NEGATIVE_INFINITY/3, AverageCalculator.calculateAverage(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));

    }


     @Test
    void testDoubleMaxValue() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void testDoubleMinValue() { // This doesn't become -Infinity
        assertEquals(Double.MIN_VALUE/3*4, AverageCalculator.calculateAverage(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE)); 
    }

}
