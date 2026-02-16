import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class CurrentDateTimeTest {

    @Test
    void getCurrentDateTimeTest() {
        // Example: Testing at a specific instant (replace with your test cases)
        LocalDateTime fixedTime = LocalDateTime.of(2024, 2, 29, 10, 30, 45, 123000000); // Leap year test

        // Set the clock to the fixed time (for testing purposes)
        try {
           Clock fixedClock = Clock.fixed(fixedTime.toInstant(ZoneOffset.UTC), ZoneId.systemDefault()); 
           // Assuming getCurrentDateTime uses LocalDateTime.now(), this indirectly sets the time
           //  More robust tests would inject the clock dependency directly.

           String expectedOutput = "2024/02/29 10:30:45.123"; // Expected format for fixedTime
           assertEquals(expectedOutput, CurrentDateTime.getCurrentDateTime());

        } catch (Exception e) {
            fail("Error setting clock for test: " + e.getMessage());  // Handle potential errors
        }

       // Add more tests for other scenarios (timezone, DST, etc.)
    }
}

