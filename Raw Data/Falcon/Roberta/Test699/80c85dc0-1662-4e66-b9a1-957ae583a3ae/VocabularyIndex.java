import java.util.*;

public class VocabularyIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the vocabulary from the user.
        System.out.println("Enter the vocabulary (comma-separated): ");
        String vocabulary = sc.nextLine();

        // Split the vocabulary into an array of words.
        String[] words = vocabulary.split(",");

        // Create a map to store the indexes of each character.
        Map<Character, List<Integer>> charIndexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toLowerCase().toCharArray()) {
                List<Integer> indexes = charIndexes.getOrDefault(c, new ArrayList<>());
                indexes.add(i);
                charIndexes.put(c, indexes);
            }
        }

        // Create a map to store the indexes of each part of speech.
        Map<String, List<Integer>> posIndexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String pos = getPartOfSpeech(words[i]);
            List<Integer> indexes = posIndexes.getOrDefault(pos, new ArrayList<>());
            indexes.add(i);
            posIndexes.put(pos, indexes);
        }

        // Create a map to store the indexes of each alphabet.
        Map<Character, List<Integer>> alphabetIndexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char firstLetter = words[i].toLowerCase().charAt(0);
            List<Integer> indexes = alphabetIndexes.getOrDefault(firstLetter, new ArrayList<>());
            indexes.add(i);
            alphabetIndexes.put(firstLetter, indexes);
        }

        // Print the indexes of each character.
        System.out.println("\nCharacter Indexes:");
        for (Map.Entry<Character, List<Integer>> entry : charIndexes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the indexes of each part of speech.
        System.out.println("\nPart of Speech Indexes:");
        for (Map.Entry<String, List<Integer>> entry : posIndexes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the indexes of each alphabet.
        System.out.println("\nAlphabet Indexes:");
        for (Map.Entry<Character, List<Integer>> entry : alphabetIndexes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String getPartOfSpeech(String word) {
        // Implement this method to determine the part of speech of the given word.
        // You can use a library or implement your own logic.
        return "Noun";
    }
}
