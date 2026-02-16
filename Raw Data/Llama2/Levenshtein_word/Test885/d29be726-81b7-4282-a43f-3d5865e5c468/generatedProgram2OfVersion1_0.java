import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAverage_normalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverage_decimals() {
        assertEquals(2.6666666666666665, AverageCalculator.calculateAverage(2.5, 3.7, 1.8));
    }

    // Add more test cases using the table above as a guide

    @Test
    void calculateAverage_overflow() {
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }

}
