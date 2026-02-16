import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(7, "Multiplication Table of 7:\n7 x 1 = 7\n7 x 2 = 14\n... (rest of the table)\n7 x 10 = 70\n"); // Replace ... with the actual values if needed
    }


    // ... other test methods for zero, negative, large numbers


    private void testMultiplicationTable(int input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(input).getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MultiplicationTable.main(new String[]{}); // Run your main method

        String actualOutput = out.toString().replace("\r", ""); // Remove carriage returns for cross-platform compatibility

        assertTrue(actualOutput.contains(expectedOutput.replace("...", ""))); // Use contains for partial matching because we use "..." to abbreviate the middle of some outputs.  Alternatively, write out the full expected string.
    }
}

