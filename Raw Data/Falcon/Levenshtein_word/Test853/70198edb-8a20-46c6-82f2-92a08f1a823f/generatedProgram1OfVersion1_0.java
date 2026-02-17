import java.util.HashMap;
import java.util.Map;

public class CheckMappingForValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grape", 1);


        // Value to check
        int valueToCheck = 1;

        // Test if the map contains mappings *only* for the specified value.
        boolean containsOnlySpecifiedValue = checkOnlyValue(map, valueToCheck);

        System.out.println("Map contains only the value " + valueToCheck + ": " + containsOnlySpecifiedValue);


        // Another test case where the map *does not* contain only the specified value
        map.put("Mango", 4); // Add a mapping with a different value

         containsOnlySpecifiedValue = checkOnlyValue(map, valueToCheck);
        System.out.println("Map contains only the value " + valueToCheck + ": " + containsOnlySpecifiedValue);

         // Test with an empty map
        map.clear();
        containsOnlySpecifiedValue = checkOnlyValue(map, valueToCheck);
        System.out.println("Empty Map contains only the value " + valueToCheck + ": " + containsOnlySpecifiedValue);



    }

    public static boolean checkOnlyValue(Map<?, Integer> map, int value) {
        if (map.isEmpty()) {
            return false; // Or handle empty maps as needed.  Here, we consider it as not containing the *only* value.
        }

        for (int val : map.values()) {
            if (val != value) {
                return false; // Found a different value, so the map does not contain *only* the specified value.
            }
        }

        return true; // All values match the specified value.
    }
}
