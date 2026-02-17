import java.util.TreeMap;

public class GreatestKeyLessThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        int givenKey1 = 25;
        Integer key1 = treeMap.floorKey(givenKey1);
        if (key1 != null) {
            System.out.println("Greatest key less than or equal to " + givenKey1 + ": " + key1);
        } else {
            System.out.println("No key less than or equal to " + givenKey1 + " found.");
        }


        int givenKey2 = 30;
        Integer key2 = treeMap.floorKey(givenKey2);
        if (key2 != null) {
            System.out.println("Greatest key less than or equal to " + givenKey2 + ": " + key2);
        } else {
            System.out.println("No key less than or equal to " + givenKey2 + " found.");
        }


        int givenKey3 = 5;
        Integer key3 = treeMap.floorKey(givenKey3);
        if (key3 != null) {
            System.out.println("Greatest key less than or equal to " + givenKey3 + ": " + key3);
        } else {
            System.out.println("No key less than or equal to " + givenKey3 + " found.");
        }


        int givenKey4 = 60; // Key greater than all keys in the map
         Integer key4 = treeMap.floorKey(givenKey4);
        if (key4 != null) {
            System.out.println("Greatest key less than or equal to " + givenKey4 + ": " + key4);
        } else {
            System.out.println("No key less than or equal to " + givenKey4 + " found.");
        }
    }
}
