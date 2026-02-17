import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testLongName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // Capture output
        System.setOut(new PrintStream(outContent)); // Redirect System.out

        HelloWorld.main(new String[]{}); // Run the main method

        String expectedOutput = "hello\nAveryverylongnametotesttheprogram'sabilitytohandlelongnames\n";
        assertEquals(expectedOutput, outContent.toString()); // Check the output

        // Restore System.out (important!)
        System.setOut(System.out); 
    }
}
