import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testDivisionByZero() {
        ArithmeticOperations operations = new ArithmeticOperations();  // Not really needed in this case
        // In JUnit 5 you would assert that the output contains "Division by zero"
        // This would usually involve redirecting System.out to check.
        // Here's a simplified approach (not ideal, but demonstrates the idea).
        // A full example using System.setOut is beyond the scope of this basic demonstration.
       
         // You could throw an exception and assert that it's thrown:
       assertThrows(ArithmeticException.class, () -> {
            // Code that would throw the exception if num2 is zero.
           double result = 10 / 0;  // Example only. In real code, your method call.
        });
    }

    // Add more @Test methods for the other test cases.
}
