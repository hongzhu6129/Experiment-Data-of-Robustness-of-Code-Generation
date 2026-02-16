import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTimeTest {

    @Test
    public void testValidFormat() {
        // Arrange:  Create a known LocalDateTime for testing
        LocalDateTime testDateTime = LocalDateTime.of(2024, 10, 27, 10, 30, 0, 123456789);

        // Act: Format the test date time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedTime = testDateTime.format(formatter);


        // Assert: Check if the formatted string matches the expected format
        assertEquals("2024-10-27 10:30:00.123", formattedTime);
    }


    @Test
    public void testInvalidFormatThrowsException() {
       // Arrange:  An invalid date time string. Note the incorrect month format
       String invalidDateTimeString = "2024-Oct-27 10:30:00.123";

       // Act and Assert:  Attempt parsing and expect an exception
       assertThrows(DateTimeParseException.class, () -> {
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
           LocalDateTime.parse(invalidDateTimeString, formatter);
       });

    }

}



