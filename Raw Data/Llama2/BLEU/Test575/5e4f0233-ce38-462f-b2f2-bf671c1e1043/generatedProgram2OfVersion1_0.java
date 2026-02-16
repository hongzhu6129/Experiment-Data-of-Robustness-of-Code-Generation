import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FacePrinterTest {

    @Test
    void testPrintFace() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FacePrinter.printFace();

        String expectedOutput = "  +\"\"\"\"+ \r\n" + // \r\n for Windows line endings
                               "[| o o |] \r\n" + 
                               "  |  ^  | \r\n" +
                               "  | '-' | \r\n" +
                               "  +-----+ \r\n";  
        assertEquals(expectedOutput, outputStream.toString()); // Use platform-independent line separators if necessary

        System.setOut(System.out); // Restore standard output
    }
}
