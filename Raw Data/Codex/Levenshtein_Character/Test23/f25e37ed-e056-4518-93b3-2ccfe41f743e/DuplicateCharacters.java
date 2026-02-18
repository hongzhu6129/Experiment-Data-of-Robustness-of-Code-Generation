import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over the string and store the character count in the map
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Iterate over the map and print the characters with count greater than 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate character: " + entry.getKey() + " Count: " + entry.getValue());
            }
        }
    }
}
