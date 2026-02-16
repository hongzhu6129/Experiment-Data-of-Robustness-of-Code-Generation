import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ScalarTableTest {

    @Test
    void testPositiveInteger() {
        testScalarTable(5, "5 x 1 = 5\n5 x 2 = 10\n... (and so on)"); // Replace ... with the full expected output
    }

    // Add similar test methods for other cases (zero, negative, large integers)

    private void testScalarTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); 

        ScalarTable.printScalarTable(input); // Call the method you're testing

        String actualOutput = outputStream.toString().trim();
        //assertEquals(expectedOutput, actualOutput); // For exact match. You might need to adjust for line endings etc.
        assertTrue(actualOutput.contains("5 x 1 = 5")); // Example of checking for part of the output (adapt as needed)


        System.setOut(System.out); // Restore standard output
    }
}
