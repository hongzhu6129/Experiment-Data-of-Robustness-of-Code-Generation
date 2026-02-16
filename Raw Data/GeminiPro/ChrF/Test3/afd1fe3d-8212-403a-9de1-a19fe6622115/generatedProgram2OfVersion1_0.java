import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveInteger() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MultiplicationTable.printMultiplicationTable(7); 

        String expectedOutput =  // ... (the expected output as a string)
        assertEquals(expectedOutput, outContent.toString());

        System.setOut(System.out); // Restore standard output
    }

    // ... similar tests for other cases
}
