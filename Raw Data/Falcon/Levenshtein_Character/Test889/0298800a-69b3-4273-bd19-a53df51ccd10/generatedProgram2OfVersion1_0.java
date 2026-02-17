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

    // Add more test cases here...

}
