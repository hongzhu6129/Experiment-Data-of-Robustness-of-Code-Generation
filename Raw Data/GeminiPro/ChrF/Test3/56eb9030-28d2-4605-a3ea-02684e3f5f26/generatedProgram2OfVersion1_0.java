import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(5);

        String expectedOutput = "Multiplication table of 5:\n5 x 1 = 5\n5 x 2 = 10\n... (rest of the table)"; // Abbreviated for brevity
        assertTrue(outContent.toString().contains(expectedOutput));  // Check if output contains the expected lines
    }

    // Add similar @Test methods for other test cases (negative, zero, large numbers)
}
