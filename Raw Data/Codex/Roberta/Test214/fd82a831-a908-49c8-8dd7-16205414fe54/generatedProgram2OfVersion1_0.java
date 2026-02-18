import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testSum() {
        assertEquals(15, ArithmeticOperations.sum(10, 5)); // Example test for sum
        // Add more tests for sum with different inputs
    }


   // Similar test methods for subtract(), multiply(), divide(), remainder()

   @Test
   void testDivideByZero(){
       ArithmeticOperations calculator = new ArithmeticOperations();  // Replace with your actual class name

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0); // Expected to throw ArithmeticException
        });
   }

}


//Note on Overflow/Underflow:

Testing overflow/underflow is a bit more complex because Java usually wraps around.  You might need to check if the result is unexpectedly smaller/larger than the inputs to detect these cases.
