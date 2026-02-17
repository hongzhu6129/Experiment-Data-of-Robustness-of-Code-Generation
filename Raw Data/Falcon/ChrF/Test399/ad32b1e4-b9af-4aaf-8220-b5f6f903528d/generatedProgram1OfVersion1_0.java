import java.util.TreeMap;

public class LeastKeyGreaterThanGiven {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        int givenKey1 = 4;
        Integer higherKey1 = treeMap.higherKey(givenKey1);
        System.out.println("Least key greater than " + givenKey1 + ": " + higherKey1); // Output: 5

        int givenKey2 = 9;
        Integer higherKey2 = treeMap.higherKey(givenKey2);
        System.out.println("Least key greater than " + givenKey2 + ": " + higherKey2); // Output: null


        // Example with different data types:
        TreeMap<String, Double> treeMap2 = new TreeMap<>();
        treeMap2.put("apple", 1.0);
        treeMap2.put("banana", 2.0);
        treeMap2.put("orange", 3.0);

        String givenKey3 = "banana";
        String higherKey3 = treeMap2.higherKey(givenKey3);
        System.out.println("Least key greater than " + givenKey3 + ": " + higherKey3); // Output: orange
        
        String givenKey4 = "orange";
        String higherKey4 = treeMap2.higherKey(givenKey4);
        System.out.println("Least key greater than " + givenKey4 + ": " + higherKey4); // Output: null



    }
}
