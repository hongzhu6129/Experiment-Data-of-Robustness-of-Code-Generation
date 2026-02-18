import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveNumber() {
        String input = "7\n";  // Input with newline
        String expectedOutput = "Multiplication Table of 7:\n7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n";
        testMultiplicationTable(input, expectedOutput);
    }

     // ... (Add more @Test methods for other test cases) ...

    private void testMultiplicationTable(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in); // Redirect System.in

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out)); // Redirect System.out

        MultiplicationTable.main(new String[0]);  // Run the main method

        assertEquals(expectedOutput, out.toString()); // Assert expected vs actual output

        // Restore System.in and System.out (Good practice)
        System.setIn(System.in);
        System.setOut(System.out);
    }
}

