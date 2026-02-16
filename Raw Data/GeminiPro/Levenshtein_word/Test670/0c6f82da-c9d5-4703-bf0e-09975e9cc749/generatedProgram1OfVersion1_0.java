import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        int givenKey1 = 6;
        Integer lowerKey1 = treeMap.lowerKey(givenKey1);
        System.out.println("Greatest key strictly less than " + givenKey1 + ": " + (lowerKey1 != null ? lowerKey1 : "No such key")); // Output: 5

        int givenKey2 = 1;
        Integer lowerKey2 = treeMap.lowerKey(givenKey2);
        System.out.println("Greatest key strictly less than " + givenKey2 + ": " + (lowerKey2 != null ? lowerKey2 : "No such key")); // Output: No such key


        // Another Example with Strings
        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("apple", 1);
        treeMap2.put("banana", 2);
        treeMap2.put("orange", 3);

        String givenKey3 = "banana";
        String lowerKey3 = treeMap2.lowerKey(givenKey3);
        System.out.println("Greatest key strictly less than " + givenKey3 + ": " + (lowerKey3 != null ? lowerKey3 : "No such key")); // Output: apple

         String givenKey4 = "apple";
        String lowerKey4 = treeMap2.lowerKey(givenKey4);
        System.out.println("Greatest key strictly less than " + givenKey4 + ": " + (lowerKey4 != null ? lowerKey4 : "No such key")); // Output: No such key



    }
}
