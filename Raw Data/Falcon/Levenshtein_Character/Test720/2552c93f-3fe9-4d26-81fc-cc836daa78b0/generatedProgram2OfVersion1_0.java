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
     // ... (Add more test cases from the table above) ...

     @Test
    void testCalculateAverageMaxValue() {
        assertEquals(Double.MAX_VALUE, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

      @Test
    void testCalculateAverageMinValue() {
        assertEquals(Double.MIN_VALUE, AverageCalculator.calculateAverage(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE));
    }
}

