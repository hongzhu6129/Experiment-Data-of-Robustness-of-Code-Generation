   import org.junit.jupiter.api.Test;
   import java.io.ByteArrayInputStream;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;
   import static org.junit.jupiter.api.Assertions.*;

   public class ScalarTableTest {

       @Test
       public void testPositiveNumber() {
           testScalarTable(7, "7 x 1 = 7\n7 x 2 = 14\n...\n7 x 10 = 70\n"); // Replace ... with the full output
       }

       // Add tests for other cases (zero, negative, large numbers) similarly

       private void testScalarTable(int input, String expectedOutput) {
           String inputString = String.valueOf(input) + "\n";
           System.setIn(new ByteArrayInputStream(inputString.getBytes()));

           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outputStream));

           ScalarTable.main(new String[]{}); // Run your main method

           String actualOutput = outputStream.toString();
           assertTrue(actualOutput.contains("Scalar Table for " + input + ":")); // Basic check
           // You can add more specific assertions here to check the table's values
       }
   }
   