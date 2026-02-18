import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAveragePositiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverageNegativeNumbers() {
        assertEquals(-10.0, AverageCalculator.calculateAverage(-5, -10, -15));
    }

    // Add more test methods for other test cases...

     @Test
    void calculateAverageLargeAndSmall() {
        assertEquals(3.3333333336666667E8, AverageCalculator.calculateAverage(1000000000, 0.000000001, 5));
    }

}
