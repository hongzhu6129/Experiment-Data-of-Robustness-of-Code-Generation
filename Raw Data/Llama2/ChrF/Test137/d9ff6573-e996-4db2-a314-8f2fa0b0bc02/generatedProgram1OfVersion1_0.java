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
        Integer greatestKey1 = getGreatestKeyLessThan(treeMap, key1);
        System.out.println("Greatest key less than " + key1 + ": " + greatestKey1); // Output: 30

        Integer key2 = 15;
        Integer greatestKey2 = getGreatestKeyLessThan(treeMap, key2);
        System.out.println("Greatest key less than " + key2 + ": " + greatestKey2); // Output: 10


        Integer key3 = 5;
        Integer greatestKey3 = getGreatestKeyLessThan(treeMap, key3);
        System.out.println("Greatest key less than " + key3 + ": " + greatestKey3); // Output: null

        Integer key4 = 60; // Key greater than all existing keys
        Integer greatestKey4 = getGreatestKeyLessThan(treeMap, key4);
        System.out.println("Greatest key less than " + key4 + ": " + greatestKey4); // Output: 50

        // Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String stringKey = "grape";
        String greatestStringKey = getGreatestKeyLessThan(stringTreeMap, stringKey);
        System.out.println("Greatest key less than " + stringKey + ": " + greatestStringKey); // Output: cherry


    }



    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.lowerKey(key);
    }
}
