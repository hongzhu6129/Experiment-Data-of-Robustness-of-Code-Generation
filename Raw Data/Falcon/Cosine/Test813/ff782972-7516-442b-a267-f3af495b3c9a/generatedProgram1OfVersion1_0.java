import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);

        str = "aabbccddeeffg"; // Example with a unique character later in the string
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "loveleetcode"; // Example from LeetCode
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


    }

    public static int first_Uniq_Char(String s) {
        // Use a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // This line should not be reached if we assume there is at least one unique char
        return -1; 
    }
}
