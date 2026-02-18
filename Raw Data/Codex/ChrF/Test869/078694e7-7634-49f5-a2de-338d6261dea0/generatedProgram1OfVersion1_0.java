import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

    static char MaxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character for empty or null string
        }

        Map<Character, Integer> charCounts = new HashMap<>();
        char maxChar = str.charAt(0);
        int maxCount = 1;

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            if (charCounts.get(c) > maxCount) {
                maxCount = charCounts.get(c);
                maxChar = c;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str1 = "abracadabra";
        char maxChar1 = MaxOccuringChar(str1);
        System.out.println("Most frequent character in '" + str1 + "': " + maxChar1); // Output: a

        String str2 = "programming";
        char maxChar2 = MaxOccuringChar(str2);
        System.out.println("Most frequent character in '" + str2 + "': " + maxChar2); // Output: r

        String str3 = ""; 
        char maxChar3 = MaxOccuringChar(str3);
        System.out.println("Most frequent character in '" + str3 + "': " + maxChar3); // Output: 

         String str4 = null;
        char maxChar4 = MaxOccuringChar(str4);
        System.out.println("Most frequent character in '" + str4 + "': " + maxChar4); // Output: 
    }
}
