import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(5, "5 x 1 = 5\n5 x 2 = 10\n... (check rest visually)\n5 x 10 = 50\n"); // ... represents omitted lines
    }

    // ... (Add tests for other cases: 0, negative, large numbers)

    private void testMultiplicationTable(int input, String expectedOutputFragment) {
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(input).getBytes());
        System.setIn(in); // Redirect System.in

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out)); // Redirect System.out

        MultiplicationTable.main(new String[0]); // Run main

        String actualOutput = out.toString();
        assertTrue(actualOutput.contains(expectedOutputFragment)); // Check if output contains expected fragment
    }
}
