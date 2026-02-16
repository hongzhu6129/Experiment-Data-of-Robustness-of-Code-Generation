import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Import Assertions class


public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent)); // Redirect System.out

        FacePrinter.printFace(); 

        String expectedOutput = "  +\"\"\"\"\"+\n [| o o |] \n  |  ^  | \n  | '-' | \n  +-----+\n"; // Add \n at end!
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore System.out (Important!)
    }
}
