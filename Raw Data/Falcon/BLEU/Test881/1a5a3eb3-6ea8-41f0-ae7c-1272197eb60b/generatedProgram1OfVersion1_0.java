import java.util.HashMap;
import java.util.Map;

public class HashToArray {

    public static void main(String[] args) {
        // Create a sample HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);


        // 1. Convert to an array of Map.Entry objects:

        Map.Entry<String, Integer>[] entryArray = hashMap.entrySet().toArray(new Map.Entry[0]);

        System.out.println("Array of Map.Entry:");
        for (Map.Entry<String, Integer> entry : entryArray) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



        // 2. Convert keys to a String array:

        String[] keyArray = hashMap.keySet().toArray(new String[0]);

        System.out.println("\nArray of keys:");
        for (String key : keyArray) {
            System.out.println(key);
        }


        // 3. Convert values to an Integer array:

        Integer[] valueArray = hashMap.values().toArray(new Integer[0]);

        System.out.println("\nArray of values:");
        for (Integer value : valueArray) {
            System.out.println(value);
        }


        //4. Convert to a 2D Object array (to represent key-value pairs):

        Object[][] objectArray = new Object[hashMap.size()][2];
        int i = 0;
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            objectArray[i][0] = entry.getKey();
            objectArray[i][1] = entry.getValue();
            i++;
        }


        System.out.println("\n2D Object array (key-value pairs):");
        for (Object[] row : objectArray) {
            System.out.println("Key: " + row[0] + ", Value: " + row[1]);
        }

    }
}
