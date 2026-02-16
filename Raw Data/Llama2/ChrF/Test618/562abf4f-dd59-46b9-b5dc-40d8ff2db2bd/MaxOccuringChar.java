import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

    static char MaxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character if string is empty or null
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str1 = "abracadabra";
        char maxChar1 = MaxOccuringChar(str1);
        System.out.println("Most occurring character in \"" + str1 + "\": " + maxChar1);  // Output: a

        String str2 = "programming";
        char maxChar2 = MaxOccuringChar(str2);
        System.out.println("Most occurring character in \"" + str2 + "\": " + maxChar2); // Output: r

        String str3 = ""; // Empty string
        char maxChar3 = MaxOccuringChar(str3);
        System.out.println("Most occurring character in \"" + str3 + "\": " + maxChar3); // Output: Null character


        String str4 = null; // Null string
        char maxChar4 = MaxOccuringChar(str4);
        System.out.println("Most occurring character in \"" + str4 + "\": " + maxChar4); // Output: Null character


        String str5 = "abcabcab"; // Multiple characters with same max occurence
        char maxChar5 = MaxOccuringChar(str5);
        System.out.println("Most occurring character in \"" + str5 + "\": " + maxChar5); // Output: a (or b or c, it takes the first one encountered that meets the max count)


    }
}
