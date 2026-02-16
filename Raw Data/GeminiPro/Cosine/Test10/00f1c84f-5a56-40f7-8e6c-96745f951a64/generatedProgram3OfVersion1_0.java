import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        FacePrinter.printFace();

        String expectedOutput = "  +\"\"\"\"+ \r\n" + // \r\n for Windows line endings
                                "[| o o |] \r\n" +
                                " |  ^  | \r\n" +
                                " | '-' | \r\n" +
                                " +-----+ \r\n";

        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore standard output
    }
}

