import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AverageCalculatorTest {

    @Test
    public void testPositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-20.0, AverageCalculator.calculateAverage(-10, -20, -30));
    }

    // Add more test cases following the same pattern

    @Test
    public void testOneLargeTwoSmall() {
        assertEquals(333334.3333333333, AverageCalculator.calculateAverage(1000000, 1, 2));
    }


}
