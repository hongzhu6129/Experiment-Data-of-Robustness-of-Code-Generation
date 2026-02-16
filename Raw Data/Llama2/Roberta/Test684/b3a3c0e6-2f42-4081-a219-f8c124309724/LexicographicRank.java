import java.util.*;

public class LexicographicRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string.
        String str = scanner.nextLine();

        // Create an array to store the factorial values.
        int[] factorial = new int[26];
        factorial[0] = 1;  // Base case: factorial of 0 is 1.
        for (int i = 1; i < 26; i++) {
            factorial[i] = i * factorial[i - 1];
        }

        // Get the lexicographic rank of the string.
        int rank = getLexicographicRank(str, factorial);

        // Print the lexicographic rank of the string.
        System.out.println(rank);
    }

    private static int getLexicographicRank(String str, int[] factorial) {
        // Create a map to store the character counts.
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Initialize the rank to 1.
        int rank = 1;

        // Iterate over the characters in the string.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Get the number of characters that are smaller than the current character.
            int smallerCount = 0;
            for (char j = 'a'; j < ch; j++) {
                smallerCount += charCountMap.getOrDefault(j, 0);
            }

            // Get the number of characters that are equal to the current character.
            int equalCount = charCountMap.get(ch) - 1;

            // Get the number of permutations of the characters that are smaller than the current character.
            int smallerPermutations = factorial[str.length() - i - 1];

            // Update the rank.
            rank += smallerCount * smallerPermutations * factorial[str.length() - i - 1];
            rank += equalCount * smallerPermutations;

            // Decrement the count of the current character.
            charCountMap.put(ch, charCountMap.get(ch) - 1);
        }

        // Return the rank.
        return rank;
    }
}
