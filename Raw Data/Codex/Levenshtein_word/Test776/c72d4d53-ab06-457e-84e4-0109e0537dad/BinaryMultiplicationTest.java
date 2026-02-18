import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryMultiplicationTest {

    @Test
    void testNormalMultiplication() {
        assertEquals("110", BinaryMultiplication.multiplyBinary("10", "11"));
        assertEquals("1010", BinaryMultiplication.multiplyBinary("101", "10"));
    }

    @Test
    void testZeroMultiplication() {
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "11"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("10", "0"));
    }

    @Test
    void testInvalidInput() {
        assertEquals("Invalid binary input", BinaryMultiplication.multiplyBinary("10a", "11"));
    }

    // Add more test cases...

}
