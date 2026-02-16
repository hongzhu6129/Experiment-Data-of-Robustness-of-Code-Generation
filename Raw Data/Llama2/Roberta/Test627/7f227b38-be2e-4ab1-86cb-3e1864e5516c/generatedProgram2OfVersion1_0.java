import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testRegularCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testZeroValues() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    // Add more test cases here...
}
