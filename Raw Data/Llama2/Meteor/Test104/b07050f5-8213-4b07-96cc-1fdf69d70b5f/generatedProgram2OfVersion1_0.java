import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    public void testPositiveInput() {
        String input = "7\n";
        String expectedOutput = "Multiplication Table of 7:\n7 x 1 = 7\n7 x 2 = 14\n...(rest of the table)...\n";
        testMultiplicationTable(input, expectedOutput);  // Helper method (see below)
    }
     // ... Add more @Test methods for other test cases

     private void testMultiplicationTable(String input, String expectedOutput) {
         ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         System.setIn(in);
         System.setOut(new PrintStream(out));

         MultiplicationTable.main(new String[0]); // Call the main method

         String actualOutput = out.toString();
         assertTrue(actualOutput.contains(expectedOutput)); // Or more precise assertions
     }

}


