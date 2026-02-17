import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(50, ProductOfTwoNumbers.calculateProduct(5, 10));  // Example test
    }


    // ... add more @Test methods for other test cases

    // Helper method to isolate the product calculation for testing:
    private long calculateProduct(long num1, long num2) {
        return num1 * num2; // Extract this logic for cleaner testing. 
    }
}
