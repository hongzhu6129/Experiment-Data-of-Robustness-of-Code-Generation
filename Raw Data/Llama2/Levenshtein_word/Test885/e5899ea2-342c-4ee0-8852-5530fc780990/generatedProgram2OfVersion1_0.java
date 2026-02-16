import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeNumbers() {
        assertEquals(5.0, AverageCalculator.calculateAverage(-5, 15, 5));
    }

    // Add more test methods for the other test cases similarly...

    @Test
    void testCalculateAverageDecimalNumbers() {
        assertEquals(2.6666666666666665, AverageCalculator.calculateAverage(2.5, 3.7, 1.8));
    }


}
