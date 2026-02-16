import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DivisibleBy3And5Test {

    @Test
    void testDivisibleBy3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        DivisibleBy3And5.main(new String[]{}); // Run your main method

        String expectedOutput = "3 6 9 ..."; // Fill in the expected output for numbers divisible by 3
        assertTrue(outContent.toString().contains(expectedOutput));
    }

    // ... Similarly, create tests for divisibility by 5 and both 3 & 5
}
