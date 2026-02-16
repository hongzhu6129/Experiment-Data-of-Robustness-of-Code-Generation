import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (up to 11)"); // ... represents the rest of the table
    }

    @Test
    void testZero() {
        testMultiplicationTable(0, "0 x 1 = 0\n0 x 2 = 0\n... (up to 11)");
    }

    @Test
    void testNegativeNumber() {
        testMultiplicationTable(-5, "-5 x 1 = -5\n-5 x 2 = -10\n... (up to 11)");
    }

    // ... other test cases (large positive/negative)


    private void testMultiplicationTable(int input, String expectedOutputSnippet) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();  // Capture system output
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(input);

        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(expectedOutputSnippet));  // Check if the expected output is present
        System.setOut(System.out); // Restore system output
    }
}
