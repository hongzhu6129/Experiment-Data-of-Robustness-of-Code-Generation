import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveNumber() {
        testMultiplicationTable(7, "7 x 1 = 7\n7 x 2 = 14\n...7 x 10 = 70\n"); // ... represents the other lines
    }

    // Add similar @Test methods for other test cases (0, negative, large numbers, etc.)

    private void testMultiplicationTable(int input, String expectedOutput) {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Provide input to System.in
        String inputString = String.valueOf(input) + "\n"; // Add newline
        System.setIn(new ByteArrayInputStream(inputString.getBytes()));

        // Run the main method
        MultiplicationTable.main(new String[]{});


        // Check the captured output
        String actualOutput = outputStream.toString();
        assertTrue(actualOutput.contains(expectedOutput), "Incorrect output for input: " + input);
    }



}

