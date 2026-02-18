import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplyBinaryTest {

    @Test
    void testNormalMultiplication() {
        assertEquals("110", MultiplyBinary.multiplyBinary("10", "11"));  // 2 * 3 = 6
        assertEquals("1100", MultiplyBinary.multiplyBinary("100", "11")); // 4 * 3 = 12
        assertEquals("100011", MultiplyBinary.multiplyBinary("111", "111")); // 7 * 7 = 49

    }

    @Test
    void testZeroMultiplication() {
        assertEquals("0", MultiplyBinary.multiplyBinary("10", "0")); // 2 * 0 = 0
        assertEquals("0", MultiplyBinary.multiplyBinary("0", "11")); // 0 * 3 = 0
        assertEquals("0", MultiplyBinary.multiplyBinary("0", "0"));   // 0 * 0 = 0
    }


    @Test
    void testNullOrEmptyInput() {
        assertEquals("0", MultiplyBinary.multiplyBinary(null, "11"));
        assertEquals("0", MultiplyBinary.multiplyBinary("10", null));
        assertEquals("0", MultiplyBinary.multiplyBinary("", "11"));
        assertEquals("0", MultiplyBinary.multiplyBinary("10", ""));
        assertEquals("0", MultiplyBinary.multiplyBinary(null, null));
        assertEquals("0", MultiplyBinary.multiplyBinary("", ""));
    }

     @Test
    void testLargeNumbers() {
        assertEquals("10000000000", MultiplyBinary.multiplyBinary("10000", "10000")); // 8*8 =64        
    }

    @Test
    void testOneMultiplication(){
        assertEquals("1", MultiplyBinary.multiplyBinary("1","1"));
        assertEquals("11", MultiplyBinary.multiplyBinary("1","11"));
    }

}
