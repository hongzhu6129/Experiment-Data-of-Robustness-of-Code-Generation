import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + " (aliases: " + charset.aliases() + ")");
        }
    }


    public static void main(String[] args) {
        listCharsets();

        // Test Cases
        testContains("UTF-8");
        testContains("UTF-16");       // Test another common charset
        testContains("ISO-8859-1");   // Test a legacy charset
        testContains("US-ASCII");     // ASCII
        testContains("");              // Empty string (should return false)
        testContains(null);            // Null input (should return false or handle gracefully)  
        testAliases("UTF-8");  //check aliases
        testAvailableCharsetsNotEmpty();

    }


    // Test functions
    public static void testContains(String charsetName) {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        if (charsetName == null) {
            System.out.println("Testing null charsetName: contains() should handle null gracefully.");
            try {
                charsets.containsKey(charsetName); // This might throw NullPointerException
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught as expected.");
            }
           return; 
        }

        boolean contains = charsets.containsKey(charsetName);
        System.out.println("Contains \"" + charsetName + "\": " + contains);

    }

    public static void testAliases(String charsetName){
        Charset charset = Charset.forName(charsetName); // Handle potential exceptions
        Set<String> aliases = charset.aliases();
        System.out.println("Aliases for " + charsetName + ": " + aliases.toString());

    }



     public static void testAvailableCharsetsNotEmpty() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        if (!charsets.isEmpty()) {
            System.out.println("AvailableCharsets is not empty. Test Passed.");
        } else {
            System.err.println("AvailableCharsets is empty. Test Failed."); // Indicate a serious issue
        }

    }



}
