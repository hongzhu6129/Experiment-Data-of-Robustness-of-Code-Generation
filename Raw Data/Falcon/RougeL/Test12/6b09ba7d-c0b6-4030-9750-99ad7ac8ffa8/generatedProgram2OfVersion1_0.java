   import org.junit.jupiter.api.Test;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;
   import static org.junit.jupiter.api.Assertions.*;

   public class FacePrinterTest {

       @Test
       public void testPrintFace() {
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outputStream)); // Redirect System.out

           FacePrinter.printFace();

           String expectedOutput = "  +\"\"\"\"+ \n" +  // Note: Include newlines!
                                   "[| o o |] \n" +
                                   "  |  ^  | \n" +
                                   "  | '-' | \n" +
                                   "  +-----+ \n";


           assertEquals(expectedOutput, outputStream.toString());

           System.setOut(System.out); // Restore System.out
       }
   }
   