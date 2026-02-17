import java.util.*;

public class FindMostFrequentCharacterInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the most frequent character in the string
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char character : inputString.toCharArray()) {
            int count = characterCountMap.getOrDefault(character, 0);
            characterCountMap.put(character, count + 1);
        }

        // Find the character with the highest count
        char mostFrequentCharacter = ' ';
        int highestCount = 0;
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequentCharacter = entry.getKey();
                highestCount = entry.getValue();
            }
        }

        // Print the most frequent character
        System.out.println("The most frequent character in the string is: " + mostFrequentCharacter);
    }
}
