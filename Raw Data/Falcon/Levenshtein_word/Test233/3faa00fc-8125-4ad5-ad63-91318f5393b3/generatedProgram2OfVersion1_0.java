import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5));  // Example, assuming you add a static add() method.
        // Add assertions for other operations.
    }

    // ... More test methods for other test cases ...

    @Test
    void testDivisionByZero() {
         assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10, 0));  // Checks for the exception.
    }
}

