   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class DecimalToHexadecimalTest {

       @Test
       void testZero() {
           assertEquals("0", DecimalToHexadecimal.function(0));
       }

       @Test
       void testSingleDigit() {
           assertEquals("A", DecimalToHexadecimal.function(10));
       }
       // ... Add more test cases similarly
       @Test
       void testMaxValue() {
            assertEquals("7FFFFFFF", DecimalToHexadecimal.function(Integer.MAX_VALUE));

       }

       @Test
       void testNegative() {
           // Decide how you want to handle negative numbers, and test accordingly.
           // For example, if you decide to throw an exception:
           assertThrows(IllegalArgumentException.class, () -> DecimalToHexadecimal.function(-1)); // Assuming you add exception handling to your 'function' method

           // Or if you want a specific output:
           // assertEquals("-1", DecimalToHexadecimal.function(-1)); // If you've modified 'function' to handle negative numbers
       }
   }
   