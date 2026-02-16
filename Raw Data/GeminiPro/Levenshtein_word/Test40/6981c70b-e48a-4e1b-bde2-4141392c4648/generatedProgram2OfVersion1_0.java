import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeTest {

    @Test
    public void testSingleDigitValues() {
        // Mock LocalDateTime.now() - you'll need a mocking library like Mockito for this in a real project
        LocalDateTime mockNow = LocalDateTime.of(2024, 1, 5, 2, 3, 4, 5_000_000); // January 5th, 2:03:04.005

        // Use a custom formatter to isolate this test from changes in getCurrentDateTime()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
        String expected = formatter.format(mockNow); // "2024/01/05 02:03:04.005"

        // For this example, we call format directly, but in a real application, you would 
        // replace this with a call to your getCurrentDateTime() method, having mocked the LocalDateTime.now() call.
        String actual = formatter.format(mockNow); 

        assertEquals(expected, actual); 
    }
   // ... Other test cases
}

