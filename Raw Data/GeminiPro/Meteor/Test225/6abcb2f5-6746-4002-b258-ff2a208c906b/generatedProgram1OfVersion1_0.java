import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static boolean hasUniqueCharacters(String str) {
        // Create a set to store the characters in the string
        Set<Character> characters = new HashSet<>();

        // Iterate over the string
        for (char c : str.toCharArray()) {
            // If the character is already in the set, return false
            if (characters.contains(c)) {
                return false;
            }
            // Otherwise, add the character to the set
            characters.add(c);
        }

        // If all characters are unique, return true
        return true;
    }

    public static void main(String[] args) {
        String str1 = "abcdefg";
        System.out.println(hasUniqueCharacters(str1)); // true

        String str2 = "hello";
        System.out.println(hasUniqueCharacters(str2)); // false

        String str3 = "";
        System.out.println(hasUniqueCharacters(str3)); // true
    }
}
