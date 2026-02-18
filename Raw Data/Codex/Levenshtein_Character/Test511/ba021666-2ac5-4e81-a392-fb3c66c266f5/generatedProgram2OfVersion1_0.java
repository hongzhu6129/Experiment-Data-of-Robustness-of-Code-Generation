import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(15, ArithmeticOperations.add(10, 5)); // Example using a separate add method
        // Add similar assertions for other operations and test cases
    }


    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(10,0));

    }

    // ... Add tests for the other cases

}

