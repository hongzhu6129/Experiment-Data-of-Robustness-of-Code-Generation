   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class ProductOfTwoNumbersTest {

       @Test
       void testPositiveNumbers() {
           assertEquals(15, ProductOfTwoNumbers.calculateProduct(5, 3)); 
       }

       // ... other test methods for different cases ...

       @Test
       void testOverflow() {
           assertEquals(-2, ProductOfTwoNumbers.calculateProduct(9223372036854775807L, 2)); 
       }


       //Helper function to avoid running main method inside the test
       private long calculateProduct(long num1, long num2)
       {
           return num1*num2;
       }
   }
   