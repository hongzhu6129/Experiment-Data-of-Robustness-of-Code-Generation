import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HexagonAreaTest {

    @Test
    void testPositiveSideLength() {
        String input = "5\n";  // Simulate user input
        String expectedOutput = "The area of the hexagon is: 64.95\n";
        testHexagonArea(input, expectedOutput);
    }

    // Add more @Test methods for other test cases

    private void testHexagonArea(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        HexagonArea.main(new String[0]); // Run the main method

        assertEquals(expectedOutput, out.toString());
        System.setIn(System.in); // Restore standard input
        System.setOut(System.out); // Restore standard output
    }
}
