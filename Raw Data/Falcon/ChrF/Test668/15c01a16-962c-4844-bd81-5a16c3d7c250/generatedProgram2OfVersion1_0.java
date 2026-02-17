import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(50, ProductOfTwoNumbers.calculateProduct(5, 10)); // Example test
    }


    // Add more @Test methods for the other test cases

    // Helper method to make testing cleaner (not in the original class)
    private long calculateProduct(long num1, long num2) {
        return num1 * num2;
    }
}
