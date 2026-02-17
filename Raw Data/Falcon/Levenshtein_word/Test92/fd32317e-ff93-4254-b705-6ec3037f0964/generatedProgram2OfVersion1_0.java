import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }

   // ... Add more test methods for other cases ...

    @Test
    void testOverflow(){
        assertEquals(Double.MAX_VALUE, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); // Or Infinity might be expected.
    }


}
