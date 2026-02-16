import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");


        Integer key1 = 4;
        Integer lowerKey1 = treeMap.lowerKey(key1);
        System.out.println("Greatest key less than " + key1 + ": " + lowerKey1); // Output: 3

        Integer key2 = 1;
        Integer lowerKey2 = treeMap.lowerKey(key2);
        System.out.println("Greatest key less than " + key2 + ": " + lowerKey2); // Output: null

        Integer key3 = 6;
        Integer lowerKey3 = treeMap.lowerKey(key3);
        System.out.println("Greatest key less than " + key3 + ": " + lowerKey3); // Output: 5


        // Example with String keys:
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "blueberry";
        String lowerKey4 = stringTreeMap.lowerKey(key4);
        System.out.println("Greatest key less than " + key4 + ": " + lowerKey4); // Output: banana

         String key5 = "apple";
        String lowerKey5 = stringTreeMap.lowerKey(key5);
        System.out.println("Greatest key less than " + key5 + ": " + lowerKey5); // Output: null


    }
}
