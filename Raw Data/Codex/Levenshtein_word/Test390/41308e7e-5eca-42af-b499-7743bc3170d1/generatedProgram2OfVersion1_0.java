import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(50, ProductOfTwoNumbers.calculateProduct(5, 10)); // Helper method added
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-21, ProductOfTwoNumbers.calculateProduct(-3, 7));
    }
    // ... add more tests similar to the ones in the table

     @Test
    void testLargePositiveNumbers() {
        assertEquals(121932631112635269L, ProductOfTwoNumbers.calculateProduct(123456789L, 987654321L)); 
    }

    // Add the calculateProduct method to your ProductOfTwoNumbers class for testing purposes
    public static long calculateProduct(long num1, long num2) {
      return num1 * num2;
    }
}

