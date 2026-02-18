import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class ScalarTableTest {

    @Test
    public void testPositiveInteger() {
        testScalarTable(5, "5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n");
    }
    // ... Add similar @Test methods for the other test cases ...

    private void testScalarTable(int input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(input).getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ScalarTable.main(new String[]{}); // Run your main method

        String actualOutput = out.toString();
        assertEquals("Scalar Table for " + input + ":\n" + expectedOutput, actualOutput);  // Use assertEquals
    }
}
