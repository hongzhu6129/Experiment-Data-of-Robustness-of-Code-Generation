import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class AverageCalculatorTest {

    @Test
    public void testNormalCase() {
        String input = "10\n20\n30\n";
        String expectedOutput = "The average is: 20.0\n"; // Note:  match the exact output incl. newline.
        testAverage(input, expectedOutput);
    }



    // ... add more @Test methods for other test cases


    private void testAverage(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        AverageCalculator.main(new String[0]); // Run your main method

        assertEquals(expectedOutput, out.toString()); // Assert that the output matches the expected output

        System.setIn(System.in); // Restore System.in
        System.setOut(System.out); // Restore System.out
    }
}
