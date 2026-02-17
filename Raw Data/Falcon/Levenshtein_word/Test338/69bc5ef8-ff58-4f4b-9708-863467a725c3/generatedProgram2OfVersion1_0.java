import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveInteger() {
         testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... (up to 7 x 10)"); // ... represents the rest of the table
    }

    // ... (similar test methods for other cases)

     private void testTable(int input, String expectedOutputSnippet) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input); 

        String output = outputStream.toString();
        assertTrue(output.contains(expectedOutputSnippet)); // Check if the output contains the expected part
        System.setOut(System.out); // Restore standard output
    }
}

