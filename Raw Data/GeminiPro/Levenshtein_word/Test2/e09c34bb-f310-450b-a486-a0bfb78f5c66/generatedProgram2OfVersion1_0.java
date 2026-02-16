import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveIntegers() {
        assertEquals(15, ArithmeticOperations.sum(10, 5)); // Example for sum, create similar tests for other operations
        // ... more assertions for difference, product, quotient, remainder
    }

    // ... other test methods for remaining test cases

    // Helper methods to avoid code duplication in test cases
    private double sum(double num1, double num2){
        return num1 + num2;
    }

    // Add similar helper methods for subtract, multiply, divide and modulo
}
