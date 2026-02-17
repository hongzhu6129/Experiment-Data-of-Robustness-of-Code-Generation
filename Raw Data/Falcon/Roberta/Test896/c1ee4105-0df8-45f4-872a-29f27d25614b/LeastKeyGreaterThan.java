import java.util.TreeMap;

public class LeastKeyGreaterThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        int givenKey1 = 25;
        Integer higherKey1 = treeMap.higherKey(givenKey1);
        System.out.println("Least key greater than " + givenKey1 + ": " + (higherKey1 != null ? higherKey1 : "No such key")); // Output: 30

        int givenKey2 = 50;
        Integer higherKey2 = treeMap.higherKey(givenKey2);
        System.out.println("Least key greater than " + givenKey2 + ": " + (higherKey2 != null ? higherKey2 : "No such key")); // Output: No such key


        // Example with different data types (String keys):
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String givenKey3 = "apricot";  // Lexicographically after "apple"
        String higherKey3 = stringTreeMap.higherKey(givenKey3);
        System.out.println("Least key greater than " + givenKey3 + ": " + (higherKey3 != null ? higherKey3 : "No such key")); // Output: banana

        String givenKey4 = "zebra"; // No greater key
        String higherKey4 = stringTreeMap.higherKey(givenKey4);
        System.out.println("Least key greater than " + givenKey4 + ": " + (higherKey4 != null ? higherKey4 : "No such key")); // Output: No such key



    }
}
