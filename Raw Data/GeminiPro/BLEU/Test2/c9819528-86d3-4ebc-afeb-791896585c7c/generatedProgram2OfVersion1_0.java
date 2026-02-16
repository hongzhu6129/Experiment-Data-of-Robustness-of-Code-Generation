import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        // You would typically redirect System.out to capture the output, 
        // or refactor your ArithmeticOperations class to return values instead of printing.
        // Here's a simplified example asserting the sum:
        assertEquals(15, ArithmeticOperations.sum(10, 5)); // Assuming you create a sum() method
    }

    // ... other test methods for different scenarios ...
}

