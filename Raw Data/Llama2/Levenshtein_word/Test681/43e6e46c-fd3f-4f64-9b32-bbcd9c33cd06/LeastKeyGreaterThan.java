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
        if (higherKey1 != null) {
            System.out.println("Least key greater than " + givenKey1 + ": " + higherKey1);
        } else {
            System.out.println("No key greater than " + givenKey1 + " found.");
        }


        int givenKey2 = 50;
        Integer higherKey2 = treeMap.higherKey(givenKey2);
        if (higherKey2 != null) {
            System.out.println("Least key greater than " + givenKey2 + ": " + higherKey2);
        } else {
            System.out.println("No key greater than " + givenKey2 + " found."); 
        }


        // Example with strings
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String givenKey3 = "apricot";  // Falls alphabetically between "apple" and "banana"
        String higherKey3 = stringTreeMap.higherKey(givenKey3);

        if(higherKey3 != null){
            System.out.println("Least key greater than " + givenKey3 + ": " + higherKey3);
        } else {
            System.out.println("No key greater than " + givenKey3 + " found.");
        }

          String givenKey4 = "zebra"; // No greater key
        String higherKey4 = stringTreeMap.higherKey(givenKey4);

        if(higherKey4 != null){
            System.out.println("Least key greater than " + givenKey4 + ": " + higherKey4);
        } else {
            System.out.println("No key greater than " + givenKey4 + " found.");
        }
    }
}
