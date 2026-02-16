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


        Integer key1 = 30;
        Integer lowerKey1 = treeMap.lowerKey(key1);
        System.out.println("Greatest key strictly less than " + key1 + ": " + lowerKey1); // Output: 20

        Integer key2 = 10;
        Integer lowerKey2 = treeMap.lowerKey(key2);
        System.out.println("Greatest key strictly less than " + key2 + ": " + lowerKey2); // Output: null


        Integer key3 = 15; // Key not present, but we can still find the lower key
        Integer lowerKey3 = treeMap.lowerKey(key3);
        System.out.println("Greatest key strictly less than " + key3 + ": " + lowerKey3); // Output: 10

        Integer key4 = 60; // Key greater than all existing keys
        Integer lowerKey4 = treeMap.lowerKey(key4);
        System.out.println("Greatest key strictly less than " + key4 + ": " + lowerKey4); // Output: 50


         // Example with strings:
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String stringKey = "banana";
        String lowerStringKey = stringTreeMap.lowerKey(stringKey);
        System.out.println("Greatest key strictly less than \"" + stringKey + "\": \"" + lowerStringKey + "\""); // Output: "apple"

    }
}
