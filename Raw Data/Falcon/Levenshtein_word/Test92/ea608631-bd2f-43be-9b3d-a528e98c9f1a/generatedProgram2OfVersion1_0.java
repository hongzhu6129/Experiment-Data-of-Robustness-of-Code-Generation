import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAverage_positiveNumbers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverage_negativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

     // Add more test cases here, using the table above as a guide
     // Example:
    @Test
    void calculateAverage_doubleMaxValue(){
        assertEquals(Double.MAX_VALUE, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }
}
