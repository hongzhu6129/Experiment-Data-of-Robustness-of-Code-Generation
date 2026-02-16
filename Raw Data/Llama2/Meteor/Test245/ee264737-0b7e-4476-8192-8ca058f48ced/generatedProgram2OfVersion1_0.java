import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryMultiplicationTest {

    @Test
    void testNormalMultiplication() {
        assertEquals("110", BinaryMultiplication.multiplyBinary("10", "11"));
        assertEquals("1100", BinaryMultiplication.multiplyBinary("100", "11"));
        assertEquals("1000",BinaryMultiplication.multiplyBinary("10", "100"));
        assertEquals("100011", BinaryMultiplication.multiplyBinary("111", "111"));

    }

    @Test
    void testZeroMultiplication() {
        assertEquals("0", BinaryMultiplication.multiplyBinary("10", "0"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "11"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "0"));
    }

    @Test
    void testNullOrEmptyInput() { // Corner case
        assertEquals("0", BinaryMultiplication.multiplyBinary(null, "10"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("10", null));
        assertEquals("0", BinaryMultiplication.multiplyBinary("", "10"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("10", ""));        
        assertEquals("0", BinaryMultiplication.multiplyBinary(null, null));
        assertEquals("0", BinaryMultiplication.multiplyBinary("", ""));
    }


    @Test
    void testLargeNumbers(){ // Corner case: potential for overflow if not handled correctly
        assertEquals("10000000000", BinaryMultiplication.multiplyBinary("10000", "10000"));
        assertEquals("1000000000000000", BinaryMultiplication.multiplyBinary("1000000", "10000"));

    }


}

