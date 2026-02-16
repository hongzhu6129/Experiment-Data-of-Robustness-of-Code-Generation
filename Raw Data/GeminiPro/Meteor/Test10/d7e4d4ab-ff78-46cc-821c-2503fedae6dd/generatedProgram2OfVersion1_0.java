import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class PrintFaceTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintFace.printFace();

        String expectedOutput =  "  +\"\"\"\"+"+ System.lineSeparator() +
                                " [| o o |]"+ System.lineSeparator() +
                                "  |  ^  |"+ System.lineSeparator() +
                                "  | '-' |"+ System.lineSeparator() +
                                "  +-----+"+ System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore System.out
    }
}
