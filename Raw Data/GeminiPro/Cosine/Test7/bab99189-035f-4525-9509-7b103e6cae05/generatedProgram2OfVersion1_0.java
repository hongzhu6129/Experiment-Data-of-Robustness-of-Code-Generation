import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testZeroes() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }


    // Add more tests for other cases...
}
