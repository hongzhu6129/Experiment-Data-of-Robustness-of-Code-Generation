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
        Integer result1 = getGreatestKeyLessThan(treeMap, key1);
        System.out.println("Greatest key less than " + key1 + ": " + result1); // Output: 30

        Integer key2 = 15;
        Integer result2 = getGreatestKeyLessThan(treeMap, key2);
        System.out.println("Greatest key less than " + key2 + ": " + result2); // Output: 10

        Integer key3 = 5;
        Integer result3 = getGreatestKeyLessThan(treeMap, key3);
        System.out.println("Greatest key less than " + key3 + ": " + result3); // Output: null


        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "date";
        String result4 = getGreatestKeyLessThan(stringTreeMap, key4);
        System.out.println("Greatest key less than " + key4 + ": " + result4); // Output: cherry

        String key5 = "aardvark";
        String result5 = getGreatestKeyLessThan(stringTreeMap, key5);
        System.out.println("Greatest key less than " + key5 + ": " + result5); // Output: null

    }


    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.lowerKey(key);
    }
}
