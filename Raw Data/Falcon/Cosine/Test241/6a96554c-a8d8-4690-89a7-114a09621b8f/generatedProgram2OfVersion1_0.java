import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryMultiplicationTest {

    @Test
    void testNormalMultiplication() {
        assertEquals("110", BinaryMultiplication.multiplyBinary("11", "10"));
        assertEquals("100011", BinaryMultiplication.multiplyBinary("101", "111"));
    }


    @Test
    void testZeroMultiplication(){
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "11"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("101", "0"));
        assertEquals("0", BinaryMultiplication.multiplyBinary("0", "0"));
    }
    // ... Add tests for other cases (single bit, large numbers, invalid input)

}
