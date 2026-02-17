import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAverage_normalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverage_withNegativeNumbers() {
         assertEquals(-2.0, AverageCalculator.calculateAverage(-1, -2, -3));
    }

     // Add more test cases here following the above examples

}

