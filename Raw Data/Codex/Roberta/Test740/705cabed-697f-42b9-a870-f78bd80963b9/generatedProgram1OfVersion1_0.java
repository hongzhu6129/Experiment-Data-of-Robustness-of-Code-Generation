import java.util.TreeMap;

public class GreatestKeyLessThanOrEqualTo {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs.
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some sample data
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");


        // Example usage:

        // Key exists in the map
        int key1 = 30;
        Integer greatestKey1 = treeMap.floorKey(key1); 
        System.out.println("Greatest key less than or equal to " + key1 + ": " + greatestKey1); // Output: 30

        // Key does not exist, but a smaller key exists
        int key2 = 25;
        Integer greatestKey2 = treeMap.floorKey(key2);
        System.out.println("Greatest key less than or equal to " + key2 + ": " + greatestKey2); // Output: 20

        // Key is smaller than the smallest key
        int key3 = 5;
        Integer greatestKey3 = treeMap.floorKey(key3);
        System.out.println("Greatest key less than or equal to " + key3 + ": " + greatestKey3); // Output: null (no smaller key)


        // Key is greater than the largest key
        int key4 = 60;
        Integer greatestKey4 = treeMap.floorKey(key4);
        System.out.println("Greatest key less than or equal to " + key4 + ": " + greatestKey4); // Output: 50


        // Handling null return values (important!)
        int key5 = 5;
        Integer greatestKey5 = treeMap.floorKey(key5);
        if (greatestKey5 != null) {
            System.out.println("Value associated with the greatest key less than or equal to " + key5 + ": " + treeMap.get(greatestKey5)); 
        } else {
            System.out.println("No key less than or equal to " + key5 + " found in the map.");
        }


        // Example with other data types (String keys)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String key6 = "apricot";
        String greatestKey6 = stringTreeMap.floorKey(key6);
        System.out.println("Greatest key less than or equal to " + key6 + ": " + greatestKey6); // Output: apple


    }
}
