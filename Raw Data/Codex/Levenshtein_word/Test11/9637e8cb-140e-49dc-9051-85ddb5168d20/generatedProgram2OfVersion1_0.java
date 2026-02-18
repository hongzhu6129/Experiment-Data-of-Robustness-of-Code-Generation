import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AverageOfThreeTest {

    @Test
    void testNormalCase() {
        String input = "10 20 30";
        String expectedOutput = "The average is: 20.0\n"; // \n for newline
        testAverage(input, expectedOutput); 
    }

    // Add more @Test methods for other test cases

    private void testAverage(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        AverageOfThree.main(new String[0]);  // Run the main method

        assertEquals(expectedOutput, out.toString()); 
    }
}
