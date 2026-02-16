import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AnotherFaceTest {

    @Test
    void testPrintFace() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        AnotherFace.printFace();

        String expectedOutput = "  /////  \r\n" + // Note \r\n for Windows, \n for Linux/macOS
                               "| o o | \r\n" +
                               "(|  ^  |) \r\n" +
                               " \\ ---- / \r\n" +
                               "  -----  \r\n";  

        assertEquals(expectedOutput, outContent.toString());

        // Restore System.out
        System.setOut(System.out); 
    }
}
