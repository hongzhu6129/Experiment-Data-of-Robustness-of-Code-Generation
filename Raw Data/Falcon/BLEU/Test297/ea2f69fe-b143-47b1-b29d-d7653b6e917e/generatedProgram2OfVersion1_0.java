import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit; // For more precise time comparisons


public class CurrentDateTimeTest {

    @Test
    void testStandardFormat() {
        String format = "yyyy/MM/dd HH:mm:ss.SSS";
        String actualDateTime = CurrentDateTime.getCurrentDateTime(format);

        // Get the current time immediately before assertion for accuracy
        LocalDateTime now = LocalDateTime.now();
        String expectedDateTime = now.format(DateTimeFormatter.ofPattern(format));

        // Allow a small time difference due to execution time.
        assertTrue( ChronoUnit.MILLIS.between(LocalDateTime.parse(actualDateTime, DateTimeFormatter.ofPattern(format)), now) < 100 ); // Within 100ms

    }



    @Test
    void testDifferentFormat() {
        String format = "EEEE, MMMM dd, yyyy hh:mm:ss a";  // Different format
        String actualDateTime = CurrentDateTime.getCurrentDateTime(format);

        LocalDateTime now = LocalDateTime.now();
        String expectedDateTime = now.format(DateTimeFormatter.ofPattern(format));
        assertTrue( ChronoUnit.MILLIS.between(LocalDateTime.parse(actualDateTime, DateTimeFormatter.ofPattern(format)), now) < 100 ); // Within 100ms
    }

    @Test
    void testInvalidFormat() {
       assertThrows(IllegalArgumentException.class,  () -> CurrentDateTime.getCurrentDateTime("yyyy/MM/dd HHmm")); // Missing colon, should throw an exception       
    }

    @Test 
    void testEmptyFormat() {
        assertThrows(IllegalArgumentException.class, () -> CurrentDateTime.getCurrentDateTime("")); // Empty format
    }



    @Test
    void testYearChange(){ // Corner case: check around New Year
        //This would require mocking the system clock, which is beyond the scope of a basic example.
        // In a real-world test, consider tools like PowerMock for this.
    }


     @Test
    void testDaylightSavingsTimeChange(){ // Corner case: DST
         // Requires similar mocking as year change.
    }

}
