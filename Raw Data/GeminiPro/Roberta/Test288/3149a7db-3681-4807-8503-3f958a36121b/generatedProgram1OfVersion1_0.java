import java.util.*;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Create a string to analyze
        String str = "The quick brown fox jumps over the lazy dog";

        // Create a map to store the character frequencies
        Map<Character, Integer> frequencies = new HashMap<>();

        // Iterate over the string and update the character frequencies
        for (char c : str.toCharArray()) {
            if (frequencies.containsKey(c)) {
                frequencies.put(c, frequencies.get(c) + 1);
            } else {
                frequencies.put(c, 1);
            }
        }

        // Sort the map by character frequency in descending order
        List<Map.Entry<Character, Integer>> sortedFrequencies = new ArrayList<>(frequencies.entrySet());
        sortedFrequencies.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Print the sorted character frequencies
        for (Map.Entry<Character, Integer> entry : sortedFrequencies) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
