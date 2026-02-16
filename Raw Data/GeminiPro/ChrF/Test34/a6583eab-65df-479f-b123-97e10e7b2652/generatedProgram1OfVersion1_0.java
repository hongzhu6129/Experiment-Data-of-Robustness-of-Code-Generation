import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listAvailableCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());
            // Optionally print aliases:
            // System.out.println("  Aliases: " + charset.aliases());
        }
    }

    public static void main(String[] args) {
        listAvailableCharsets();


        // Test cases (demonstration -  these don't have specific assertions. You'd use a testing framework like JUnit for that)
        testGetCharset("UTF-8");        // Common case
        testGetCharset("ISO-8859-1");  // Another common case
        testGetCharset("UTF-32");      // Less common
        testGetCharset("invalid-charset"); // Corner case: Invalid charset name
        testGetCharset("");             // Corner case: Empty charset name
        testGetCharset(null);            // Corner case: Null charset name

    }

    // Helper function for test cases
    public static void testGetCharset(String charsetName) {
        try {
            Charset charset = Charset.forName(charsetName);
            System.out.println("Charset for '" + charsetName + "': " + charset.displayName());
        } catch (IllegalArgumentException e) {
            System.out.println("Error getting charset for '" + charsetName + "': " + e.getMessage());
        }

    }

}
