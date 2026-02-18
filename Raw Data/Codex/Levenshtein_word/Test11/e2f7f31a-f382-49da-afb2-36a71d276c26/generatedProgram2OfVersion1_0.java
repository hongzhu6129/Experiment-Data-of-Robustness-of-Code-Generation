import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    public void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    public void testDecimals() {
        assertEquals(10.333333333333334, AverageCalculator.calculateAverage(5.5, 10.5, 15.0));
    }

    @Test
    public void testZeros(){
        assertEquals(0.0, AverageCalculator.calculateAverage(0,0,0));
    }
    // ... Add more test cases using the examples above

    @Test
    public void testNaNInput() {
      assertTrue(Double.isNaN(AverageCalculator.calculateAverage(1.0, 2.0, Double.NaN)));
    }
       @Test
    public void testPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.POSITIVE_INFINITY, 10, 20));
    }

     @Test
    public void testNegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, AverageCalculator.calculateAverage(Double.NEGATIVE_INFINITY, 10, 20));
    }

}
