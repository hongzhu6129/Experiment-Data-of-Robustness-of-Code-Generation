import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testRegularPositiveNumbers() {
        assertEquals(10.0, AverageCalculator.calculateAverage(5, 10, 15));
    }

    @Test
    void testZeroIncluded() {
        assertEquals(5.0, AverageCalculator.calculateAverage(0, 5, 10));
    }

    // Add more test methods for other test cases...

}

