import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5));  // Example using an add method
        // Add assertions for other operations
    }

    // ... Test methods for other test cases ...

    // It's best to create separate functions (add, subtract, etc.) in your 
    // ArithmeticOperations class to make them easily testable.
    // Example:
    public static double add(double a, double b) {
        return a + b;
    }

}
