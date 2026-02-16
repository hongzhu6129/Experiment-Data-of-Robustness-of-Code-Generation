import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryMultiplicationTest {

    @Test
    void testNormalMultiplication() {
        assertEquals("110010", BinaryMultiplication.multiplyBinary("1110", "110"));
        assertEquals("100011", BinaryMultiplication.multiplyBinary("1011", "111"));

    }

    @Test
    void testMultiplicationWithZero() { // Corner case: Multiplication with zero
        assertEquals("0", BinaryMultiplication.multiplyBinary("101", "0"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "110"));

    }

    @Test
    void testMultiplicationWithOne() {
         assertEquals("110", BinaryMultiplication.multiplyBinary("110", "1"));
        assertEquals("1011", BinaryMultiplication.multiplyBinary("1", "1011"));
    }




    @Test
    void testNullInput() { // Corner Case: Null input
        assertEquals("0", BinaryMultiplication.multiplyBinary(null, "110"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("101", null));
        assertEquals("0", BinaryMultiplication.multiplyBinary(null, null));
    }


    @Test
    void testEmptyInput() { // Corner Case: Empty Input
        assertEquals("0", BinaryMultiplication.multiplyBinary("", "110"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("101", ""));
        assertEquals("0", BinaryMultiplication.multiplyBinary("", ""));

    }

    @Test
    void testLargeNumbers() { // Corner Case: potential overflow (handle via String)
        assertEquals("11110110010", BinaryMultiplication.multiplyBinary("111111", "11110"));
    }
}

