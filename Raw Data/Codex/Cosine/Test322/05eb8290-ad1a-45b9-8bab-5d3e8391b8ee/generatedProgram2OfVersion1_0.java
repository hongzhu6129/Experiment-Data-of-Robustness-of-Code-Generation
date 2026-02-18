import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {

    @Test
    void testSum() {
        assertEquals(15, ArithmeticOperations.sum(10, 5)); // Example test for the sum method
        // ... More tests for other operations ...
    }


     // You would need to modify ArithmeticOperations to have non-static methods like this:
    //    public double sum(double num1, double num2) {
    //        return num1 + num2;
    //    }

    // And similarly for other operations (subtract, multiply, divide, remainder).


}
