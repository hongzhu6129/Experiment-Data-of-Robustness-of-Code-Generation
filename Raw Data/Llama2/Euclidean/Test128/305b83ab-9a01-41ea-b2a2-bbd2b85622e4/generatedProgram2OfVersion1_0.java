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
    void testLargePositiveNumber() {
        assertEquals("FFFFFF", DecimalToHexadecimal.function(16777215));
    }

    @Test
    void testNegativeNumber() {
        assertEquals("FFFFFFFF", DecimalToHexadecimal.function(-1));
    }

    @Test
    void testMinIntegerValue() {
        assertEquals("80000000", DecimalToHexadecimal.function(Integer.MIN_VALUE));
    }
}
