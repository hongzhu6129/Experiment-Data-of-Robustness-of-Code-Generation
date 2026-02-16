import java.util.HashMap;
import java.util.Map;

public class MaxOccuringChar {

    static char MaxOccuringChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character for empty or null input
        }

        Map<Character, Integer> charCounts = new HashMap<>();
        char maxChar = str.charAt(0);
        int maxCount = 1;


        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
           if(charCounts.get(c) > maxCount){
                maxCount = charCounts.get(c);
                maxChar = c;
           }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String str1 = "abcabcaabbccccc";
        char maxChar1 = MaxOccuringChar(str1);
        System.out.println("Max occurring char in '" + str1 + "': " + maxChar1);  // Output: c


        String str2 = "apple";
        char maxChar2 = MaxOccuringChar(str2);
        System.out.println("Max occurring char in '" + str2 + "': " + maxChar2); // Output: p

        String str3 = ""; // Empty string
        char maxChar3 = MaxOccuringChar(str3);
        System.out.println("Max occurring char in '" + str3 + "': " + maxChar3); // Output: Null character


        String str4 = null; // Null string
        char maxChar4 = MaxOccuringChar(str4);
        System.out.println("Max occurring char in '" + str4 + "': " + maxChar4); // Output: Null character



        String str5 = "aabbccddeeeffgghhii"; // Multiple characters with the same max frequency
        char maxChar5 = MaxOccuringChar(str5);  // Will return 'a' (or any of the chars with freq 2)
        System.out.println("Max occurring char in '" + str5 + "': " + maxChar5);

    }
}
