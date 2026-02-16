import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CircleCalculationsTest {

    @Test
    public void testPositiveRadius() {
        String input = "7.5";
        String expectedOutput = "Perimeter is = 47.12388980384690\nArea is = 176.71458676442586\n";  // Note: Adjusted for rounding
        testCircleCalculations(input, expectedOutput);
    }


    // ... (Add similar test methods for other cases)


    private void testCircleCalculations(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CircleCalculations.main(new String[0]);

        String actualOutput = out.toString().replace("\r", "");  // Handle potential Windows line endings
        assertEquals(expectedOutput, actualOutput);  // JUnit assertion
    }
}
