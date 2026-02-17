import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class CountFactorsTest {

    @Test
    void testInput12() {
        String input = "12";
        String expectedOutput = "The number of factors of 12 is: 6\n";
        test(input, expectedOutput);
    }

    // ... (Add other test methods similarly)


    private void test(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        CountFactors.main(new String[0]); // Run the main method

        assertEquals(expectedOutput, out.toString());  // Assert output
    }
}

