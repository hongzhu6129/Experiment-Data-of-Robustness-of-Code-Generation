import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testMultiplicationTable5() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // Capture output
        System.setOut(new PrintStream(outContent)); 

        MultiplicationTable.printMultiplicationTable(5);

        String expectedOutput = "Multiplication Table for 5:\r\n5 x 1 = 5\r\n5 x 2 = 10\r\n5 x 3 = 15\r\n5 x 4 = 20\r\n5 x 5 = 25\r\n5 x 6 = 30\r\n5 x 7 = 35\r\n5 x 8 = 40\r\n5 x 9 = 45\r\n5 x 10 = 50\r\n"; // Adjust \r\n for your OS
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out);  // Restore System.out
    }

    // Add more test cases similarly for other inputs (0, -7, Integer.MAX_VALUE, etc.)
}
