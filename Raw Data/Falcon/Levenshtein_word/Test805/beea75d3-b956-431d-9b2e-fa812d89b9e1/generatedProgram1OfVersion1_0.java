import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListCharsets {

    public static void listCharacterSets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());
            // Optionally, you can print aliases:
            // System.out.println("   Aliases: " + charset.aliases());
        }
    }

    public static void main(String[] args) {
        listCharacterSets();
    }
}


// Test Cases:

// Test case 1:  Verify common charsets exist
// Expected Result:  UTF-8, UTF-16, US-ASCII, ISO-8859-1 should be present.

// Test case 2: Verify case insensitivity (if applicable).
// Some systems might treat charset names case-insensitively (though the standard doesn't require it).
// Expected Result:  Looking up "utf-8" and "UTF-8" should return the same Charset object.  This test may or may not pass depending on the JVM/OS.  It highlights a potential portability issue if your code relies on case-insensitive lookups.

// Test case 3: Empty available charsets (Corner case - extremely unlikely in practice)
// Artificially create a situation where availableCharsets() returns an empty map (e.g., by mocking or if there's a truly unusual system configuration).
// Expected Result: The code should handle the empty map gracefully, perhaps by printing a message like "No charsets available."  This prevents unexpected NullPointerExceptions.


//  Example of how to implement Test Case 3 (Empty Charsets) using a simple mock for demonstration:

// import java.nio.charset.Charset;
// import java.util.Collections;
// import java.util.SortedMap;


// public class ListCharsetsMockTest { // Separate class for the mock test


//     public static void listCharacterSets(SortedMap<String, Charset> mockCharsets) {  // Modified to accept a mock map
//         System.out.println("Available Character Sets:");

//         if (mockCharsets.isEmpty()) {
//             System.out.println("No charsets available.");  // Handle empty case
//             return;
//         }


//         for (String charsetName : mockCharsets.keySet()) {
//             Charset charset = mockCharsets.get(charsetName);
//             System.out.println(charsetName + ": " + charset.displayName());
//         }
//     }

//     public static void main(String[] args) {
//         // Create an empty mock map
//         SortedMap<String, Charset> emptyCharsets = Collections.emptySortedMap();


//         // Test with the empty map:
//         listCharacterSets(emptyCharsets);  // This should print "No charsets available"


//         // Test with the real charsets (as before)
//         listCharacterSets(Charset.availableCharsets());
//     }
// }

