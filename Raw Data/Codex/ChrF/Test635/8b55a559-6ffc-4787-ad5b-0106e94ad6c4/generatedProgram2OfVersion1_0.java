import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testTable(7, "7 x 1 = 7\n7 x 2 = 14\n... // Check the full output\n7 x 10 = 70\n"); // Replace ... with the full expected output
    }

    @Test
    void testZero() {
        testTable(0, "0 x 1 = 0\n0 x 2 = 0\n...\n0 x 10 = 0\n"); // Replace ...
    }

    @Test
    void testNegativeNumber() {
        testTable(-5, "-5 x 1 = -5\n-5 x 2 = -10\n...\n-5 x 10 = -50\n"); // Replace ...
    }



    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirect System.out
        MultiplicationTable.printMultiplicationTable(input);
        String actualOutput = outputStream.toString();
        assertTrue(actualOutput.contains(expectedOutput), "Incorrect output for input: " + input); // Or assertEquals if you want an exact match
        System.setOut(System.out); // Restore System.out
    }
}

