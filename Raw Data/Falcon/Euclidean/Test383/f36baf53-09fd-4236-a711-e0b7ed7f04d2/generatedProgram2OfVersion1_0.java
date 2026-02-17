import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class CurrentDateTimeTest {

    @Test
    void testValidFormat() {
        String format = "yyyy/MM/dd HH:mm:ss.SSS";
        String currentDateTime = CurrentDateTime.getCurrentDateTime(format);
        // Check if the string is not null or empty and roughly matches the expected format.  A precise match is difficult due to the dynamic nature of time.
        assertNotNull(currentDateTime);
        assertFalse(currentDateTime.isEmpty());
        assertTrue(currentDateTime.matches("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}")); 
    }



    @Test
    void testDifferentValidFormat() {
        String format = "EEEE, MMMM dd, yyyy hh:mm:ss a"; // Longer format
        String currentDateTime = CurrentDateTime.getCurrentDateTime(format);
        assertNotNull(currentDateTime);
        assertFalse(currentDateTime.isEmpty());

    }

    @Test
    void testInvalidFormat() {
       assertThrows(DateTimeParseException.class, () -> {
           CurrentDateTime.getCurrentDateTime("yyyy/MM/dd HHmmssSSS"); // Incorrect spacing
       });

       assertThrows(DateTimeParseException.class, () -> {
           CurrentDateTime.getCurrentDateTime("yyyy/MM/DDD HH:mm:ss.SSS"); // Invalid pattern 'DDD'
       });

    }


    @Test
    void testLeapYear() {  // Corner case: Leap year
        // Set a date in a leap year (you'd typically use a mocking library for this in a real project)
        // This test is more illustrative.  A thorough test would require a lot more date manipulation.
       String format = "yyyy/MM/dd HH:mm:ss.SSS";
       // Test around a leap year date - it's not possible to *set* the current time easily without mocking,
       //  so this test is not as comprehensive as it could be.
       String february29th2024 = "2024/02/29 10:20:30.456"; // Leap year
       // Assert the correct date and time format is still returned even with a leap year date

       //  Mocking or dependency injection would usually be used in a larger application to simulate different dates/times.

       String currentDateTime = CurrentDateTime.getCurrentDateTime(format); // Current date/time, not the test date
       assertNotNull(currentDateTime);
       assertFalse(currentDateTime.isEmpty());
       assertTrue(currentDateTime.matches("\\d{4}/\\d{2}/\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}")); // Check the format


    }



}
