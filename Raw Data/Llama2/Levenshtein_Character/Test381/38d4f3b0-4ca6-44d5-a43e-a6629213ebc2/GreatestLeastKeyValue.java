import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;

public class GreatestLeastKeyValue {

    public static void main(String[] args) {
        // Example usage:
        Map<Integer, String> myMap = new TreeMap<>(); // TreeMap ensures sorted order by keys

        myMap.put(1, "One");
        myMap.put(5, "Five");
        myMap.put(2, "Two");
        myMap.put(10, "Ten");
        myMap.put(3, "Three");

        if (!myMap.isEmpty()) {
            int greatestKey = Collections.lastKey(myMap);
            String greatestKeyValue = myMap.get(greatestKey);

            int leastKey = myMap.firstKey(); //  TreeMap specific method
            String leastKeyValue = myMap.get(leastKey);


            System.out.println("Greatest Key-Value: " + greatestKey + " - " + greatestKeyValue);
            System.out.println("Least Key-Value: " + leastKey + " - " + leastKeyValue);
        } else {
            System.out.println("The map is empty.");
        }


        // Example with a different Map type (HashMap � not inherently sorted)
        Map<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(5, "Five");
        hashMap.put(2, "Two");
        hashMap.put(10, "Ten");
        hashMap.put(3, "Three");

         if (!hashMap.isEmpty()) {
            int greatestKeyHashMap = Collections.max(hashMap.keySet());  //For general Maps
            String greatestKeyValueHashMap = hashMap.get(greatestKeyHashMap);

            int leastKeyHashMap = Collections.min(hashMap.keySet());   //For general Maps
            String leastKeyValueHashMap = hashMap.get(leastKeyHashMap);
            
            System.out.println("\nHashMap - Greatest Key-Value: " + greatestKeyHashMap + " - " + greatestKeyValueHashMap);
            System.out.println("HashMap - Least Key-Value: " + leastKeyHashMap + " - " + leastKeyValueHashMap);
        } else {
            System.out.println("The HashMap is empty.");
        }




    }
}
