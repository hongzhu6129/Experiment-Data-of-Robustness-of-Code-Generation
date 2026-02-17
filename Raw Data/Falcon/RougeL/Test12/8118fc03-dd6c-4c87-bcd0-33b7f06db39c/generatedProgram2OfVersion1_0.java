import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirect System.out

        FacePrinter.printFace();

        String expectedOutput = "  +\"\"\"\"+ \r\n" + // \r\n for Windows line endings
                               "[| o o |] \r\n" +
                               "  |  ^  | \r\n" +
                               "  | '-' | \r\n" +
                               "  +-----+ \r\n";

        assertEquals(expectedOutput, outputStream.toString()); // Compare the output

        // Restore System.out (important!)
        System.setOut(System.out);
    }
}
