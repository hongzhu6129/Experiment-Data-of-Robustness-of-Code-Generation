import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testDecimalNumbers() {
        assertEquals(6.333333333333333, AverageCalculator.calculateAverage(2.5, 5.7, 10.8));
    }
     // ... Add more test cases here ...
}

