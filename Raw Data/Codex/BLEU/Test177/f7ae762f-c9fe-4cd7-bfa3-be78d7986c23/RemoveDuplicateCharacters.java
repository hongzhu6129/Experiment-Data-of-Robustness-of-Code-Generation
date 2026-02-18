import java.util.*;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeDuplicateCharacters(str)); // "Helo Wrd"

        str = "aaabbbccc";
        System.out.println(removeDuplicateCharacters(str)); // "abc"

        str = "1234567890";
        System.out.println(removeDuplicateCharacters(str)); // "1234567890"

        str = "";
        System.out.println(removeDuplicateCharacters(str)); // ""

        str = null;
        System.out.println(removeDuplicateCharacters(str)); // null
    }

    public static String removeDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
