import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ScalarTableTest {

    @Test
    void testPositiveInteger() {
        testScalarTable(7, "7 x 1 = 7\n7 x 2 = 14\n...\n7 x 10 = 70\n"); // Replace ... with full output for a more thorough test
    }
    // Add similar tests for other cases (negative, zero, large numbers, invalid input).

    private void testScalarTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ScalarTable.printScalarTable(input); 

        String actualOutput = outputStream.toString().replace("\r", ""); // Normalize line endings
        assertTrue(actualOutput.contains(expectedOutput)); // Use assertTrue and contains() for a partial match due to the "..."
        System.setOut(System.out); // Restore standard output
    }



    @Test
    void testInvalidInput() {
         // Simulate invalid input using System.setIn()
        // ... (more advanced, shown in previous example, adapt for JUnit 5)
    }

}
