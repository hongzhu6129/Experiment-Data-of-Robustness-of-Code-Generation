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
        System.out.println("Iterating using an Iterator over entrySet:");
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Iterate using a for-each loop over the entrySet
        System.out.println("\nIterating using a for-each loop over entrySet:");
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        // 3. Iterate using a for-each loop over the keySet and retrieving values
        System.out.println("\nIterating using a for-each loop over keySet:");
        for (String key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }

        // 4. Iterate using Java 8 forEach and lambda expression
        System.out.println("\nIterating using Java 8 forEach and lambda expression:");
        hm.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


        // 5. Iterate using  entrySet and forEach remaining (Java 9+) - useful for parallel processing
        System.out.println("\nIterating using entrySet and forEachRemaining (Java 9+):");
        hm.entrySet().forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        //Iterating over the values only
        System.out.println("\nIterating using Java 8 forEach and lambda expression (values only):");
        hm.values().forEach(System.out::println);



    }
}
