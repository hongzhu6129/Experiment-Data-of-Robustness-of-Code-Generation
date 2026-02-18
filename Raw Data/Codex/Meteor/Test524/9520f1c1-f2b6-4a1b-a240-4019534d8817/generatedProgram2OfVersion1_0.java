import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    // ... (Add more test methods for other test cases similarly) ...

    @Test
    void testNaN() {
         assertEquals(Double.NaN, AverageCalculator.calculateAverage(Double.NaN, 10, 20), 0.001);
    }



}
