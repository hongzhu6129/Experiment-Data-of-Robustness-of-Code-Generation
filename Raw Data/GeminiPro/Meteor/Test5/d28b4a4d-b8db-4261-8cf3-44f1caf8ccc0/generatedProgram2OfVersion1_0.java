import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AverageOfThreeTest {

    @Test
    public void testNormalCase() {
        testAverage(10, 20, 30, 20.0);
    }

    // Add tests for other cases similarly...
    @Test
    public void testNaNInput() {
        testAverage(1, 2, Double.NaN, Double.NaN);
    }


    private void testAverage(double num1, double num2, double num3, double expectedAverage) {
        String input = num1 + "\n" + num2 + "\n" + num3 + "\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AverageOfThree.main(new String[]{}); // Run your main method

        String output = outputStream.toString().trim();
        String expectedOutput = "The average is: " + expectedAverage;

        if (Double.isNaN(expectedAverage)) {
            assertTrue(output.contains("NaN")); // Special handling for NaN comparisons
        } else {
            assertEquals(expectedOutput, output); // Normal comparison
        }
       
        System.setIn(System.in); // Restore standard input
        System.setOut(System.out); // Restore standard output
    }
}

