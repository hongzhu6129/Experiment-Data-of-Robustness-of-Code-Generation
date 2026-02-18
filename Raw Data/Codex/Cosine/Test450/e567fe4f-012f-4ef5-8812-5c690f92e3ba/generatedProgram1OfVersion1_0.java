import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RemoveLeastKeyMap {

    public static void main(String[] args) {
        // Using TreeMap to maintain sorted order of keys
        Map<Integer, String> map = new TreeMap<>(); 

        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(1, "One");
        map.put(10, "Ten");


        if (!map.isEmpty()) {
            Integer leastKey = map.keySet().iterator().next(); // Get the least key (first entry in TreeMap)
            String removedValue = map.remove(leastKey);      // Remove and get the value

            System.out.println("Removed Entry: Key = " + leastKey + ", Value = " + removedValue);
            System.out.println("Updated Map: " + map);

        } else {
            System.out.println("Map is empty. Nothing to remove.");
        }


         // Example using HashMap (no guaranteed order) - less efficient way to find least
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "Five");
        hashMap.put(2, "Two");
        hashMap.put(8, "Eight");
        hashMap.put(1, "One");
        hashMap.put(10, "Ten");


        if (!hashMap.isEmpty()) {
            Integer leastKeyHashMap = hashMap.keySet().stream().min(Integer::compare).orElse(null); //Find the least key
           if (leastKeyHashMap != null) {
               String removedValueHashMap = hashMap.remove(leastKeyHashMap);
               System.out.println("\nHashMap - Removed Entry: Key = " + leastKeyHashMap + ", Value = " + removedValueHashMap);
               System.out.println("HashMap - Updated Map: " + hashMap);
           }
        } else {
            System.out.println("\nHashMap is empty. Nothing to remove.");
        }




    }
}
