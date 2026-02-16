// Example using JUnit (you'll need to add the JUnit library to your project)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (up to 7 x 10 = 70)"); // ... represents the rest of the table
    }

    @Test
    void testZero() {
       testTable(0, "0 x 1 = 0\n0 x 2 = 0\n... (up to 0 x 10 = 0)");
    }


    // Add tests for negative, large, and small numbers similarly


    private void testTable(int input, String expectedOutputSnippet) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input);

        String actualOutput = outputStream.toString();
        assertTrue(actualOutput.contains(expectedOutputSnippet)); // Use contains to partially check output
        System.setOut(System.out); // Restore standard output
    }
}
