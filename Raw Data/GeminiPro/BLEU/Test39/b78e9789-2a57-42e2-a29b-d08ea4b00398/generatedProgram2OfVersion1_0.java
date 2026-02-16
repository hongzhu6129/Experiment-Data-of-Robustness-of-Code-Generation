import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTimeTest {

    @Test
    void testDisplayCurrentSystemTime() {
        // Capture the current time before calling the method
        LocalDateTime before = LocalDateTime.now();

        // Call the method to get the formatted time string
        String formattedDateTime = captureSystemOut(() -> SystemTime.displayCurrentSystemTime());


        // Capture the current time after calling the method
        LocalDateTime after = LocalDateTime.now();


        // Parse the formatted string back into a LocalDateTime object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        LocalDateTime parsedDateTime = LocalDateTime.parse(formattedDateTime.substring("Current System Time: ".length()), formatter);



        // Assert that the parsed date/time is between the before and after times.
        // Allow a small tolerance (e.g., 1 second) due to execution time.
        assertTrue(parsedDateTime.isAfter(before.minus(1, ChronoUnit.SECONDS)));
        assertTrue(parsedDateTime.isBefore(after.plus(1, ChronoUnit.SECONDS)));

    }



    // Helper function to capture System.out
    private String captureSystemOut(Runnable runnable) {
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        runnable.run();
        System.setOut(System.out); // Restore System.out
        return outContent.toString();
    }

}
