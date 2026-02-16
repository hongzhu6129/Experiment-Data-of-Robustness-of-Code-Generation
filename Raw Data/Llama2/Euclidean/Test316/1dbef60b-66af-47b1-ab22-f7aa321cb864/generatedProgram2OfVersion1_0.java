import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryMultiplicationTest {

    @Test
    void testMultiplyBinary_basic() {
        assertEquals("110", BinaryMultiplication.multiplyBinary("11", "10"));
    }

    @Test
    void testMultiplyBinary_zero() {
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "111"));
    }

    // ... Add more tests here ...
}
