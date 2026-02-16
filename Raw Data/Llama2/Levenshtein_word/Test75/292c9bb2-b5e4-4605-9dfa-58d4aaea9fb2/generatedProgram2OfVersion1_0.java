import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModulusWithoutOperatorTest {

    @Test
    void testPositiveNumbers() {
        assertEquals(1, ModulusWithoutOperator.modulus(5, 2));
        assertEquals(0, ModulusWithoutOperator.modulus(10, 5));
        assertEquals(3, ModulusWithoutOperator.modulus(13, 5));
    }

    @Test
    void testNegativeDividend() {
        assertEquals(-1, ModulusWithoutOperator.modulus(-5, 2));
        assertEquals(0, ModulusWithoutOperator.modulus(-10, 5));
        assertEquals(-3, ModulusWithoutOperator.modulus(-13, 5));

    }

    @Test
    void testNegativeDivisor() {
        assertEquals(1, ModulusWithoutOperator.modulus(5, -2));
        assertEquals(0, ModulusWithoutOperator.modulus(10, -5));
        assertEquals(3, ModulusWithoutOperator.modulus(13, -5));

    }


    @Test
    void testBothNegative() {
        assertEquals(-1, ModulusWithoutOperator.modulus(-5, -2));
        assertEquals(0, ModulusWithoutOperator.modulus(-10, -5));
        assertEquals(-3, ModulusWithoutOperator.modulus(-13, -5));
    }



    @Test
    void testZeroDividend() {
        assertEquals(0, ModulusWithoutOperator.modulus(0, 5));
        assertEquals(0, ModulusWithoutOperator.modulus(0,-5));
    }

    @Test
    void testZeroDivisor() {
        assertThrows(ArithmeticException.class, () -> ModulusWithoutOperator.modulus(5, 0));
    }

    @Test
    void testLargeNumbers(){
        assertEquals(1, ModulusWithoutOperator.modulus(2147483647,2));  // Integer.MAX_VALUE
        assertEquals(0, ModulusWithoutOperator.modulus(-2147483648, 2)); // Integer.MIN_VALUE

    }
}
