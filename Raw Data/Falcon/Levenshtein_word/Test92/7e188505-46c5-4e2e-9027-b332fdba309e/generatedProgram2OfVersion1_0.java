   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class AverageCalculatorTest {

       @Test
       void testNormalCase() {
           assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
       }

       @Test
       void testOverflow() {
          assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE)); // or assertTrue if checking for a very large number instead of infinity
       }

       // ... add more test cases following this pattern ...
   }
   