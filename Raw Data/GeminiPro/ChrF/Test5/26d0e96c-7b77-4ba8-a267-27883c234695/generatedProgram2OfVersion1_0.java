   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayInputStream;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;
   import java.util.Scanner;

   public class AverageCalculatorTest {

       @Test
       void testAverageCalculation() {
           // Test Case 1: Standard positive numbers
           String input = "10\n20\n30\n";
           String expectedOutput = "The average is: 20.0\n";
           testWithInput(input, expectedOutput);


        // Test Case 7: Overflow (adjust as needed based on exception handling)
          input = String.valueOf(Double.MAX_VALUE) + "\n" + String.valueOf(Double.MAX_VALUE) + "\n" +String.valueOf(Double.MAX_VALUE) + "\n";
        expectedOutput = "The average is: Infinity\n"; // Or expect an exception message
        testWithInput(input,expectedOutput);



           // Add more test cases here following the same pattern
       }


      private void testWithInput(String input, String expectedOutput) {
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            AverageCalculator.main(new String[0]);  // Run your main method

            assertEquals(expectedOutput, out.toString());
     }



   }
   