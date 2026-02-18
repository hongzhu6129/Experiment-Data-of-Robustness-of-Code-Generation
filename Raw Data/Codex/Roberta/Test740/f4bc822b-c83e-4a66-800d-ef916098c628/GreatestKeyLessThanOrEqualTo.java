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

        int key1 = 35;
        Integer greatestKey1 = treeMap.floorKey(key1);
        System.out.println("Greatest key less than or equal to " + key1 + ": " + greatestKey1); // Output: 30

        int key2 = 20;
        Integer greatestKey2 = treeMap.floorKey(key2);
        System.out.println("Greatest key less than or equal to " + key2 + ": " + greatestKey2); // Output: 20


        int key3 = 5;
        Integer greatestKey3 = treeMap.floorKey(key3);
        System.out.println("Greatest key less than or equal to " + key3 + ": " + greatestKey3); // Output: null (no key less than or equal to 5)



        // Example with other data types (e.g., String keys):
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String stringKey = "apricot";
        String greatestStringKey = stringTreeMap.floorKey(stringKey);
        System.out.println("Greatest key less than or equal to " + stringKey + ": " + greatestStringKey);  // Output: apple

          stringKey = "grape";
        greatestStringKey = stringTreeMap.floorKey(stringKey);
        System.out.println("Greatest key less than or equal to " + stringKey + ": " + greatestStringKey);  // Output: orange (because 'g' comes after 'o')
    }
}
