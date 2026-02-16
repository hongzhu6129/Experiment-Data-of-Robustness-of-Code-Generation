import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the printFace method
        FacePrinter.printFace();

        // Reset System.out to its original state (important!)
        System.setOut(System.out);

        // Get the captured output as a string
        String actualOutput = outputStream.toString();

        // Define the expected output
        String expectedOutput = "  +\"\"\"\"+ \r\n" + // \r\n for Windows line endings
                            " [| o o |] \r\n" +
                            "  |  ^  | \r\n" +
                            "  | '-' | \r\n" +
                            "  +-----+ \r\n";  // Adjust line endings if needed


        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);


    }
}

