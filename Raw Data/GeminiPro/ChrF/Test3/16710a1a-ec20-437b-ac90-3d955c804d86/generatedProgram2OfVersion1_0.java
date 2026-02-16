import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveNumber() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(7);

        String expectedOutput = "Multiplication Table for 7:\n" +
                               "7 x 1 = 7\n" +  // ... and so on
                               "7 x 10 = 70\n"; 
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore standard output
    }
    // ... Add tests for other cases (zero, negative, large numbers) ...
}
