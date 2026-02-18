import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();  // Capture output
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(7);  // Call the function

        String expectedOutput = "Multiplication Table for 7:\r\n" +  // \r\n for Windows line endings
                                "7 x 1 = 7\r\n" + 
                               // ... (rest of the expected lines)
                               "7 x 10 = 70\r\n";

        assertEquals(expectedOutput, outContent.toString()); // Assert output
        System.setOut(System.out); // Restore standard output
    }

    // ... (Similarly write tests for other cases)

}

