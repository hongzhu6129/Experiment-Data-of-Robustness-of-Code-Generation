import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gram";

        String result = removeDuplicateChars(str1, str2);
        System.out.println("Original string: " + str1);
        System.out.println("String to check duplicates against: " + str2);
        System.out.println("String after removing duplicates: " + result);


        str1 = "abcdefg";
        str2 = "xyz";
        result = removeDuplicateChars(str1, str2);
        System.out.println("\nOriginal string: " + str1);
        System.out.println("String to check duplicates against: " + str2);
        System.out.println("String after removing duplicates: " + result);

    }

    public static String removeDuplicateChars(String str1, String str2) {
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : str2.toCharArray()) {
            charsToRemove.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
