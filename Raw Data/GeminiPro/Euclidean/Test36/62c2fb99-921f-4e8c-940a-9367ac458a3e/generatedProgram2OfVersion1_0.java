   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class TwinkleTwinkleTest {

       @Test
       public void testPrintTwinkleTwinkle() {
           ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outContent));

           TwinkleTwinkle.printTwinkleTwinkle();

           String expectedOutput = "Twinkle, twinkle, little star,\r\n" + // \r\n for Windows line endings
                                   "\tHow I wonder what you are!\r\n" +
                                   "\t\tUp above the world so high,\r\n" +
                                   "\t\tLike a diamond in the sky.\r\n";


           assertEquals(expectedOutput, outContent.toString());

           System.setOut(System.out); // Restore standard output
       }
   }
   