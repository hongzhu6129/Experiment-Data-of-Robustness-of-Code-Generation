import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArithmeticOperationsTest {
    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5)); // Assuming you create add(), subtract(), etc. methods.
        // ... add assertions for other operations ...
    }

        // ... Test other cases similarly


    @Test
    void testDivideByZero(){
        ArithmeticOperations calculator = new ArithmeticOperations(); // Or use static methods as shown above
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)); // Or assert appropriate error message 
    }
}

