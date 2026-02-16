import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void testInput5() {
        String input = "5";
        String expectedOutput = "Multiplication Table for 5:\n5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50\n";
        testWithInput(input, expectedOutput);
    }


    //Add more @Test methods for other test cases

    private void testWithInput(String input, String expectedOutput) {
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        MultiplicationTable.main(new String[0]);  // Run your main method

        assertEquals(expectedOutput, out.toString());

        // Reset System.in and System.out to defaults
        System.setIn(System.in);
        System.setOut(System.out);
    }
}

