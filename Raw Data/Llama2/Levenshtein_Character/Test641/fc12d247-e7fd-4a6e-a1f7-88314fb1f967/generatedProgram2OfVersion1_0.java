import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScalarTableTest {

    @Test
    void testPositiveInput() {
        testScalarTable(7, "7 x 1 = 7\n7 x 2 = 14\n...\n7 x 10 = 70\n"); // Replace ... with the full output
    }
      // Add more @Test methods for other test cases

    private void testScalarTable(int input, String expectedOutput) {
         ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); // Capture console output
        System.setOut(new PrintStream(outputStream));  // Redirect output to ByteArrayOutputStream

        Scanner scanner = new Scanner(String.valueOf(input)); // Provide input via Scanner
        ScalarTable.main(new String[0]); // Run main method of your program
        scanner.close();

        String actualOutput = outputStream.toString().trim().replace("\r\n", "\n"); // Format output for comparison
        assertEquals(expectedOutput, actualOutput); // JUnit assertion to check output
    }
}


