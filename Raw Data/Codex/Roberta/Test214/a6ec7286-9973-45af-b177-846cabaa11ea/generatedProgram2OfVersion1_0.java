import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testNormalPositiveNumbers() {
        // Set up input (using a mock Scanner or other techniques if needed)
        // ...

        // Call the methods under test (you might need to refactor your code slightly to make it testable)
        double sum = ArithmeticOperations.add(10, 5);  // Example, assuming you extract the operations into separate methods.
        // ... other operations

        // Assert the results
        assertEquals(15, sum); 
        // ... other assertions
    }

    // ... more test methods for the other test cases
}
