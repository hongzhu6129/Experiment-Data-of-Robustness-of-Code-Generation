import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        char result = findFirstNonRepeatingCharacter(str);

        if (result != '\u0000') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> characterFrequency = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            int count = characterFrequency.getOrDefault(c, 0);
            characterFrequency.put(c, ++count);
        }

        // Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (characterFrequency.get(c) == 1) {
                return c;
            }
        }

        // No non-repeating character found
        return '\u0000';
    }
}
