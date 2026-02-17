import java.util.TreeMap;

public class LeastKeyGreaterThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");


        Integer key1 = 4;
        Integer higherKey1 = treeMap.higherKey(key1);
        System.out.println("Least key greater than " + key1 + ": " + higherKey1); // Output: 5

        Integer key2 = 9;
        Integer higherKey2 = treeMap.higherKey(key2);
        System.out.println("Least key greater than " + key2 + ": " + higherKey2); // Output: null


        // Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String key3 = "apricot"; // Lexicographically greater than "apple"
        String higherKey3 = stringTreeMap.higherKey(key3);
        System.out.println("Least key greater than " + key3 + ": " + higherKey3); // Output: banana

        String key4 = "orange";
        String higherKey4 = stringTreeMap.higherKey(key4);
        System.out.println("Least key greater than " + key4 + ": " + higherKey4); // Output: null



    }
}
