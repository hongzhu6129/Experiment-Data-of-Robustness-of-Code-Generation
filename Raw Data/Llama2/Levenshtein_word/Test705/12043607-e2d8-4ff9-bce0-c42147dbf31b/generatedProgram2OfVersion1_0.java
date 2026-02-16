import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (up to 7 x 10 = 70)\n"); // Replace ... with the full expected output
    }

    @Test
    void testZero() {
        testTable(0, "0 x 1 = 0\n0 x 2 = 0\n... (up to 0 x 10 = 0)\n");
    }

    // Add more tests for negative, large positive, large negative

    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();  // Capture System.out
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input); // Call the method

        String actualOutput = outputStream.toString().replace("\r", ""); // Normalize line endings

        assertTrue(actualOutput.contains(expectedOutput.replace("...", ""))); // Use contains for partial match because of ...

        System.setOut(System.out); // Restore System.out
    }
}

