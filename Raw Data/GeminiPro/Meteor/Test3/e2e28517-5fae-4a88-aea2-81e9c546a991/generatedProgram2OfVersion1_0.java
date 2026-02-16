import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (check other lines) ...\n7 x 10 = 70\n");  // ... represents the lines in between. Fill in as needed.
    }

    // ... (Add other test methods for negative, zero, large numbers) ...

    private void testTable(int input, String expectedOutputSnippet) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(input);

        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(expectedOutputSnippet));  // Check if the output contains the expected snippet
        System.setOut(System.out); // Restore System.out
    }
}
