import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(removeDuplicateCharacters(str)); // "HelloWorld"

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

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
