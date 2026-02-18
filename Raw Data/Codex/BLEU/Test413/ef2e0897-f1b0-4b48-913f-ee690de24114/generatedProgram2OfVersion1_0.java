   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;

   public class DivisibleBy3And5Test {

       @Test
       void testStandardRange() {
           // Capture System.out
           ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outContent));

           DivisibleBy3And5.main(new String[]{}); // Run main

           String expectedOutput = // ... (Expected output for standard case)
           assertTrue(outContent.toString().contains("Numbers divisible by 3:"));
            // ... similar assertions for divisible by 5 and both
       }
        // ... other test methods for boundary, empty, and negative cases
   }

   