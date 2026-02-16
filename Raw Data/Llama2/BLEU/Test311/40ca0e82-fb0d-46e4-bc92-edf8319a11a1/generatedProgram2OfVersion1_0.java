import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;



public class MultiplicationTableTest {
    @Test
    void testMultiplicationTable5() {
        testMultiplication(5, "5 x 1 = 5\n5 x 2 = 10\n... (up to 10)\n5 x 10 = 50\n"); // Replace ... with the full output
    }


    // Add more @Test methods for other test cases


    private void testMultiplication(int input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(String.valueOf(input).getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        MultiplicationTable.main(new String[0]); // Run main with input


        assertEquals(expectedOutput, out.toString());

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);
    }
}

