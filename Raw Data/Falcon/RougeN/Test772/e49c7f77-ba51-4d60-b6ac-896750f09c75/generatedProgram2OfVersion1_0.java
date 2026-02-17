import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DivisibleBy3And5Test {

    @Test
    void testStandardRange() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DivisibleBy3And5.main(new String[]{}); // Run your main method

        String expectedOutput = /* ... expected output for 1 to 100 ... */;  // Long string, create separately
        assertTrue(outContent.toString().contains(expectedOutput)); // Partial match is usually enough

        System.setOut(System.out); // Restore standard output
    }

    // ... Add more test methods for other ranges ...
}
