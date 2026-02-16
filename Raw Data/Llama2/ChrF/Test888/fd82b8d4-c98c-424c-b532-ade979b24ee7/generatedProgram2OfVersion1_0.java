import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (check other values) ...\n7 x 10 = 70\n"); // ... represents the lines in between
     }

    // ... Add tests for other cases (zero, negative, large numbers)

    private void testTable(int input, String expectedOutputPartial) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input);

        String actualOutput = outputStream.toString();
        assertTrue(actualOutput.contains(expectedOutputPartial),  // Using contains for partial match
                "Output does not match expected for input: " + input + "\nExpected (partial):" + expectedOutputPartial + "\nActual: " + actualOutput);

        System.setOut(System.out); // Restore standard output
    }
}
