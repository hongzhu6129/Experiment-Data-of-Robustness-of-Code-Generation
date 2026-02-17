import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "gram";

        String result = removeDuplicates(str1, str2);
        System.out.println("Original string: " + str1);
        System.out.println("String to check duplicates from: " + str2);
        System.out.println("Result string: " + result);


        str1 = "hello world";
        str2 = "world";
        result = removeDuplicates(str1, str2);
        System.out.println("\nOriginal string: " + str1);
        System.out.println("String to check duplicates from: " + str2);
        System.out.println("Result string: " + result);

        str1 = "Innovative";
        str2 = "ative";
        result = removeDuplicates(str1, str2);
        System.out.println("\nOriginal string: " + str1);
        System.out.println("String to check duplicates from: " + str2);
        System.out.println("Result string: " + result);
    }

    public static String removeDuplicates(String str1, String str2) {
        Set<Character> charsToRemove = new HashSet<>();
        for (char c : str2.toCharArray()) {
            charsToRemove.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
