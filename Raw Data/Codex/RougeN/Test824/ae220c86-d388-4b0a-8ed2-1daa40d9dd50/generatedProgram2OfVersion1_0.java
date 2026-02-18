import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class FacePrinterTest {

    @Test
    public void testPrintFace() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FacePrinter.printFace();

        String expectedOutput = "  xxxxxxx\n" +
                                " x       x\n" +
                                "x  o   o x\n" +
                                "x   <   x\n" +
                                " x  --- x\n" +
                                "  xxxxxxx\n";
        assertEquals(expectedOutput, outputStream.toString());

        // Restore System.out (important for other tests)
        System.setOut(System.out); 
    }
}
