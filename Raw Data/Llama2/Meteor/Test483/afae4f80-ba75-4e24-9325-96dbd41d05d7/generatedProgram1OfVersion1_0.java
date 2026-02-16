import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static void main(String[] args) {
        String str = "Hello world";
        char mostFrequentCharacter = findMostFrequentCharacter(str);
        System.out.println("The most frequent character in '" + str + "' is '" + mostFrequentCharacter + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        for (char character : str.toCharArray()) {
            int count = characterCounts.getOrDefault(character, 0) + 1;
            characterCounts.put(character, count);
        }

        char mostFrequentCharacter = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentCharacter = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentCharacter;
    }
}
