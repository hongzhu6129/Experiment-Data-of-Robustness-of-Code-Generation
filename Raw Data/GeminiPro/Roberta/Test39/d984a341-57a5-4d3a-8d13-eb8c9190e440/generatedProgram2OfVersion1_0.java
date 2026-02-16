import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit; // For time comparison

public class SystemTimeTest {

    @Test
    public void testGetCurrentTime_basicFormat() {
        String currentTime = SystemTime.getCurrentTime();
        // Check that the string is not null and not empty.
        assertNotNull(currentTime);
        assertNotEquals("", currentTime);

        // A very basic time difference check (within a few seconds is usually sufficient).  
        //  A more precise test would require mocking the system clock, which is more complex.
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime parsedTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        assertTrue(ChronoUnit.SECONDS.between(now, parsedTime) < 5); // Allow up to 5 seconds difference
    }


    @Test
    public void testGetCurrentTime_customFormat() {
        // Modify SystemTime.getCurrentTime() temporarily or create a test version
        // to use a different format. Then assert the output is correct.
        // ... (Test implementation)
    }
}
