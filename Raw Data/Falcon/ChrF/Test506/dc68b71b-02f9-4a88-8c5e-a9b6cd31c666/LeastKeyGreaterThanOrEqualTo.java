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
        Integer leastKey1 = treeMap.ceilingKey(key1); // Returns 30
        System.out.println("Least key greater than or equal to " + key1 + ": " + leastKey1);

        int key2 = 10;
        Integer leastKey2 = treeMap.ceilingKey(key2);  // Returns 10
        System.out.println("Least key greater than or equal to " + key2 + ": " + leastKey2);


        int key3 = 55;
        Integer leastKey3 = treeMap.ceilingKey(key3); // Returns null
        System.out.println("Least key greater than or equal to " + key3 + ": " + leastKey3);


        // Example with String keys
         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "blueberry";
        String leastKey4 = stringTreeMap.ceilingKey(key4); // Returns cherry
        System.out.println("Least key greater than or equal to " + key4 + ": " + leastKey4);


        String key5 = "apricot"; // comes before apple
        String leastKey5 = stringTreeMap.ceilingKey(key5); // Returns apple
        System.out.println("Least key greater than or equal to " + key5 + ": " + leastKey5);

        String key6 = "zebra";
        String leastKey6 = stringTreeMap.ceilingKey(key6); // Returns null
        System.out.println("Least key greater than or equal to " + key6 + ": " + leastKey6);
    }
}
