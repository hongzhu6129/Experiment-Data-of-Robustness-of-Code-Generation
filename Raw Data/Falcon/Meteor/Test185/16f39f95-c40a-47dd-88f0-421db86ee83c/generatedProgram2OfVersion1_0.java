import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleBy3And5Test {

    @Test
    public void testRange1to5() {
        testRange(1, 5, "3 \n", "5 \n", ""); // Expected outputs for 3, 5, and both
    }

    // ... other test methods for different ranges ...

    private void testRange(int start, int end, String expectedBy3, String expectedBy5, String expectedByBoth) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();  // Capture output
        System.setOut(new PrintStream(outputStream));

        DivisibleBy3And5.main(new String[]{}); // Run the main method
        // Split the output string by newline to compare individually for 3, 5, and both.
        String[] outputLines = outputStream.toString().split("\n");
        assertEquals("Divisible by 3:\n" + expectedBy3, outputLines[0]+"\n"+outputLines[1]); // Lines 0 and 1
        assertEquals("Divisible by 5:\n" + expectedBy5, outputLines[2]+"\n"+outputLines[3]); // Lines 2 and 3
        assertEquals("Divisible by both 3 and 5:\n" + expectedByBoth, outputLines[4]+"\n"+outputLines[5]); // Lines 4 and 5

        System.setOut(System.out); // Restore standard output
    }
}
