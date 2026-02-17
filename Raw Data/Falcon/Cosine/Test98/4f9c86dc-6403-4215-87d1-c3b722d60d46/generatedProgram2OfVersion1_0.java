import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class PrintFaceTest {

    @Test
    public void testPrintFace() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method to print the face
        PrintFace.printFace();

        // Get the printed output as a string
        String actualOutput = outputStream.toString();

        // Define the expected output
        String expectedOutput = "  +\"\"\"\"\"+\n [| o o |] \n  |  ^  | \n  | '-' |\n  +-----+\n";  // Note the \n at the end!

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput);

        // Restore System.out
        System.setOut(System.out); // Important to reset!
    }
}
