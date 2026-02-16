import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NasdaqCharacterAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a map to store the characters and their opening and closing positions.
        Map<Character, int[]> characterPositions = new HashMap<>();

        // Iterate over the input string and update the map with the opening and closing positions of each character.
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if (characterPositions.containsKey(character)) {
                characterPositions.get(character)[1] = i;
            } else {
                characterPositions.put(character, new int[]{i, i});
            }
        }

        // Print the opening and closing positions of each character.
        for (Map.Entry<Character, int[]> entry : characterPositions.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Opening Position: " + entry.getValue()[0] + ", Closing Position: " + entry.getValue()[1]);
        }
    }
}
