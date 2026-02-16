import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.sum(10, 5));  // Example for sum; add more for other operations
        // ... similar assertions for other test cases
    }

    // ... more test methods for other test cases

    // You'll need to create static methods like sum(), subtract(), etc. in your ArithmeticOperations class for these tests to work
     public static double sum(double num1, double num2) {
        return num1 + num2;
    }


}
