import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(7, "7 x 1 = 7\n7 x 2 = 14\n...7 x 10 = 70\n"); // ... represents the other lines
    }

    // ... other test methods for zero, negative, large numbers, etc.

    private void testMultiplicationTable(int input, String expectedOutput) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent)); 

        // Simulate user input
        try (Scanner scanner = new Scanner(String.valueOf(input))) {
            MultiplicationTable.main(new String[0]); // Assuming your main method is in MultiplicationTable class.
        }

        String actualOutput = outContent.toString().replaceAll("\\r",""); // Normalize line endings

        // Use assertEquals or other assertions provided by JUnit
         assertTrue(actualOutput.contains(expectedOutput)); // Contains because of console output variances
    }

 }
