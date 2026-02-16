import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testRegularPositiveNumbers() {
        // ... (Arrange - set inputs, Act - call your methods, Assert - check results)
        assertEquals(149, ArithmeticOperations.add(125, 24)); // Example using a hypothetical add() method.  You'll need to adapt to your actual code structure.
        // Add assertions for other operations (subtract, multiply, etc.).
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10, 0)); // Example.  Adapt as needed.
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.remainder(10, 0));
    }

    // ... Tests for other cases (negative numbers, large numbers, etc.)
}
