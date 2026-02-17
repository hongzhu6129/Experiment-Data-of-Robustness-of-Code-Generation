   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class AverageCalculatorTest {

       @Test
       void testNormalCase() {
           assertEquals(20.0, AverageCalculator.calculateAverage(10, 20, 30));
       }

       // Add more test methods for other cases...

       @Test
       void testIntegerOverflow() {
           // Demonstrates overflow. Consider using assertions to check for specific behavior if needed.
           double result = AverageCalculator.calculateAverage(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
           System.out.println("Overflow Result: " + result); // Inspect output for overflow behavior
       }

   }
   