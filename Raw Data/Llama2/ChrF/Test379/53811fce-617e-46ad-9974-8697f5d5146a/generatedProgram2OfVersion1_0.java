import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddBinaryTest {

    @Test
    void testAddBinary() {
        assertEquals("100", AddBinary.addBinary("11", "1"));
        assertEquals("10101", AddBinary.addBinary("1010", "1011"));
        // ... add more test cases here ...
        assertEquals("", AddBinary.addBinary("", "")); // Empty string case
        assertEquals("111", AddBinary.addBinary("111", "")); // One empty string
    }

    // ... more test methods as needed
}
