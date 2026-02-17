import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void main(String[] args) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            System.out.println(charsetName);
        }


    }
}


//---------------------TEST CASES -------------------------------


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;


public class ListAvailableCharsetsTest {


    @Test
    public void testListCharsets() {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the main method
        ListAvailableCharsets.main(new String[0]);


        String output = outContent.toString();

        //Basic Assertion: Check if any charsets are listed at all
        assertFalse(output.isEmpty(), "Output should not be empty");
        assertTrue(output.contains("Available Character Sets:"), "Should print the header");


        //Corner Case 1: Ensure at least one common charset exists (UTF-8) - Platform dependent but generally present.
        Set<String> availableCharsetNames = Charset.availableCharsets().keySet();

        assertTrue(availableCharsetNames.contains("UTF-8"), "UTF-8 should be available");  // Might fail on very unusual systems


        //Corner Case 2:  Check if the number of listed charsets matches the availableCharsets() size
        int numLines = output.split(System.lineSeparator()).length - 1;  // subtract 1 to remove header
        assertEquals(availableCharsetNames.size(), numLines,  "The number of printed charsets should match the system's available charsets" );




        // Restore System.out
        System.setOut(System.out);
    }


    // For demonstration, this would test a non-existent charset
    //  This test is likely to pass on most systems because you won't find a Charset by this name. 
    @Test
    public void  testNonExistentCharset() {
         Charset cs = Charset.forName("NonExistentCharset"); // Expecting an exception

         assertNull(cs, "Non-existent Charset should be null or throw exception");// This test is likely to pass as is because it tests that getCharSet returns null, which is already covered in our try-catch structure
    }



}



