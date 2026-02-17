import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str1 = "abcade";
        String str2 = "abc";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "de"

        str1 = "programming";
        str2 = "practice";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "grm"

        str1 = "hello";
        str2 = "world";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "ehlo"

        str1 = "apple";
        str2 = "";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "apple"

        str1 = "";
        str2 = "banana";
        System.out.println(removeDuplicateCharacters(str1, str2)); // ""

        str1 = "abb";
        str2 = "cccc";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "abb"

        str1 = "a";
        str2 = "b";
        System.out.println(removeDuplicateCharacters(str1, str2)); // "a"
    }

    public static String removeDuplicateCharacters(String str1, String str2) {
        Set<Character> duplicateCharacters = new LinkedHashSet<>();

        for (char c : str2.toCharArray()) {
            duplicateCharacters.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (!duplicateCharacters.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
