import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimalToHexadecimalTest {

    @Test
    void testZero() {
        assertEquals("0", DecimalToHexadecimal.function(0));
    }

    @Test
    void testOne() {
        assertEquals("1", DecimalToHexadecimal.function(1));
    }

    @Test
    void testTen() {
        assertEquals("A", DecimalToHexadecimal.function(10));
    }

     // ... add more test cases similarly

    @Test
    void testNegative() {
        // Example of handling negative input by expecting an exception
        assertThrows(IllegalArgumentException.class, () -> DecimalToHexadecimal.function(-1)); // Assuming you throw an exception
    }

    @Test
    void testMaxValue(){
        assertEquals("7FFFFFFF", DecimalToHexadecimal.function(Integer.MAX_VALUE));
    }


}
