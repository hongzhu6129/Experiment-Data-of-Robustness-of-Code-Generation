import java.util.HashMap;
import java.util.Map;

public class CheckMapKey {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 75);


        // 1. Using containsKey() method (most common and efficient)
        String keyToCheck = "Bob";
        if (studentScores.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " exists in the map. Score: " + studentScores.get(keyToCheck));
        } else {
            System.out.println(keyToCheck + " does not exist in the map.");
        }

        keyToCheck = "David"; // Key not present
        if (studentScores.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " exists in the map. Score: " + studentScores.get(keyToCheck));
        } else {
            System.out.println(keyToCheck + " does not exist in the map.");
        }



        // 2. Using get() method (less efficient, but useful if you also need the value)
        keyToCheck = "Alice";
        Integer score = studentScores.get(keyToCheck); 
        if (score != null) {  // If the key is not found, get() returns null
            System.out.println(keyToCheck + " exists in the map. Score: " + score);
        } else {
            System.out.println(keyToCheck + " does not exist in the map.");
        }


        // Demonstrating potential issue with get() for values that might be null:
        studentScores.put("Eve", null); // Eve's score is explicitly set to null

        keyToCheck = "Eve";
        score = studentScores.get(keyToCheck);
        if (score != null) { // This will incorrectly say Eve is NOT in the map!
            System.out.println(keyToCheck + " exists in the map. Score: " + score);
        } else {
            System.out.println(keyToCheck + " does not exist in the map (but might have a null value).  Use containsKey() for accurate check.");
        }


        // Therefore, always prefer containsKey() when you only need to check for the presence of the key.




    }
}
