import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testPositiveIntegers() {
        // You'd ideally capture the output of your main method or refactor
        // the arithmetic operations into separate, testable methods. 
        assertEquals(15, ArithmeticOperations.add(10, 5)); // Example if you had a separate add method
        assertEquals(5, ArithmeticOperations.subtract(10, 5));
        // ... more assertions for multiply, divide, remainder
    }


    // ... more @Test methods for the other test cases

}
