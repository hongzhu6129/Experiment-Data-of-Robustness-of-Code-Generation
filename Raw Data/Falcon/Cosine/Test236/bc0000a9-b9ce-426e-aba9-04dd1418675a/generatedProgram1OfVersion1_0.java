import java.util.HashMap;
import java.util.Map;

public class HashToArray {

    public static void main(String[] args) {
        // Example HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);

        // 1. Convert to an array of Map.Entry objects
        Map.Entry<String, Integer>[] entryArray = hashMap.entrySet().toArray(new Map.Entry[0]);

        System.out.println("Array of Map.Entry:");
        for (Map.Entry<String, Integer> entry : entryArray) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Convert to an array of keys
        String[] keyArray = hashMap.keySet().toArray(new String[0]);

        System.out.println("\nArray of Keys:");
        for (String key : keyArray) {
            System.out.println(key);
        }


        // 3. Convert to an array of values
        Integer[] valueArray = hashMap.values().toArray(new Integer[0]);

        System.out.println("\nArray of Values:");
        for (Integer value : valueArray) {
            System.out.println(value);
        }


        //4.  A 2D array (if you want both keys and values and maintain order somewhat).
        // This isn't perfectly preserving original hashmap order (especially if there were hash collisions 
        // within the HashMap), but it does iterate through the entries in the current order they are stored.

        String[][] keyValueArray = new String[hashMap.size()][2];
        int index = 0;
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            keyValueArray[index][0] = entry.getKey();
            keyValueArray[index][1] = String.valueOf(entry.getValue()); // Convert Integer to String
            index++;
        }

         System.out.println("\n2D Key-Value Array:");
        for(String[] row : keyValueArray) {
            System.out.println("Key: " + row[0] + ", Value: " + row[1]);
        }
    }
}
