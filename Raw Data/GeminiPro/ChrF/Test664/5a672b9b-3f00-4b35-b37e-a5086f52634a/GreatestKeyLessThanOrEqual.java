import java.util.TreeMap;

public class GreatestKeyLessThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some key-value pairs
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(10, "Ten");
        treeMap.put(15, "Fifteen");
        treeMap.put(20, "Twenty");


        int givenKey1 = 7;
        int givenKey2 = 15;
        int givenKey3 = 25; // Key greater than any in the map
        int givenKey4 = 0; // Key smaller than any in the map


        // Get the key-value mapping associated with the greatest key less than or equal to the given key.
        printResult(treeMap, givenKey1);
        printResult(treeMap, givenKey2);
        printResult(treeMap, givenKey3);
        printResult(treeMap, givenKey4);


    }

    private static void printResult(TreeMap<Integer, String> treeMap, int givenKey) {
         Integer key = treeMap.floorKey(givenKey);  // floorKey() finds greatest key <= givenKey


         if (key != null) {
            String value = treeMap.get(key);
            System.out.println("For given key " + givenKey + ": Key = " + key + ", Value = " + value);
        } else {
            System.out.println("For given key " + givenKey + ": No key found less than or equal to the given key.");
        }

        System.out.println(); // Add an extra line for clarity
    }
}
