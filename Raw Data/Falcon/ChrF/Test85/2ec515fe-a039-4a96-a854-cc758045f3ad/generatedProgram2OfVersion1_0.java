import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class DivisibleBy3And5Test {

    @Test
    void testRange1To15() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // Capture output
        System.setOut(new PrintStream(outContent));

        DivisibleBy3And5.main(new String[]{}); // Call main

        String expectedOutput = "..."; // Put the expected output string here
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore standard output
    }

    // Add more test methods for other cases
}
