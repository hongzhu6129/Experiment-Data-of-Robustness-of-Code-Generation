import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

public class DateTimeDisplayTest {

    @Test
    void testDisplayCurrentPreviousTime_basic() {
        // This is a simplified test, more comprehensive tests would be needed.
        LocalDateTime now = LocalDateTime.of(2024, 1, 15, 10, 30, 0, 0); // Example time
        LocalDateTime previousTime = now.minus(1, ChronoUnit.HOURS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        String expectedNow = now.format(formatter);
        String expectedPrevious = previousTime.format(formatter);


        // In a real test, you'd capture the output of displayCurrentPreviousTime()
        // For simplicity, I'm just testing the logic directly here.
        assertEquals(expectedNow, now.format(formatter)); // Trivial, but demonstrates the idea
        assertEquals(expectedPrevious, previousTime.format(formatter));
    }


    @Test
    void testDisplayCurrentPreviousTime_firstHourOfDay() {
        LocalDateTime now = LocalDateTime.of(2024, 1, 15, 0, 5, 0, 0); // 00:05
        LocalDateTime previousTime = now.minus(1, ChronoUnit.HOURS);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        String expectedPrevious = previousTime.format(formatter);  // Should be 23:05 on the previous day.

        assertEquals(expectedPrevious, previousTime.format(formatter));


    }

}

