import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacePrinterTest {

    @Test
    void testPrintFace() {
        // Capture System.out
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        FacePrinter.printFace(); // Call the method that prints

        // Reset System.out (important!)
        System.setOut(System.out);

        String expectedOutput = "  +\"\"\"\"+ \n" +
                                "[| o o |] \n" +
                                "  |  ^  | \n" +
                                "  | '-' | \n" +
                                "  +-----+ \n"; // Note: Include newline \n

        assertEquals(expectedOutput, outputStream.toString());
    }
}
