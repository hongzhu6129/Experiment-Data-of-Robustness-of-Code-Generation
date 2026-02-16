import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveIntegers() {
        assertEquals(15, ArithmeticOperations.add(10, 5));  // Example using add() method (you'd need to create these methods in your class)
        // ... similarly test subtract, multiply, divide, remainder
    }

    // Add more test methods for other test cases...

    @Test 
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(5,0)); // Check that exception is thrown
    }

}
