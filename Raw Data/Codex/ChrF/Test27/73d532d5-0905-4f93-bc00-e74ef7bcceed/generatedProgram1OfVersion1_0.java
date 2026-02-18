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
        Integer lowerKey1 = treeMap.lowerKey(key1); 
        System.out.println("Greatest key strictly less than " + key1 + ": " + lowerKey1); // Output: 30

        Integer key2 = 15;
        Integer lowerKey2 = treeMap.lowerKey(key2);
        System.out.println("Greatest key strictly less than " + key2 + ": " + lowerKey2); // Output: 10


        Integer key3 = 5;
        Integer lowerKey3 = treeMap.lowerKey(key3);
        System.out.println("Greatest key strictly less than " + key3 + ": " + lowerKey3); // Output: null


        Integer key4 = 55; // Key greater than the largest key in the map
        Integer lowerKey4 = treeMap.lowerKey(key4);
        System.out.println("Greatest key strictly less than " + key4 + ": " + lowerKey4); // Output: 50
    }
}
