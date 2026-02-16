import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // Capture the output
        System.setOut(new PrintStream(outputStream)); // Redirect System.out

        FacePrinter.printFace();

        String expectedOutput = "  +\"\"\"\"\"+\n [| o o |]\n  |  ^  |\n  | '-' |\n  +-----+\n"; // Note the \n at the end!
        assertEquals(expectedOutput, outputStream.toString());

        // Restore System.out (important!)
        System.setOut(System.out); 
    }
}

