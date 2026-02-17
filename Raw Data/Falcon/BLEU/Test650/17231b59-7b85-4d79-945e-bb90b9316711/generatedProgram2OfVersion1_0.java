import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OddNumbersTest {

    @Test
    void testStandardCase() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        OddNumbers.printOddNumbers(1, 99);
        String expectedOutput = generateExpectedOutput(1, 99); // Helper function (see below)
        assertEquals(expectedOutput, outputStream.toString()); 
        System.setOut(System.out); // Restore standard output
    }

   // ... (Similarly add tests for the other cases) ...

    private String generateExpectedOutput(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

     @Test
    void testInvalidRange() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        OddNumbers.printOddNumbers(10, 5);  // Example invalid range
        assertEquals("Invalid input range." + System.lineSeparator(), outputStream.toString());
        System.setOut(System.out);
    }
}

