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
        Integer key2 = 15;
        Integer key3 = 5;


        System.out.println("Greatest key less than " + key1 + ": " + getGreatestKeyLessThan(treeMap, key1)); // Output: 30
        System.out.println("Greatest key less than " + key2 + ": " + getGreatestKeyLessThan(treeMap, key2)); // Output: 10
        System.out.println("Greatest key less than " + key3 + ": " + getGreatestKeyLessThan(treeMap, key3)); // Output: null


        // Example with strings as keys (ensure they are Comparable):
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String stringKey = "grape";
        System.out.println("Greatest key less than \"" + stringKey + "\": " + getGreatestKeyLessThan(stringTreeMap, stringKey)); //banana


    }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.lowerKey(key); 
    }
}
