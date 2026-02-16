import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static org.mockito.Mockito.*;


class CurrentDateTimeTest {

    @Test
    void testGetCurrentDateTime() {
        // Mock LocalDateTime.now() to control the time for testing
        LocalDateTime mockNow = LocalDateTime.of(2024, Month.OCTOBER, 31, 23, 59, 59, 999000000); // Example near end of day/month/year
        LocalDateTime now = mock(LocalDateTime.class); // Mocking LocalDateTime
        when(now.now()).thenReturn(mockNow);

        // Use reflection to access and override the now method in getCurrentDateTime (a bit complex for a simple example, but necessary for full control in unit tests)
      // [Reflection code to replace the LocalDateTime.now() call in getCurrentDateTime with the mock would go here]

        String expected = "2024/10/31 23:59:59.999";
        String actual = CurrentDateTime.getCurrentDateTime();  // Calling the method with the mocked time

        assertEquals(expected, actual);


    }


}

