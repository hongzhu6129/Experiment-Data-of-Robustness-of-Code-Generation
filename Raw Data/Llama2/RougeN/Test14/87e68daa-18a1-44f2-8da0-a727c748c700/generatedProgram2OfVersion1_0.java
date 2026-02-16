   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;

   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class PrintFaceTest {

       @Test
       public void testPrintFace() {
           ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outContent)); 

           PrintFace.printFace();

           String expectedOutput = "  +\"\"\"\"\"+"+ System.lineSeparator() +
                                  " [| o o |]"+ System.lineSeparator() +
                                  "  |  ^  |"+ System.lineSeparator() +
                                  "  | '-' |"+ System.lineSeparator() +
                                  "  +-----+"+ System.lineSeparator();
           assertEquals(expectedOutput, outContent.toString());

           // Restore System.out (important!)
           System.setOut(System.out); 
       }
   }
   