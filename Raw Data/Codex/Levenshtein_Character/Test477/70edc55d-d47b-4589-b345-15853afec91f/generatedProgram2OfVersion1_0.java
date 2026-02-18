import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveInteger() {
        testTable(7, "Multiplication Table of 7:\n7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n");
    }

    @Test
    public void testZero() {
         testTable(0, "Multiplication Table of 0:\n0 x 1 = 0\n0 x 2 = 0\n0 x 3 = 0\n0 x 4 = 0\n0 x 5 = 0\n0 x 6 = 0\n0 x 7 = 0\n0 x 8 = 0\n0 x 9 = 0\n0 x 10 = 0\n");
    }

    // Add more tests for negative, large positive, and large negative integers

     private void testTable(int input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(input).getBytes());
        System.setIn(in);  // Redirect System.in

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out)); // Redirect System.out

        MultiplicationTable.main(new String[0]); // Run the main method

        assertEquals(expectedOutput, out.toString()); // Check the output
        System.setIn(System.in); // Restore System.in
        System.setOut(System.out); // Restore System.out

    }
}
