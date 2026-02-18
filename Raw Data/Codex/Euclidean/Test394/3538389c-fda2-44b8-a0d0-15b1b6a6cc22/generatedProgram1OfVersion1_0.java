import java.util.TreeMap;

public class LeastKeyGreaterThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 25;
        Integer key2 = 60;
        Integer key3 = 10; 
        Integer key4 = 15;

        System.out.println("Least key >= " + key1 + ": " + treeMap.ceilingKey(key1)); // Output: 30
        System.out.println("Least key >= " + key2 + ": " + treeMap.ceilingKey(key2)); // Output: null
        System.out.println("Least key >= " + key3 + ": " + treeMap.ceilingKey(key3)); // Output: 10 (exact match)
        System.out.println("Least key >= " + key4 + ": " + treeMap.ceilingKey(key4)); // Output: 20


        // Example with Strings as keys (natural ordering)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Apple", 1);
        stringTreeMap.put("Banana", 2);
        stringTreeMap.put("Orange", 3);

        String strKey1 = "Apricot";
        String strKey2 = "Zoo";
        String strKey3 = "Banana";

        System.out.println("Least key >= " + strKey1 + ": " + stringTreeMap.ceilingKey(strKey1)); // Banana
        System.out.println("Least key >= " + strKey2 + ": " + stringTreeMap.ceilingKey(strKey2)); // null
        System.out.println("Least key >= " + strKey3 + ": " + stringTreeMap.ceilingKey(strKey3)); // Banana (exact match)


    }
}
