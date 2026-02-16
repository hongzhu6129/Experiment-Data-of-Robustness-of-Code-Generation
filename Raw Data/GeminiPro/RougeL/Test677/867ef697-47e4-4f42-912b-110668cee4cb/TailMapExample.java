import java.util.TreeMap;
import java.util.SortedMap;

public class TailMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employee data (key = ID, value = name)
        employeeMap.put(101, "Alice");
        employeeMap.put(103, "Charlie");
        employeeMap.put(102, "Bob");
        employeeMap.put(105, "Eva");
        employeeMap.put(104, "David");

        // Given key (e.g., 103)
        int givenKey = 103;

        // Get the portion of the map whose keys are greater than the given key
        SortedMap<Integer, String> tailMap = employeeMap.tailMap(givenKey, false); // Exclusive of the given key

         // OR include the given key
        // SortedMap<Integer, String> tailMapInclusive = employeeMap.tailMap(givenKey); //Inclusive of the given key

        // Print the tail map (keys greater than 103 - Charlie in this case)
        System.out.println("Portion of map with keys greater than (exclusive) " + givenKey + ":");
        for (Integer key : tailMap.keySet()) {
            System.out.println("ID: " + key + ", Name: " + tailMap.get(key));
        }

        // Example demonstrating inclusive tailMap
        System.out.println("\nPortion of map with keys greater than or equal to (inclusive) " + givenKey + ":");
        SortedMap<Integer, String> tailMapInclusive = employeeMap.tailMap(givenKey);
        for (Integer key : tailMapInclusive.keySet()) {
            System.out.println("ID: " + key + ", Name: " + tailMapInclusive.get(key));
        }



        // Another example with Strings as keys (demonstrates natural ordering)
        TreeMap<String, Integer> productMap = new TreeMap<>();
        productMap.put("Apple", 1);
        productMap.put("Banana", 2);
        productMap.put("Orange", 3);
        productMap.put("Grape", 4);

        String givenProductKey = "Banana";

        SortedMap<String, Integer> productTailMap = productMap.tailMap(givenProductKey, false); //Exclusive

        System.out.println("\nPortion of product map with keys greater than (exclusive) " + givenProductKey + ":");
        for (String key : productTailMap.keySet()) {
            System.out.println("Product: " + key + ", Value: " + productTailMap.get(key));
        }

    }
}
