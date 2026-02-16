import java.util.*;

public class FindWordsWithSameCharacters {

    public static void main(String[] args) {
        // Create a list of words
        List<String> words = Arrays.asList("apple", "banana", "cherry", "dog", "cat", "fish");

        // Create a map to store the words and their corresponding sets of characters
        Map<Set<Character>, List<String>> wordsWithSameCharacters = new HashMap<>();

        // Iterate over the words and add them to the map
        for (String word : words) {
            Set<Character> characters = new HashSet<>();
            for (char character : word.toCharArray()) {
                characters.add(character);
            }

            List<String> wordsWithSameCharactersList = wordsWithSameCharacters.getOrDefault(characters, new ArrayList<>());
            wordsWithSameCharactersList.add(word);
            wordsWithSameCharacters.put(characters, wordsWithSameCharactersList);
        }

        // Print the map
        for (Set<Character> characters : wordsWithSameCharacters.keySet()) {
            System.out.println(wordsWithSameCharacters.get(characters));
        }
    }
}
