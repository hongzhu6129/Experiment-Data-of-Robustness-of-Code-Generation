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

        Integer key1 = 4;
        Integer key2 = 1;
        Integer key3 = 10;

        System.out.println("Greatest key less than " + key1 + ": " + getGreatestKeyLessThan(treeMap, key1)); // Output: 3
        System.out.println("Greatest key less than " + key2 + ": " + getGreatestKeyLessThan(treeMap, key2)); // Output: null
        System.out.println("Greatest key less than " + key3 + ": " + getGreatestKeyLessThan(treeMap, key3)); // Output: 9


        // Additional Test Cases
        TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();
        Integer key4 = 5;

        System.out.println("Greatest key less than " + key4 + " in an empty map: " +  getGreatestKeyLessThan(emptyTreeMap, key4)); // Output: null

        TreeMap<Integer,String> singleElementMap = new TreeMap<>();
        singleElementMap.put(7, "Seven");
        Integer key5 = 8;
        Integer key6 = 6;

        System.out.println("Greatest key less than " + key5 + " in a single element map: " + getGreatestKeyLessThan(singleElementMap,key5)); // Output : 7
        System.out.println("Greatest key less than " + key6 + " in a single element map: " + getGreatestKeyLessThan(singleElementMap,key6)); // Output : null




    }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }
        return treeMap.lowerKey(key); 
    }
}
