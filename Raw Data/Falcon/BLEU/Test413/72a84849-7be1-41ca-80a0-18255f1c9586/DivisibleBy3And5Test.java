import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleBy3And5Test {

    @Test
    void testStandardRange() {
        // Capture system.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DivisibleBy3And5.main(new String[]{});  // Call your main method

        String expectedOutput = /* ... expected output for 1 to 100 ...*/; 
        assertEquals(expectedOutput, outContent.toString());

        // Restore system.out
        System.setOut(System.out);
    }

    // Add tests for other cases (Empty Range, Single Number, 0, Negatives)
}
