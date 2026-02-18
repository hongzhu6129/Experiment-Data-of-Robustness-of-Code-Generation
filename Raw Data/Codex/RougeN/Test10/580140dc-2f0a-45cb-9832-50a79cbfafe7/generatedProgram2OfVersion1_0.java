import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class TwinkleTwinkleTest {

    @Test
    void testPrintFormattedTwinkle() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TwinkleTwinkle.printFormattedTwinkle();

        String expectedOutput = "Twinkle, twinkle, little star,\r\n" + // \r\n for Windows, \n for others
                                "\tHow I wonder what you are!\r\n" +
                                "\t\tUp above the world so high,\r\n" + 
                                "\t\tLike a diamond in the sky.\r\n"; // Adjust \r\n as needed for your OS

        // For platform independence (handles both \r\n and \n):
        String actualOutput = outContent.toString().replaceAll("\\r\\n?", "\n"); 
        assertEquals(expectedOutput, actualOutput);

        System.setOut(System.out); // Restore standard output
    }
}
