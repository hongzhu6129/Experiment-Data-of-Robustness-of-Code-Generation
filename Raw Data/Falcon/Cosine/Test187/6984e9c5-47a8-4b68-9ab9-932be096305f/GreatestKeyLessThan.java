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

        Integer key = 35;
        Integer greatestKeyLessThan = getGreatestKeyLessThan(treeMap, key);

        if (greatestKeyLessThan != null) {
            System.out.println("Greatest key less than " + key + ": " + greatestKeyLessThan); // Output: 30
        } else {
            System.out.println("No key found less than " + key);
        }



        key = 15;
        greatestKeyLessThan = getGreatestKeyLessThan(treeMap, key);

        if (greatestKeyLessThan != null) {
            System.out.println("Greatest key less than " + key + ": " + greatestKeyLessThan); // Output: 10
        } else {
            System.out.println("No key found less than " + key);
        }



        key = 5;
        greatestKeyLessThan = getGreatestKeyLessThan(treeMap, key);

        if (greatestKeyLessThan != null) {
            System.out.println("Greatest key less than " + key + ": " + greatestKeyLessThan); // Output: No key found less than 5
        } else {
            System.out.println("No key found less than " + key);
        }        
    }



    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.lowerKey(key); 
    }
}
