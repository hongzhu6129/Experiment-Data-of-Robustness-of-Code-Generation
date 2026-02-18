import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

public class SystemTimeTest {


    @Test
    public void testValidFormat() {
        // Arrange:  Create a known LocalDateTime for predictable output.
        LocalDateTime fixedTime = LocalDateTime.of(2024, 10, 27, 10, 30, 45, 123000000); // Example
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String expectedTime = fixedTime.format(formatter);

        // Act: Override LocalDateTime.now() for testing purposes (not ideal, but demonstrates a strategy).
        SystemTime st = new SystemTime() {
            @Override
            public String getCurrentTime() {
                return fixedTime.format(formatter);
            }
        };
        String actualTime = st.getCurrentTime();


        // Assert:
        assertEquals(expectedTime, actualTime);

    }


    @Test
    public void testInvalidFormat() {
        // Arrange: Simulate an invalid date-time string that doesn't match expected format.
        String invalidTimeString = "2024/10/27 10:30";

        // Act & Assert: Attempt to parse the invalid string; expect an exception
        assertThrows(DateTimeParseException.class, () -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
            LocalDateTime.parse(invalidTimeString, formatter); 
        });
    }



    // Corner Case Example (Daylight Saving Time transition) - Requires more advanced time handling:
    // (This test is commented out as it's beyond the scope of the basic SystemTime class,
    // but included for illustrative purposes if you were using ZonedDateTime)
    /*
    @Test
    public void testDaylightSavingTimeTransition() {
        // This would require using ZonedDateTime and setting up specific times around DST changes
        // to ensure the output is correct during transitions.
        // ... (Test logic using ZonedDateTime) ...
    }
    */


}

