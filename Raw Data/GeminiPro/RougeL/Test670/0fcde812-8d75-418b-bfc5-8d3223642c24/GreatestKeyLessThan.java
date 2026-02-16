import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");


        Integer key1 = 6;
        Integer result1 = getGreatestKeyLessThan(treeMap, key1);
        System.out.println("Greatest key less than " + key1 + ": " + result1); // Output: 5

        Integer key2 = 1;
        Integer result2 = getGreatestKeyLessThan(treeMap, key2);
        System.out.println("Greatest key less than " + key2 + ": " + result2); // Output: null

        Integer key3 = 10;
        Integer result3 = getGreatestKeyLessThan(treeMap, key3);
        System.out.println("Greatest key less than " + key3 + ": " + result3); // Output: 9


        // Example with other data types:
        TreeMap<Double, String> treeMap2 = new TreeMap<>();
        treeMap2.put(1.1, "One point One");
        treeMap2.put(3.3, "Three point Three");
        treeMap2.put(5.5, "Five point Five");

        Double key4 = 4.4;
        Double result4 = getGreatestKeyLessThan(treeMap2, key4);
        System.out.println("Greatest key less than " + key4 + ": " + result4); // Output: 3.3



    }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.lowerKey(key); 
    }
}
