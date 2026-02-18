   import java.io.*;

   public class TestPrintFace {
       public static void main(String[] args) throws IOException {
           // Redirect standard output to a file
           PrintStream originalOut = System.out;
           ByteArrayOutputStream baos = new ByteArrayOutputStream();
           PrintStream ps = new PrintStream(baos);
           System.setOut(ps);

           PrintFace.printFace(); // Call the method under test

           // Restore original standard output
           System.setOut(originalOut);

           // Get the output as a string
           String actualOutput = baos.toString();

           // Expected output (store this in a file or define it here)
           String expectedOutput = "  +\"\"\"\"+"+ System.lineSeparator()+
                   " [| o o |]"+ System.lineSeparator()+
                   "  |  ^  |"+ System.lineSeparator()+
                   "  | '-' |"+ System.lineSeparator()+
                   "  +-----+"+System.lineSeparator();

           // Compare actual and expected output
           if (actualOutput.equals(expectedOutput)) {
               System.out.println("Test Passed!");
           } else {
               System.err.println("Test Failed!");
               System.err.println("Expected:");
               System.err.println(expectedOutput);
               System.err.println("Actual:");
               System.err.println(actualOutput);
           }
       }
   }

   