import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


class SystemTimeTest {

    @Test
    void testFormat() {
        // Create a known LocalDateTime for testing
        LocalDateTime testDateTime = LocalDateTime.of(2024, 10, 27, 10, 30, 0, 0);

        // Format using the same pattern as getCurrentSystemTime()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String expectedFormattedDateTime = testDateTime.format(formatter);


        //  Manipulate system time (for testing ONLY - not recommended in real applications!)
        //  This section demonstrates how you might approach testing if you COULD control time
        //  However, this is usually impractical.
        //  SystemTimeMock.setCurrentTime(testDateTime); // Hypothetical time-setting function
        //  String actualFormattedDateTime = SystemTime.getCurrentSystemTime(); 
        //  assertEquals(expectedFormattedDateTime, actualFormattedDateTime);

        // More realistic approach: Check if the output matches the expected format
        String actualFormattedDateTime = SystemTime.getCurrentSystemTime();
        assertTrue(actualFormattedDateTime.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}")); // Regular expression check
    }



    @Test
    void testReasonableTimeDifference() {  // More practical test
        LocalDateTime before = LocalDateTime.now();
        String currentTime = SystemTime.getCurrentSystemTime();
        LocalDateTime after = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime parsedCurrentTime = LocalDateTime.parse(currentTime, formatter);


        assertTrue(parsedCurrentTime.isAfter(before.minus(1, ChronoUnit.SECONDS))); // Allow a small margin of error
        assertTrue(parsedCurrentTime.isBefore(after.plus(1, ChronoUnit.SECONDS)));

    }

    // Corner cases (These are more about testing the date-time library itself, which is robust):
    @Test
    void testLeapYear() {
        // Test around a leap year (e.g., 2024-02-29) - ensure the formatter handles it
        // Create and format a known date-time around a leap year/day
        LocalDateTime leapDay = LocalDateTime.of(2024, 2, 29, 12, 0, 0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedLeapDay = leapDay.format(formatter); 
        assertEquals("2024-02-29 12:00:00.000", formattedLeapDay);

    }

     @Test
    void testYearChange() {
        // Test around a year change (e.g., 2023-12-31 to 2024-01-01).
        //  Similar to leap year test, create and format dates around the year change.
        // The underlying Java time library handles these cases very well.
         LocalDateTime yearEnd = LocalDateTime.of(2023, 12, 31, 23, 59, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedYearEnd = yearEnd.format(formatter); 
        assertEquals("2023-12-31 23:59:59.000", formattedYearEnd);

        LocalDateTime yearStart = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        String formattedYearStart= yearStart.format(formatter); 
        assertEquals("2024-01-01 00:00:00.000", formattedYearStart);

    }


}
