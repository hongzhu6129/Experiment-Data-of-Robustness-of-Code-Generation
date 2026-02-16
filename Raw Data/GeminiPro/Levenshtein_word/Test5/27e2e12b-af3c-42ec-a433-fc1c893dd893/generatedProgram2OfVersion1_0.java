import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageZeroes() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    // Add more @Test methods for the other test cases

    @Test
    void testCalculateAverageLargeNumbers() {
        assertEquals(2000000.0, AverageCalculator.calculateAverage(1000000, 2000000, 3000000));
    }

    @Test
    void testCalculateAverageDecimalNumbers() {
        assertEquals(5.7, AverageCalculator.calculateAverage(2.5, 5.7, 8.9));
    }


    @Test
    void testCalculateAverageVeryLargeNumbers() {
        assertEquals(2.147483647E9, AverageCalculator.calculateAverage(2147483647, 2147483647, 2147483647));
    }



}
