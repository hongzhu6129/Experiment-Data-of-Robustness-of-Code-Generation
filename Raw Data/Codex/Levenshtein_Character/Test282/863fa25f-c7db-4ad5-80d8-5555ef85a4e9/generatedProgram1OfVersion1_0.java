import java.util.TreeMap;
import java.util.Set;

public class TreeMapKeys {

    public static void main(String[] args) {

        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Put some key-value pairs into the TreeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);

        // Method 1: Get all keys using keySet()
        Set<String> keys = treeMap.keySet();

        System.out.println("Keys using keySet():");
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println("\nKeys using enhanced for loop on keySet():");
        for (String key : treeMap.keySet()) { // More concise version
            System.out.println(key);
        }


        // Method 2: Iterate and get keys using entrySet() (less common for just getting keys)
        System.out.println("\nKeys using entrySet() - (demonstration, keySet() is preferred for just getting keys):");
        for (var entry : treeMap.entrySet()) {  // Use var for conciseness (Java 10+)
            System.out.println(entry.getKey());
        }




    }
}
