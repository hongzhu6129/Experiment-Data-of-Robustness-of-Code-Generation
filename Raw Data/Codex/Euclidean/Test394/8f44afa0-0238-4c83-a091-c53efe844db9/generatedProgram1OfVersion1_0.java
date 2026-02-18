import java.util.TreeMap;

public class CeilingKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");


        int key1 = 4;
        Integer ceilingKey1 = treeMap.ceilingKey(key1);
        System.out.println("Ceiling key for " + key1 + ": " + ceilingKey1); // Output: 5

        int key2 = 7;
        Integer ceilingKey2 = treeMap.ceilingKey(key2);
        System.out.println("Ceiling key for " + key2 + ": " + ceilingKey2); // Output: 7

        int key3 = 10;
        Integer ceilingKey3 = treeMap.ceilingKey(key3);
        System.out.println("Ceiling key for " + key3 + ": " + ceilingKey3); // Output: null


        // Demonstrating other data types:
        TreeMap<String, Double> treeMap2 = new TreeMap<>();
        treeMap2.put("apple", 1.0);
        treeMap2.put("banana", 2.0);
        treeMap2.put("cherry", 3.0);

        String key4 = "blueberry";
        String ceilingKey4 = treeMap2.ceilingKey(key4); 
        System.out.println("Ceiling key for " + key4 + ": " + ceilingKey4); // Output: cherry


         String key5 = "date";  // Beyond the last key
        String ceilingKey5 = treeMap2.ceilingKey(key5); 
        System.out.println("Ceiling key for " + key5 + ": " + ceilingKey5); // Output: null
    }
}
