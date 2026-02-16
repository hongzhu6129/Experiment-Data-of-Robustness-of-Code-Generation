import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AsciiValueTest {

    @Test
    void testAsciiValue() {
        testCharacter('A', 65);
        testCharacter('a', 97);
        testCharacter('0', 48);
        // ... add more test cases ...
        testInvalidInput("", "Please enter a single character.");
        testInvalidInput("ab", "Please enter a single character.");
    }

    private void testCharacter(char input, int expectedAscii) {
        String inputString = String.valueOf(input);
        ByteArrayInputStream in = new ByteArrayInputStream(inputString.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        AsciiValue.main(new String[]{}); // Call your main method

        String actualOutput = out.toString().trim();  // Remove extra whitespace
        if (expectedAscii >= 0) { // Check if it's a valid character test
            assertEquals("The ASCII value of '" + input + "' is: " + expectedAscii, actualOutput);
        } else { // Check for invalid input error message
            assertTrue(actualOutput.contains("Please enter a single character.")); 
        }

        System.setIn(System.in); // Restore standard input
        System.setOut(System.out); // Restore standard output

    }

    private void testInvalidInput(String input, String expectedMessage) {
        testCharacter(input.charAt(0),-1); // Use -1 to signal invalid input check
    }


}
