import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "Multiplication Table for 7:\n7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n");
    }

    @Test
    void testZero() {
       testTable(0, "Multiplication Table for 0:\n0 x 1 = 0\n0 x 2 = 0\n0 x 3 = 0\n0 x 4 = 0\n0 x 5 = 0\n0 x 6 = 0\n0 x 7 = 0\n0 x 8 = 0\n0 x 9 = 0\n0 x 10 = 0\n");
    }

    // Add more tests for negative, large positive, large negative numbers...

    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); 

        MultiplicationTable.printMultiplicationTable(input);

        assertEquals(expectedOutput, outputStream.toString());
        System.setOut(System.out); // Restore standard output
    }
}
