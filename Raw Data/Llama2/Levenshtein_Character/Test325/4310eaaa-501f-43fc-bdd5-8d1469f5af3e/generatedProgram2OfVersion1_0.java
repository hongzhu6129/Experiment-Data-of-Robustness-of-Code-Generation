import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintFaceTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintFace.printFace();

        String expectedOutput = "  +\"\"\"\"\"+ \r\n" +  // \r\n for Windows line endings
                              " [| o o |] \r\n" +
                              "  |  ^  | \r\n" +
                              "  | '-' | \r\n" +
                              "  +-----+ \r\n"; // Or use System.lineSeparator()

        assertEquals(expectedOutput, outContent.toString());

        // Restore original System.out
        System.setOut(System.out); 
    }
}
