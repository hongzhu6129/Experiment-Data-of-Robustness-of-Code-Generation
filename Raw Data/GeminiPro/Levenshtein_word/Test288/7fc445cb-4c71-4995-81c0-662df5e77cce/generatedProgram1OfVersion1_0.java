import java.util.HashMap;
import java.util.Map;

public class FrequentCharacters {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Find the character with the highest count
        Character mostFrequentChar = null;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Print the most frequent character and its count
        System.out.println("Most frequent character: " + mostFrequentChar);
        System.out.println("Count: " + maxCount);
    }
}
