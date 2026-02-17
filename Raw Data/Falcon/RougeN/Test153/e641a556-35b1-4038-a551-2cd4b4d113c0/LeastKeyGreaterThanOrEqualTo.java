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

        int key2 = 10;
        Integer result2 = treeMap.ceilingKey(key2);
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: 10

        int key3 = 60;
        Integer result3 = treeMap.ceilingKey(key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: null


        // Example with Strings:
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "blueberry";
        String result4 = stringTreeMap.ceilingKey(key4);
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4);  // Output: cherry

        String key5 = "apple";
         String result5 = stringTreeMap.ceilingKey(key5);
        System.out.println("Least key greater than or equal to " + key5 + ": " + result5);  // Output: apple

        String key6 = "zucchini"; // Beyond the last key
        String result6 = stringTreeMap.ceilingKey(key6);
        System.out.println("Least key greater than or equal to " + key6 + ": " + result6); // Output: null


    }
}
