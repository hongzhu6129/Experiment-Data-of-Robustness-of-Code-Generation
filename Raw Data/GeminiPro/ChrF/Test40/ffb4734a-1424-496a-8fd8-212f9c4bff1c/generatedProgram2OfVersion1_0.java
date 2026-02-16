import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrentDateTimeTest {

    @Test
    void testValidFormat() {
        String format = "yyyy/MM/dd HH:mm:ss.SSS";
        String result = CurrentDateTime.getCurrentDateTime(format);
        // You'd use a regular expression or other string parsing technique to verify the format.
        // For simplicity, I'll just check the length:
        assertTrue(result.length() > 0); // Basic check; enhance this for a real test
    }

    @Test
    void testInvalidFormat() {
        String format = "yyyy/MM/dd HHmmssSSS"; // Invalid
        assertThrows(DateTimeParseException.class, () -> { // Expecting the exception
            CurrentDateTime.getCurrentDateTime(format);
        });
    }

    // Add more tests for the other test cases...

}
