import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);

        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "aabbccddeeffgg"; // Example with no unique characters (violates assumption, handle as needed)
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "loveleetcode";  // Example with multiple unique characters
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);



    }

    public static int first_Uniq_Char(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count character frequencies
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) {
                return i;
            }
        }


        // This should not happen if the assumption holds (at least one unique char)
        //  but we return -1 to indicate no unique character found.
        return -1; 
    }
}
