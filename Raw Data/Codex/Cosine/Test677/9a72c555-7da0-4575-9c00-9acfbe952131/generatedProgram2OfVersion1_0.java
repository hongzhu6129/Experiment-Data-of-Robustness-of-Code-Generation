import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DivisibilityCheckTest {

    @Test
    public void testDivisibility() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // Capture output
        System.setOut(new PrintStream(outContent));

        DivisibilityCheck.main(new String[]{}); // Run your main method

        String expectedOutput = /* Your expected output based on the range 1-100 */;
        String actualOutput = outContent.toString();

        // JUnit assertion:
        assertTrue(actualOutput.contains("Numbers divisible by 3:")); // Example assertions
        assertTrue(actualOutput.contains("3 6 9 ... 99 ")); // ... (add assertions for other test cases)
        // ... other assertions for 5 and both
        System.setOut(System.out); // Restore standard output
    }

    // Add more @Test methods for other test cases (e.g., boundary cases)
}
