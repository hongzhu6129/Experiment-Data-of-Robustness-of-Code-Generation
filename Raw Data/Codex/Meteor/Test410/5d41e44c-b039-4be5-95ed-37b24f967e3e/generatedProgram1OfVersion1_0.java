import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {
        String str = "aabbbccde";
        System.out.println(findSecondMostFrequentCharacter(str)); // b
    }

    public static char findSecondMostFrequentCharacter(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Input string cannot be null or empty.");
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int firstMax = 0;
        char firstMaxChar = ' ';

        int secondMax = 0;
        char secondMaxChar = ' ';

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > firstMax) {
                secondMax = firstMax;
                secondMaxChar = firstMaxChar;
                firstMax = entry.getValue();
                firstMaxChar = entry.getKey();
            } else if (entry.getValue() > secondMax && entry.getValue() != firstMax) {
                secondMax = entry.getValue();
                secondMaxChar = entry.getKey();
            }
        }

        return secondMaxChar;
    }
}
