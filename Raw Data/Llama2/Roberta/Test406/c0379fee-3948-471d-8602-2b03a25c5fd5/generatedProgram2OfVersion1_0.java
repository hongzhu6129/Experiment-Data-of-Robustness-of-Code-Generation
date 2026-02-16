import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5)); //Example test for addition - you would need to implement the add, subtract, multiply etc. as static methods in your ArithmeticOperations class.
        // Add assertions for other operations (subtract, multiply, divide, remainder)
    }

    // Add test methods for the other test cases

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10, 0)); // Testing for exception
    }


}
