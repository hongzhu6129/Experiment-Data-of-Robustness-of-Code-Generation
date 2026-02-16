import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScalarTableTest {

    @Test
    void testPositiveNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ScalarTable.printScalarTable(5); 

        String expectedOutput = "Scalar Table for 5:\n5 x 1 = 5\n5 x 2 = 10\n... (rest of the table)\n"; // Fill in the full expected output
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore standard output
    }


    // Add more @Test methods for other test cases (negative, zero, large numbers)
}
