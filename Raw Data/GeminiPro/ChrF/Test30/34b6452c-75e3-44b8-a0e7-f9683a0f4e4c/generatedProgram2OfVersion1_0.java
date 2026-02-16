import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class HexagonAreaTest {

    @Test
    void testValidInput() {
        String input = "5";
        String expectedOutput = "The area of the hexagon is: 64.9519052838329\n";  // Note the newline
        testHexagonArea(input, expectedOutput);
    }

    // ... similar tests for other cases ...

    private void testHexagonArea(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        HexagonArea.main(new String[0]); // Run the main method

        assertEquals(expectedOutput, out.toString());

        // Reset System.in and System.out to their defaults (important!)
        System.setIn(System.in);
        System.setOut(System.out); 
    }

}
