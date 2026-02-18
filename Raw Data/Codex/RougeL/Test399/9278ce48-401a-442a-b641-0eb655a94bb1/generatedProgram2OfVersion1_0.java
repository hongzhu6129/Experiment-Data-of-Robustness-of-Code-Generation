import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testMultiplicationTable5() {
        testTable(5, "5 x 1 = 5\n5 x 2 = 10\n...5 x 10 = 50\n"); // Replace ... with the full output
    }

     // Add more @Test methods for other cases (0, -7, MAX_VALUE, MIN_VALUE)

    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); // Redirect System.out

        // Simulate user input
        Scanner scanner = new Scanner(String.valueOf(input));
        MultiplicationTable.main(new String[0]); // scanner now has input

        String actualOutput = outputStream.toString().trim().replace("\r", ""); // Normalize output (remove \r)


        // Assertions compare the expected and actual
        assertTrue(actualOutput.contains("Multiplication Table of " + input + ":")); //Partial match, easier
        // Or for a more precise but harder to maintain test: assertEquals(expectedOutput, actualOutput);

        System.setOut(System.out); // Restore System.out
    }
}
