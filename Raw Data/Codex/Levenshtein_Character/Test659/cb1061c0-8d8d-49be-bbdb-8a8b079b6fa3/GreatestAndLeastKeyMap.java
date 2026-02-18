import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GreatestAndLeastKeyMap {

    public static void main(String[] args) {

        // Example usage:
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Apple");
        myMap.put(5, "Banana");
        myMap.put(3, "Orange");
        myMap.put(2, "Grape");
        myMap.put(4, "Mango");


        if (myMap.isEmpty()) {
            System.out.println("Map is empty. Cannot find greatest and least keys.");
            return; 
        }

        // Find the greatest key
        int greatestKey = Collections.max(myMap.keySet());
        String greatestKeyValue = myMap.get(greatestKey);

        // Find the least key
        int leastKey = Collections.min(myMap.keySet());
        String leastKeyValue = myMap.get(leastKey);



        System.out.println("Greatest key: " + greatestKey + ", Value: " + greatestKeyValue);
        System.out.println("Least key: " + leastKey + ", Value: " + leastKeyValue);


        // --- More educational explanation with different key types---

        System.out.println("\n---Example with String keys---");
        Map<String, Integer> stringKeyMap = new HashMap<>();
        stringKeyMap.put("apple", 1);
        stringKeyMap.put("banana", 2);
        stringKeyMap.put("orange", 3);

        if (!stringKeyMap.isEmpty()) { // Good practice to check for emptiness.
            String greatestStringKey = Collections.max(stringKeyMap.keySet());
            String leastStringKey = Collections.min(stringKeyMap.keySet());

            System.out.println("Greatest String key: " + greatestStringKey + ", Value: " + stringKeyMap.get(greatestStringKey));
            System.out.println("Least String key: " + leastStringKey + ", Value: " + stringKeyMap.get(leastStringKey));
        } else {
             System.out.println("String key map is empty.");
        }

        // ---Important Note about Comparable keys---

        System.out.println("\n---Important Note---");
        System.out.println("The keys in your map must implement the Comparable interface (like Integer, String, etc.) " +
                           "for Collections.max() and Collections.min() to work correctly.  Otherwise, you'll get a ClassCastException.");




    }
}
