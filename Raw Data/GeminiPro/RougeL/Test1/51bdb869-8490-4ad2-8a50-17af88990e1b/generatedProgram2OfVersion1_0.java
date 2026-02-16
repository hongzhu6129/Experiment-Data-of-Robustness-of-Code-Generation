   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayInputStream;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;
   import java.util.Scanner;


   public class ProductOfTwoNumbersTest {

       @Test
       public void testPositiveNumbers() {
           testProduct(5, 10, 50);
       }

       @Test
       public void testNegativePositive() {
           testProduct(-5, 10, -50);
       }
   // ... more tests

       private void testProduct(long num1, long num2, long expected) {
           String input = num1 + "\n" + num2 + "\n";
           System.setIn(new ByteArrayInputStream(input.getBytes()));

           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outputStream));

           ProductOfTwoNumbers.main(new String[0]); // Run main method

           String output = outputStream.toString();
           assertTrue(output.contains("The product of " + num1 + " and " + num2 + " is: " + expected));

           System.setIn(System.in); // Reset System.in
           System.setOut(System.out); // Reset System.out
       }
   }
   