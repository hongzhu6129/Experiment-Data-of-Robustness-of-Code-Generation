import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(7, "Multiplication table of 7:\n7 x 1 = 7\n7 x 2 = 14\n... (rest of the table)\n7 x 10 = 70\n"); // Replace ... with the full table if needed
    }

    @Test
    void testNegativeNumber() {
        testMultiplicationTable(-5, "Multiplication table of -5:\n-5 x 1 = -5\n-5 x 2 = -10\n... (rest of the table)\n-5 x 10 = -50\n");
    }

    @Test
    void testZero() { // Corner case
        testMultiplicationTable(0, "Multiplication table of 0 is all zeros.\n"); 
    }

     // ... Add more test cases (large positive, large negative)


    private void testMultiplicationTable(int input, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // Capture console output
        System.setOut(new PrintStream(outContent)); 

        MultiplicationTable.printMultiplicationTable(input);
        String actualOutput = outContent.toString();

        // You might need to adjust the assertion slightly if you have line breaks in your expected output
        assertTrue(actualOutput.contains(expectedOutput.replace("\n", System.lineSeparator()))); // Use contains for partial matching.

        System.setOut(System.out); // Restore standard output
    }
}
