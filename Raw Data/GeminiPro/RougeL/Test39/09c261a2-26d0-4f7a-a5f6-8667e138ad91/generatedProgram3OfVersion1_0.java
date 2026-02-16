import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;


public class SystemTimeTest {

    @Test
    public void testTimeWithinDelta() {
        // Act: Get the current time from the system
        LocalDateTime currentTime = LocalDateTime.now();
        String systemTimeString = SystemTime.getCurrentTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime parsedSystemTime = LocalDateTime.parse(systemTimeString, formatter);


        // Assert: Check if the parsed system time is "close enough" to the current time
        assertTrue(ChronoUnit.MILLIS.between(currentTime, parsedSystemTime) < 100); // Adjust delta as needed
    }
}
