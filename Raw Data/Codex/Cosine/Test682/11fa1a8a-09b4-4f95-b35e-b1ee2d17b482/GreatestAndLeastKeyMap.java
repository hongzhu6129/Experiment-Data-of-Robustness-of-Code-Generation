import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GreatestAndLeastKeyMap {

    public static void main(String[] args) {
        // Example map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(3, "Three");

        if (map.isEmpty()) {
            System.out.println("Map is empty.");
            return;
        }

        // Find the greatest and least keys
        int greatestKey = Collections.max(map.keySet());
        int leastKey = Collections.min(map.keySet());

        // Get the corresponding values
        String greatestKeyValue = map.get(greatestKey);
        String leastKeyValue = map.get(leastKey);


        // Print the results
        System.out.println("Greatest Key: " + greatestKey + ", Value: " + greatestKeyValue);
        System.out.println("Least Key: " + leastKey + ", Value: " + leastKeyValue);


        // Example with different data types for keys (Strings)
        Map<String, Integer> stringKeyMap = new HashMap<>();
        stringKeyMap.put("apple", 1);
        stringKeyMap.put("banana", 2);
        stringKeyMap.put("orange", 3);
        stringKeyMap.put("grape", 4);

         if (stringKeyMap.isEmpty()) {
            System.out.println("String Key Map is empty.");
            return;
        }

        String greatestStringKey = Collections.max(stringKeyMap.keySet());
        String leastStringKey = Collections.min(stringKeyMap.keySet());

        Integer greatestStringKeyValue = stringKeyMap.get(greatestStringKey);
        Integer leastStringKeyValue = stringKeyMap.get(leastStringKey);

        System.out.println("Greatest String Key: " + greatestStringKey + ", Value: " + greatestStringKeyValue);
        System.out.println("Least String Key: " + leastStringKey + ", Value: " + leastStringKeyValue);



    }
}
