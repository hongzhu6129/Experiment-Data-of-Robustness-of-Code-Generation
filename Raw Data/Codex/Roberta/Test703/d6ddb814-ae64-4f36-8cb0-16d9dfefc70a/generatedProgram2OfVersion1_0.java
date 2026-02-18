import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;


public class SystemTimeTest {

    @Test
    void testFormat() {
        String timeString = SystemTime.getCurrentTime();
        try {
            LocalDateTime.parse(timeString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        } catch (DateTimeParseException e) {
            fail("Incorrect date/time format: " + e.getMessage());
        }
    }

    // Add more tests for other cases (leap year, time zones, etc.)
}
