import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());
            // Optionally, print aliases:
            // System.out.println("   Aliases: " + charset.aliases()); 
        }
    }


    public static void main(String[] args) {
        listCharsets();
    }
}



// ---- Test Cases (using JUnit) ----
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;


class ListAvailableCharsetsTest {

    @Test
    void testListCharsetsContainsUTF8() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); 

        ListAvailableCharsets.listCharsets();

        String output = outputStream.toString();
        assertTrue(output.contains("UTF-8"));  // Verify UTF-8 is listed

        System.setOut(System.out); // Restore standard output
    }


    @Test
    void testListCharsetsNonEmpty() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        assertFalse(charsets.isEmpty());  // At least one charset should always be available.
    }



    @Test
    void testListCharsetsHandlesAliases() { // Corner case
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream)); 

        ListAvailableCharsets.listCharsets();

        String output = outputStream.toString();

        // Check if an expected charset with aliases is handled (UTF-16 should always have aliases)
        if (Charset.isSupported("UTF-16")) { // Guard against platforms without UTF-16 (unlikely)
          assertTrue(output.contains("UTF-16"));

          // The following check requires aliases to be printed. Uncomment if printing aliases in main code
          //assertTrue(output.contains("UTF-16LE") || output.contains("UTF-16BE")); // Alias example
        }

        System.setOut(System.out);
    }


}
