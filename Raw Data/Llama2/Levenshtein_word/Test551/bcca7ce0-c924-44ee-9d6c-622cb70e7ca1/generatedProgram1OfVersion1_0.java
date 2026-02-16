import java.util.TreeMap;

public class LeastKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        int key1 = 25;
        Integer leastKey1 = treeMap.ceilingKey(key1);
        if (leastKey1 != null) {
            System.out.println("Least key greater than or equal to " + key1 + ": " + leastKey1); // Output: 30
        } else {
            System.out.println("No key greater than or equal to " + key1 + " found.");
        }


        int key2 = 55; // Example with a key larger than any in the map
        Integer leastKey2 = treeMap.ceilingKey(key2);
        if (leastKey2 != null) {
            System.out.println("Least key greater than or equal to " + key2 + ": " + leastKey2); 
        } else {
            System.out.println("No key greater than or equal to " + key2 + " found."); //Output: No key...
        }

        int key3 = 10;  // Example with key equal to an existing key
        Integer leastKey3 = treeMap.ceilingKey(key3);
        if (leastKey3 != null) {
            System.out.println("Least key greater than or equal to " + key3 + ": " + leastKey3); // Output: 10
        } else {
            System.out.println("No key greater than or equal to " + key3 + " found."); 
        }


        // Demonstration with other data types:
        TreeMap<String, Double> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Apple", 1.0);
        stringTreeMap.put("Banana", 2.0);
        stringTreeMap.put("Orange", 3.0);

        String stringKey = "Apricot";
        String leastStringKey = stringTreeMap.ceilingKey(stringKey);
        if (leastStringKey != null) {
             System.out.println("Least key greater than or equal to " + stringKey + ": " + leastStringKey); // Output: Banana
        } else {
            System.out.println("No key greater than or equal to " + stringKey + " found."); //Output: Banana
        }
    }
}
