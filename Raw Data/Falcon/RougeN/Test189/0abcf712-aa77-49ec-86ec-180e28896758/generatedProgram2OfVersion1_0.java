import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeTest {

    @Test
    public void testCurrentDateTimeFormat() {
        // This is a simplified test, as we can't truly control system time easily.
        String currentDateTime = CurrentDateTime.getCurrentDateTime();
        // Check that the returned string matches the expected format.
        assertTrue(currentDateTime.matches("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}")); 

        // A more robust (but more complex) approach would involve mocking
        // the system clock to test edge cases (like year/day changes).
    }



     @Test
    public void testDateTimeFormattingLogic() { // More controlled test of formatting
        LocalDateTime specificTime = LocalDateTime.of(2024, 12, 31, 23, 59, 59, 999000000);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        String formattedDateTime = specificTime.format(formatter);
        assertEquals("2024/12/31 23:59:59.999", formattedDateTime);

        specificTime = LocalDateTime.of(2025, 1, 1, 0, 0, 0, 0);
        formattedDateTime = specificTime.format(formatter);
        assertEquals("2025/01/01 00:00:00.000", formattedDateTime);

    }
}

