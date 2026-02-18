import java.util.TreeMap;

public class GreatestKeyLessThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        int givenKey1 = 35;
        Integer greatestKey1 = treeMap.floorKey(givenKey1);  // Greatest key <= givenKey
        System.out.println("Greatest key less than or equal to " + givenKey1 + ": " + greatestKey1); // Output: 30

        int givenKey2 = 20;
        Integer greatestKey2 = treeMap.floorKey(givenKey2); 
        System.out.println("Greatest key less than or equal to " + givenKey2 + ": " + greatestKey2); // Output: 20


        int givenKey3 = 5;
        Integer greatestKey3 = treeMap.floorKey(givenKey3);
        System.out.println("Greatest key less than or equal to " + givenKey3 + ": " + greatestKey3); // Output: null (no key less than or equal to 5)


        int givenKey4 = 60; // Key greater than the largest key in the map
        Integer greatestKey4 = treeMap.floorKey(givenKey4);
        System.out.println("Greatest key less than or equal to " + givenKey4 + ": " + greatestKey4); // Output: 50 (the largest key in the map)
    }
}
