import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 35;
        Integer lowerKey1 = treeMap.lowerKey(key1);
        System.out.println("Greatest key less than " + key1 + ": " + lowerKey1); // Output: 30

        Integer key2 = 10;
        Integer lowerKey2 = treeMap.lowerKey(key2);
        System.out.println("Greatest key less than " + key2 + ": " + lowerKey2); // Output: null

        Integer key3 = 55; // Key greater than any in the map
        Integer lowerKey3 = treeMap.lowerKey(key3);
        System.out.println("Greatest key less than " + key3 + ": " + lowerKey3); // Output: 50


        // Example with different data types (String keys):
         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);


        String key4 = "grape";
        String lowerKey4 = stringTreeMap.lowerKey(key4);
        System.out.println("Greatest key less than " + key4 + ": " + lowerKey4); // Output: banana

        String key5 = "apple"; // Key exists in the map
        String lowerKey5 = stringTreeMap.lowerKey(key5);
        System.out.println("Greatest key less than " + key5 + ": " + lowerKey5); // Output: null (nothing smaller)



        // Demonstrating how to handle nulls safely:
        if (lowerKey1 != null) {
            System.out.println("Value associated with lowerKey1: " + treeMap.get(lowerKey1));
        } else {
            System.out.println("No key found less than " + key1); 
        }



    }
}
