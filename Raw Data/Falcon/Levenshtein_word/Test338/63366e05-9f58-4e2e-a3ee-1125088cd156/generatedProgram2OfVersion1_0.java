import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testMultiplicationTable5() {
        testTable(5, "Multiplication Table for 5:\n5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n");
    }

    // ... (Add other test cases similar to the above) ...


    private void testTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input);

        assertEquals(expectedOutput, outputStream.toString());

        // Restore System.out
        System.setOut(System.out); 
    }
}
