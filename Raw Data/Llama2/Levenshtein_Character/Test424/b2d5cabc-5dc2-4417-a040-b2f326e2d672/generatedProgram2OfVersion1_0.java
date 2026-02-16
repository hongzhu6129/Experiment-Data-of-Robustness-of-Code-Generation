import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testCalculateAverageNormalCase() {
        assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
    }

    @Test
    void testCalculateAverageZeroes() {
        assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
    }
   // ...add more test cases using the assertEquals method
   @Test
   void testCalculateAverageNaN(){
       assertEquals(Double.NaN, AverageCalculator.calculateAverage(1.0, Double.NaN, 2.0)); // Special assertion for NaN
   }


}
