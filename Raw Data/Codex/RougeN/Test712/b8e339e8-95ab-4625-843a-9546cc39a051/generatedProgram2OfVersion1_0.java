import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintOddNumbersTest {

    @Test
    void testStandardCase() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintOddNumbers.printOddNumbers(1, 99);

        String expectedOutput = generateExpectedOutput(1, 99); // Helper function (see below)
        assertEquals(expectedOutput, outContent.toString());

         System.setOut(System.out); // Restore System.out
    }

    // ... similar test methods for other cases ...

    @Test
    void testInvalidInputStartGreaterThanEnd() {
        assertThrows(IllegalArgumentException.class, () -> {
            PrintOddNumbers.printOddNumbers(10, 5);
        });
    }

    // Helper function to generate expected output string:
    private String generateExpectedOutput(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
