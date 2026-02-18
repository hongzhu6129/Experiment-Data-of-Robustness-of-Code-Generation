import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testDivisionByZero() {
        ArithmeticOperations operations = new ArithmeticOperations(); // You'd need to adapt this based on your class structure

        // In a real test framework, you'd have better ways to check for exceptions/error messages.
        // This is a simplified example.
         assertThrows(ArithmeticException.class, () -> operations.divide(10,0)); // Assertions in JUnit
    }

    // Add more @Test methods for other test cases.

}
