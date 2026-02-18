import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CircleCalculationsTest {

    @Test
    void testStandardCase() {
        String input = "7.5";
        String expectedOutput = "Perimeter is = 47.12388980384689\nArea is = 176.71458676442586\n";
        testWithInput(input, expectedOutput);
    }


    // Add similar test methods for other cases (zero radius, large radius, etc.)

    @Test
    void testNegativeRadius() {
        String input = "-5";
        String expectedOutput = "Radius cannot be negative.\n";
        testWithInput(input, expectedOutput);
    }




    private void testWithInput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CircleCalculations.main(new String[]{}); // Call your main method

        assertEquals(expectedOutput, outContent.toString());

        // Reset System.in and System.out to their original values (important!)
        System.setIn(System.in);
        System.setOut(System.out);
    }
}

