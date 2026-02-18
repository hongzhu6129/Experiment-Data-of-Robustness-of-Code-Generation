   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;
   import java.io.ByteArrayOutputStream;
   import java.io.PrintStream;

   public class HelloWorldTest {

       @Test
       public void testOutput() {
           // Capture the output
           ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
           System.setOut(new PrintStream(outputStream));

           // Run the main method
           HelloWorld.main(new String[]{});

           // Get the output as a string
           String output = outputStream.toString();

           // Assert the expected output (replace "Your Name Here" with your actual name)
           assertEquals("hello\nYour Name Here\n", output); 

           // Restore the original System.out
           System.setOut(System.out); 
       }
   }
   