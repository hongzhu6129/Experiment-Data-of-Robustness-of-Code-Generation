import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositive() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }
    // ... Add more test cases following the same pattern ...

      @Test
    void testCalculateAverageOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    void testCalculateAverageMinValues() {
        assertEquals(Double.MIN_VALUE/3, AverageCalculator.calculateAverage(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE));

    }

    @Test
    void testCalculateAverageMixMaxMinZero(){
        assertEquals((Double.MAX_VALUE + Double.MIN_VALUE) / 3 ,AverageCalculator.calculateAverage(0, Double.MAX_VALUE, Double.MIN_VALUE));
    }


}

