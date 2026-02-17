import java.util.HashMap;

public class WellRepetitionChecker {

    public static boolean checkWellRepetition(int[] sequence) {
        // Initialize the hash table
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Track the frequency of each element
        for (int element : sequence) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Check for well-repetition
        for (Integer count : frequencyMap.values()) {
            if (count < 2) {
                return false;
            }
        }

        return true;
    }
}
