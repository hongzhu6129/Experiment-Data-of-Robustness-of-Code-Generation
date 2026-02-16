import java.util.TreeMap;

public class LeastKeyGreaterThan {

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


        // Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String givenStringKey = "apricot";  // Lexicographically between apple and banana
        String higherStringKey = stringTreeMap.higherKey(givenStringKey);
        System.out.println("Least key greater than \"" + givenStringKey + "\": \"" + higherStringKey + "\""); // Output: banana

        givenStringKey = "zucchini";
        higherStringKey = stringTreeMap.higherKey(givenStringKey);
        System.out.println("Least key greater than \"" + givenStringKey + "\": \"" + higherStringKey + "\""); // Output: null



    }
}
