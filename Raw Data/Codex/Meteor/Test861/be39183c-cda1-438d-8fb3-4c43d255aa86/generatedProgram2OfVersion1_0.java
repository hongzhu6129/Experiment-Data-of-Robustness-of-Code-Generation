   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;

   public class FacePrinterTest {
       @Test
       public void testPrintFace() {
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outputStream));

           FacePrinter.printFace();

           String expectedOutput = "  +\"\"\"\"+"+ System.lineSeparator() +
                   " [| o o |]"+ System.lineSeparator() +
                   "  |  ^  |"+ System.lineSeparator() +
                   "  | '-' |"+ System.lineSeparator() +
                   "  +-----+"+ System.lineSeparator();

           assertEquals(expectedOutput, outputStream.toString());
           System.setOut(System.out); // Restore standard output
       }
   }
   