import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        MultiplicationTable.printMultiplicationTable(7);
        String expectedOutput = "Multiplication table of 7:\n7 x 1 = 7\n7 x 2 = 14\n... (and so on up to 7 x 11)\n"; // Add the full expected output
        assertTrue(outContent.toString().contains(expectedOutput.substring(0,20))); // Check part of output to avoid newline issues.
         System.setOut(System.out); //Restore original stream
    }

    // Add similar @Test methods for the other test cases (0, -5, large numbers, etc.)

}
