import java.util.*;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String input = "aabbbccdd";
        System.out.println(removeAdjacentDuplicates(input)); // Output: abd
    }

    public static String removeAdjacentDuplicates(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        if (input.length() == 1) {
            return input;
        }

        if (input.charAt(0) == input.charAt(1)) {
            return removeAdjacentDuplicates(input.substring(1));
        } else {
            return input.charAt(0) + removeAdjacentDuplicates(input.substring(1));
        }
    }
}
