import java.util.HashSet;
import java.util.Set;

public class UniqueStringChecker {

    public static boolean is_Unique_str(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Empty or null strings are considered to have unique characters
        }

        Set<Character> seenCharacters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (seenCharacters.contains(c)) {
                return false; // Character already seen, not unique
            }
            seenCharacters.add(c);
        }

        return true; // All characters are unique
    }

    public static void main(String[] args) {
        String str1 = "xyyz";
        String str2 = "abcde";
        String str3 = ""; // Empty string
        String str4 = null; // Null string

        System.out.println("Original String : " + str1 + " String has all unique characters: " + is_Unique_str(str1));
        System.out.println("Original String : " + str2 + " String has all unique characters: " + is_Unique_str(str2));
        System.out.println("Original String : " + str3 + " String has all unique characters: " + is_Unique_str(str3));
        System.out.println("Original String : " + str4 + " String has all unique characters: " + is_Unique_str(str4));


    }
}
