import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveInput() {
        String input = "7\n";
        String expectedOutput = "Multiplication Table of 7:\n7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n";
        testMultiplicationTable(input, expectedOutput);
    }

    // Add similar @Test methods for other test cases (zero, negative, invalid input, etc.)

    private void testMultiplicationTable(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        MultiplicationTable.main(new String[0]); // Run the main method

        assertEquals(expectedOutput, out.toString());
    }
}
