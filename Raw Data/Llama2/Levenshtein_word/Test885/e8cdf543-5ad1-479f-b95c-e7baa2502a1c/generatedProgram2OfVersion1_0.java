import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAveragePositiveIntegers() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageNegativeAndZero() {
        assertEquals(0.0, AverageCalculator.calculateAverage(-5, 0, 5));
    }

      // ... (Add more test methods for the other test cases) ...

      @Test
      void testCalculateAverageOverflow(){
          assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, 1.0, 1.0));
      }

      @Test
      void testCalculateAverageNaN(){
          assertEquals(Double.NaN, AverageCalculator.calculateAverage(Double.NaN, 10, 20)); // Special assertion for NaN
      }

}
