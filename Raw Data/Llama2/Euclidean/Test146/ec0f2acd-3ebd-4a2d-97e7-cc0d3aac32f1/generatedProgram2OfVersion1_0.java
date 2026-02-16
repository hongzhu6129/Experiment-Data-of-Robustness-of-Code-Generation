import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testNormalCase() {
        // Simulate input somehow (more sophisticated approaches are used in real testing)
        double num1 = 10;
        double num2 = 5;

        // You would need to capture the output of your main method for proper testing. This example is simplified for demonstration.
        assertEquals(15, num1 + num2); // Example assertion
        assertEquals(5, num1 - num2);
        // ... add assertions for other operations
    }


    @Test
    void testDivideByZero() {
        double num1 = 7;
        double num2 = 0;

        // Instead of assertions about calculations, you'd likely check that your program handles the exception or prints the correct error message.

        // ... (code to check for error handling related to division by zero)
    }


    // ... More test methods for other test cases
}
