import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void calculateAverageGeneralCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void calculateAverageZeros() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }

    @Test
    void calculateAverageNegative() {
        assertEquals(13.333333333333334, AverageCalculator.calculateAverage(-10, 20, 30));
    }
   // Add more test cases here, including overflow and underflow using Assertions.assertThrows() for exceptions

    @Test
    void calculateAverageOverflow(){
        assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
    }


}
