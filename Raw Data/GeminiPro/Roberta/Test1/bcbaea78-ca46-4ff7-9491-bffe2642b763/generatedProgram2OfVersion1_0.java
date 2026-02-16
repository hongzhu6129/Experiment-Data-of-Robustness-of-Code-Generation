   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class ProductOfTwoNumbersTest {

       @Test
       void testPositiveNumbers() {
           assertEquals(50, ProductOfTwoNumbers.calculateProduct(5, 10)); // Example of a JUnit test
       }

       // Add more @Test methods for other test cases

       // Helper method to make testing easier (not part of the original class)
       private static long calculateProduct(long num1, long num2) {
           return num1 * num2;
       }
   }
   