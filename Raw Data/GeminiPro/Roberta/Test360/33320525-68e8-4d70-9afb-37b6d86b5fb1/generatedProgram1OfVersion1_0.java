import java.util.HashMap;
import java.util.Map;

public class MinOccuringChar {

    static char MaxOccuringChar(String str) {
        // Handle empty or null strings
        if (str == null || str.isEmpty()) {
            return '\0'; // Or throw an exception, depending on your requirements
        }

        // Use a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the character with the minimum occurrences
        char minChar = str.charAt(0); // Initialize with the first character
        int minCount = charCounts.get(minChar);

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() < minCount) {
                minChar = entry.getKey();
                minCount = entry.getValue();
            }
        }

        return minChar;
    }

    public static void main(String[] args) {
        String str1 = "abcabcaabb";
        char minChar1 = MaxOccuringChar(str1);
        System.out.println("String: " + str1 + ", Least frequent char: " + minChar1); // Output: c

        String str2 = "apple";
        char minChar2 = MaxOccuringChar(str2);
        System.out.println("String: " + str2 + ", Least frequent char: " + minChar2);  // Output: e (or p, l depending on tie-breaking)

        String str3 = "";
        char minChar3 = MaxOccuringChar(str3);
        System.out.println("String: " + str3 + ", Least frequent char: " + minChar3); // Output: 


        String str4 = "aaaaabbbbcccdddddeeeeeffffffggggghhhhhiiiiijjjjjkkkkklllllmmmmmnnnnnooooopppppqqqqqrrrrrsssssttttt";
        char minChar4 = MaxOccuringChar(str4);
        System.out.println("String: " + str4 + ", Least frequent char: " + minChar4);  // Output: a (or any other as all have equal frequency)


    }
}
