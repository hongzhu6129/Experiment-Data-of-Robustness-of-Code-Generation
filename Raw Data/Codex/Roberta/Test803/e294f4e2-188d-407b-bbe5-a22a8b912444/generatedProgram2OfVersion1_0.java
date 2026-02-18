import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DivisibleBy3And5Test {

    @Test
    void testDivisibility() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        DivisibleBy3And5.main(new String[]{}); // Run the main method

        String output = outputStream.toString();

        assertTrue(output.contains("15")); // Check for numbers divisible by both
        assertTrue(output.contains("30"));
        assertTrue(output.contains("90"));
        assertTrue(output.contains("3"));  // Check for numbers divisible by 3
        assertTrue(output.contains("99"));
        assertTrue(output.contains("5")); // Check for numbers divisible by 5
        assertTrue(output.contains("100"));
        assertFalse(output.contains("1")); //Check boundary conditions
        assertFalse(output.contains("0")); // Check for zero
        assertFalse(output.contains("-15")); //Check negative numbers

        System.setOut(System.out); // Restore standard output

    }

}

