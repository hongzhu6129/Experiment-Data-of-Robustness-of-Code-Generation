import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemTimeTest {

    @Test
    void testFormat() {
        String currentTime = SystemTime.getCurrentTime();
        // Regular expression can be used for a more robust check
        assertTrue(currentTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}"));
    }

    // Add more tests for other cases as needed...
}

