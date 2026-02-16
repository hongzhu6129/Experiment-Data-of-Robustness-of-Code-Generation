import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeNumbers() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }

    // Add more test methods for the other test cases...
    @Test
    void testCalculateAverageLargeNumbers(){
        assertEquals(2000000.0, AverageCalculator.calculateAverage(1000000,2000000, 3000000));

    }
     @Test
    void testCalculateAverageVeryLargeNumbers() {
        double expectedAverage = (Double.MAX_VALUE + Double.MAX_VALUE/2 + Double.MAX_VALUE/4) / 3.0;
        assertEquals(expectedAverage, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE/2, Double.MAX_VALUE/4));
    }


}
