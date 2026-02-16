import java.util.*;

public class MissingCharacterInSeries {

    public static void main(String[] args) {
        String network = "needs could uses is";
        char missingChar = findMissingChar(network);
        System.out.println("The missing character in the network word is: " + missingChar);
    }

    public static char findMissingChar(String network) {
        // Convert the network word to a character array
        char[] chars = network.toCharArray();

        // Create a map to store the frequency of each character
        Map<Character, Integer> charMap = new HashMap<>();

        // Iterate over the character array and update the frequency map
        for (char c : chars) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the minimum frequency
        char missingChar = ' ';
        int minFreq = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() < minFreq) {
                minFreq = entry.getValue();
                missingChar = entry.getKey();
            }
        }

        return missingChar;
    }

    public static void testCases() {
        // Test case 1: Basic case
        String network1 = "needs could uses is";
        char missingChar1 = findMissingChar(network1);
        assert missingChar1 == 'a';

        // Test case 2: Case with multiple missing characters
        String network2 = "needs could uses is java";
        char missingChar2 = findMissingChar(network2);
        assert missingChar2 == 'v';

        // Test case 3: Case with all characters occurring the same number of times
        String network3 = "needs could uses uses needs";
        char missingChar3 = findMissingChar(network3);
        assert missingChar3 == 'i';

        // Test case 4: Case with empty string
        String network4 = "";
        char missingChar4 = findMissingChar(network4);
        assert missingChar4 == ' ';

        // Test case 5: Case with null string
        String network5 = null;
        char missingChar5 = findMissingChar(network5);
        assert missingChar5 == ' ';
    }
}
