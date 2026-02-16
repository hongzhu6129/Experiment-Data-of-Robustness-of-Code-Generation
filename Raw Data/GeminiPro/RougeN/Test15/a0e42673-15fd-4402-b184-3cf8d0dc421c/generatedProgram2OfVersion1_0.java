import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToHexadecimalTest {

    @Test
    void testPositiveNumber() {
        assertEquals("FF", DecimalToHexadecimal.function(255));
    }

    @Test
    void testZero() {
        assertEquals("0", DecimalToHexadecimal.function(0));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("FFFFFFF6", DecimalToHexadecimal.function(-10)); // Or handle negative input differently
    }

    // ... Add more test cases following this pattern ...
}
