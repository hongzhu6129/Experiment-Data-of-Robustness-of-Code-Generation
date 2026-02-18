import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfTwoNumbersTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ProductOfTwoNumbers.multiply(5, 3)); // Example test
    }

    // Add more test methods for other cases...

    // Assuming you add a static multiply method to your class
    static long multiply(long num1, long num2) {
        return num1 * num2;
    }
}
