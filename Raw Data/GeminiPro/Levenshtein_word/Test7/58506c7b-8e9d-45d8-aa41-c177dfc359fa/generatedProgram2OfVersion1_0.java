   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class AverageCalculatorTest {

       @Test
       public void testNormalCase1() {
           assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
       }

       @Test
       public void testEdgeCaseZeroes() {
           assertEquals(0.0, AverageCalculator.calculateAverage(0, 0, 0));
       }
       // ... add more test cases similarly

       @Test
       public void testInfinity() {
           assertEquals(Double.POSITIVE_INFINITY, AverageCalculator.calculateAverage(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));
       }
       // ... more tests
   }
   