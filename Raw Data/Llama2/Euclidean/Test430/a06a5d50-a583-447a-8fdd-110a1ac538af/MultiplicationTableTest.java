import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(8, "8 x 1 = 8\n8 x 2 = 16\n... (rest of the table)"); // ... add the rest
    }

    // ... (Other test methods for zero, negative, large, Integer.MAX_VALUE)

    private void testMultiplicationTable(int input, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(input); // Call the method directly

        String actualOutput = outContent.toString();
        assertTrue(actualOutput.contains(expectedOutput)); // Check that expected output is present


        System.setOut(System.out); // Restore standard output
    }

    // ... (Tests for invalid input with exception handling) 
 }

