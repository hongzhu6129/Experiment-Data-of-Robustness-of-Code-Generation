import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (check full output) ...\n7 x 11 = 77\n"); // ... represents lines 3-10
    }

    // Add tests for other cases (zero, negative, large numbers, etc.) using the testTable() method

    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(input);

        String actualOutput = outContent.toString().replace("\r", ""); // Normalize line endings for cross-platform testing
        assertTrue(actualOutput.contains(expectedOutput), "Output does not match expected for input " + input);  // Or use assertEquals for exact matching if you prefer

        System.setOut(System.out); // Restore standard output
    }
}
