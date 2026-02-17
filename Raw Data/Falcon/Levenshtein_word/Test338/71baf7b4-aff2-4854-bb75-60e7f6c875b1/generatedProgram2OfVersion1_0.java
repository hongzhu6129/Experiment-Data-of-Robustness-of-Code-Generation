import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveInteger() {
        testTable(5, "Multiplication Table for 5:\n5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n");
    }

    // Add similar tests for other cases (0, negative, large numbers)


    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(input);

        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out); // Restore standard output
    }
}
