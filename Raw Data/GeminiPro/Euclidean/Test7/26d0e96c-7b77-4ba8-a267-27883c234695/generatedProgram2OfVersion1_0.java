import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    public void testNormalCase1() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    public void testNormalCase2() {
        assertEquals(10.333333333333334, AverageCalculator.calculateAverage(5.5, 10.5, 15.0));
    }

    // ... Add tests for other cases similarly
    @Test
    public void testOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));

    }

    @Test
    public void testNaNInput(){
        assertEquals(Double.NaN, AverageCalculator.calculateAverage(Double.NaN, 10, 20));
    }

}

