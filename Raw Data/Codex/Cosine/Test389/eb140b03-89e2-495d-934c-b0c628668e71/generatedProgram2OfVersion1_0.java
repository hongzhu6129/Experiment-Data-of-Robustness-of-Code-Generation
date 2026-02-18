import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class CircleCalculationsTest {

    @Test
    void testRadius7_5() {
        String input = "7.5";
        String expectedOutput = "Perimeter is = 47.12388980384689\nArea is = 176.71458676442586\n";
        testWithInput(input, expectedOutput);
    }


    @Test
    void testRadiusZero() {
        String input = "0";
        String expectedOutput = "Perimeter is = 0.0\nArea is = 0.0\n";
        testWithInput(input, expectedOutput);
    }


    @Test
    void testRadiusOne() { // Simple, easy-to-calculate case
        String input = "1";
        String expectedOutput = "Perimeter is = 6.283185307179586\nArea is = 3.141592653589793\n";
        testWithInput(input, expectedOutput);
    }


    @Test
    void testNegativeRadius() {  // Handling invalid input � expects an exception or special handling
        String input = "-1";
        // Option 1: If you handle negative radius gracefully (e.g., by using Math.abs) adjust the expected output
        // String expectedOutput = "Perimeter is = ...\nArea is = ...\n";

        // Option 2:  If you want to throw an exception: (more robust)
        assertThrows(IllegalArgumentException.class, () -> {
            injectInputAndRun(input);  // A helper method to set input and run your main method
        });

        // You would need to modify your main method to actually throw the exception in case of negative radius:
        // if (radius < 0) {
        //     throw new IllegalArgumentException("Radius cannot be negative");
        // }

    }


    // Helper method for setting input and running the main method
    private void testWithInput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        CircleCalculations.main(new String[0]);  // Run your main method

        assertEquals(expectedOutput, out.toString());
        System.setIn(System.in); // Restore System.in
        System.setOut(System.out); // Restore System.out

    }

    // Helper function to inject input and run the main method (for exception testing)
    private void injectInputAndRun(String input) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        CircleCalculations.main(new String[0]);
        System.setIn(System.in); // Restore System.in 
    }
}

