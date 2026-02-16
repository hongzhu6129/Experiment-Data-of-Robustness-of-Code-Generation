import java.util.TreeMap;

public class LeastKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        int key1 = 25;
        Integer result1 = treeMap.ceilingKey(key1);
        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 30

        int key2 = 55;
        Integer result2 = treeMap.ceilingKey(key2); 
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: null

        int key3 = 30;
        Integer result3 = treeMap.ceilingKey(key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: 30


         // Example with String keys (you'd need to adjust comparisons if needed):
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "blueberry";
        String result4 = stringTreeMap.ceilingKey(key4); // Comparison is based on String's natural ordering
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: cherry


    }
}
