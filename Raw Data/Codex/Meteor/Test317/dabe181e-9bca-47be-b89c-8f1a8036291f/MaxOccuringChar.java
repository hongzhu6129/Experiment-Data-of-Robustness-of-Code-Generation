import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

    static char MaxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character for empty or null string
        }

        Map<Character, Integer> charCounts = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str1 = "programming";
        char maxChar1 = MaxOccuringChar(str1);
        System.out.println("Most frequent character in '" + str1 + "': " + maxChar1); // Output: r

        String str2 = "abcabcabc";
        char maxChar2 = MaxOccuringChar(str2);
        System.out.println("Most frequent character in '" + str2 + "': " + maxChar2); // Output: a (or b or c)


        String str3 = "";
        char maxChar3 = MaxOccuringChar(str3);
        System.out.println("Most frequent character in '" + str3 + "': " + maxChar3); // Output: (null char)


        String str4 = null; 
        char maxChar4 = MaxOccuringChar(str4);
        System.out.println("Most frequent character in '" + str4 + "': " + maxChar4); // Output: (null char)

                String str5 = "aabbccc";
        char maxChar5 = MaxOccuringChar(str5);
        System.out.println("Most frequent character in '" + str5 + "': " + maxChar5); // Output: c

    }
}
