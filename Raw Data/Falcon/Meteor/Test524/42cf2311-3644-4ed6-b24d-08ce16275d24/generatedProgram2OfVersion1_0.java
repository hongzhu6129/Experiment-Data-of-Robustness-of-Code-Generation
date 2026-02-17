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

      // ... add more test cases following the same pattern
   }
   