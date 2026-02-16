import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());

             // Optionally, you can also print aliases:
            // System.out.println("   Aliases: " + charset.aliases());
        }
    }

    public static void main(String[] args) {
        listCharsets();
    }
}


// Test Cases (using JUnit would be better for a real project,
// but this demonstrates the basic ideas):

class ListAvailableCharsetsTest {
    public static void main(String[] args) {
        testStandardCharset();
        testEmptyInput(); // Corner case:  Nothing really to test here, but ensures no unexpected behavior
        testPlatformSpecificCharset(); //  Harder to create a generalized test, see comments.

    }



    private static void testStandardCharset() {
        // Check if at least one widely supported character set exists
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        // Check if a few standard charsets are present (UTF-8, UTF-16, etc.)
        assert charsets.containsKey("UTF-8") : "UTF-8 charset not found";
        assert charsets.containsKey("UTF-16") : "UTF-16 charset not found";
        assert charsets.containsKey("US-ASCII") : "US-ASCII charset not found";
        System.out.println("Standard charset test passed.");
    }


    private static void testEmptyInput() { // Corner case
        // There's not an actual "input" here, but this ensures there's
        // no unexpected exception or behavior when listing charsets.

        ListAvailableCharsets.listCharsets(); // Just call the function, confirm no errors
        System.out.println("Empty input test passed (no errors).");

    }


    private static void testPlatformSpecificCharset() {
        // Harder to do a general test because this can vary by OS and Java version.

        // 1.  Manually inspect the output on your system from ListAvailableCharsets.main()
        // 2. Add asserts for specific charsets you expect on your platform (e.g., windows-1252).
        // Example (replace with your expected charset):

         SortedMap<String, Charset> charsets = Charset.availableCharsets();
        //  assert charsets.containsKey("windows-1252") : "windows-1252 charset not found"; // Example


        System.out.println("Platform-specific charset test requires manual verification (or platform-specific assertions).");
    }


}





