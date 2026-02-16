import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        // ... (Set up input or call your methods directly)
        assertEquals(15, ArithmeticOperations.add(10, 5)); // Example using a hypothetical add method.  You'll likely need to refactor your code a bit to unit test it properly.
        // ... (More assertions for other operations)
    }


    @Test
    void testDivisionByZero(){
        // Demonstrating an exception test:
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10, 0));  // Assuming you have a separate divide() method

    }

    // ... (More test methods for other test cases)
}
