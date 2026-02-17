   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayInputStream;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;
   import java.util.Scanner;

   public class PrintFacingTest {

       @Test
       public void testValidInputs() {
           testFacing("N", "North");
           testFacing("s", "South"); // Testing case-insensitivity
           testFacing("eAsT", "East"); // Testing case-insensitivity
       }

       @Test
       public void testInvalidInputs() {
           testFacing("A", "Invalid Input");
           testFacing("North", "Invalid Input");
           testFacing(" ", "Invalid Input");  // Empty String
           testFacing("123", "Invalid Input");
       }


       private void testFacing(String input, String expectedOutput) {
           ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
           System.setIn(in); // Redirect System.in

           ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outContent)); // Redirect System.out

           PrintFacing.main(new String[]{}); // Run main method

           String actualOutput = outContent.toString().trim(); // Remove extra whitespace
           assertTrue(actualOutput.contains(expectedOutput)); // Use contains because the output has "Enter..." text
       }
   }
   