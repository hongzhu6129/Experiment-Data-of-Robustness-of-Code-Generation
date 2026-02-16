import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Add elements to the HashMap
        hm.put("Apple", 1);
        hm.put("Banana", 2);
        hm.put("Orange", 3);
        hm.put("Grape", 4);


        // 1. Iterate using an Iterator over the entrySet
        System.out.println("Iterating using entrySet and iterator:");
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();


        // 2. Iterate using a for-each loop over the entrySet (Enhanced for loop)
        System.out.println("Iterating using enhanced for loop over entrySet:");
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();



        // 3. Iterate using the keySet() and get() method
        System.out.println("Iterating using keySet() and get() method:");
        for (String key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
        System.out.println();



        // 4. Iterate using Java 8 forEach and lambda expression (Most concise)
        System.out.println("Iterating using Java 8 forEach and lambda expression:");
        hm.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println();


         // 5. Iterate using a forEach loop over the values (if you only need values)
        System.out.println("Iterating over values only:");
        for(Integer value : hm.values()) {
            System.out.println("Value: " + value);
        }

    }
}
