import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositive() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegative() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }
   // ... Add more test cases following the same pattern ...
}
