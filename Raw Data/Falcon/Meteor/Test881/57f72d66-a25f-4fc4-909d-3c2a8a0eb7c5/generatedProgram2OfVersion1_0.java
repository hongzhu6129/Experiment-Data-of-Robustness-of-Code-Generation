import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultiplicationTableTest {

    @Test
    void testPositiveNumber() {
        testMultiplicationTable(7, "Multiplication table of 7:\n7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70\n7 x 11 = 77\n");
    }

    // Add tests for other cases (negative, zero, large numbers) similarly

    private void testMultiplicationTable(int input, String expectedOutput) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        MultiplicationTable.printMultiplicationTable(input); 

        assertEquals(expectedOutput, outputStream.toString());

        // Restore System.out
        System.setOut(System.out); 
    }
}
