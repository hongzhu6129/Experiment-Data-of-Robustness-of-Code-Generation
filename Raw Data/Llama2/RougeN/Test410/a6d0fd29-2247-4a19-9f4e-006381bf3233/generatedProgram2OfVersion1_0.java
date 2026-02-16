import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerToBinaryTest {

    @Test
    void testZero() {
        assertEquals("0", IntegerToBinary.convertToBinary(0));
    }

    @Test
    void testPositiveNumber() {
        assertEquals("101", IntegerToBinary.convertToBinary(5));
        assertEquals("1111101000", IntegerToBinary.convertToBinary(1000));  // Larger positive
        assertEquals("10000000000", IntegerToBinary.convertToBinary(1024));  // Power of 2
    }


    @Test
    void testNegativeNumber() {
         assertEquals("11111111111111111111111111111110", IntegerToBinary.convertToBinary(-2)); // Handles negatives using two's complement
         assertEquals("11111111111111111111111110000000", IntegerToBinary.convertToBinary(-128));
    }


    @Test
    void testIntegerMax() {
        assertEquals("1111111111111111111111111111111", IntegerToBinary.convertToBinary(Integer.MAX_VALUE));
    }

    @Test
    void testIntegerMin() {
        assertEquals("10000000000000000000000000000000", IntegerToBinary.convertToBinary(Integer.MIN_VALUE));
    }

     @Test
    void testOne() {
        assertEquals("1", IntegerToBinary.convertToBinary(1));
    }
}
