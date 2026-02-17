import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {

        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some key-value pairs
        treeMap.put(1, "Apple");
        treeMap.put(5, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(2, "Grape");
        treeMap.put(4, "Mango");


        // 1. Searching for a key using containsKey()
        int keyToSearch1 = 3;
        if (treeMap.containsKey(keyToSearch1)) {
            System.out.println("Key " + keyToSearch1 + " found in the TreeMap.");
        } else {
            System.out.println("Key " + keyToSearch1 + " not found in the TreeMap.");
        }

        int keyToSearch2 = 6;  // Key not present
        if (treeMap.containsKey(keyToSearch2)) {
            System.out.println("Key " + keyToSearch2 + " found in the TreeMap.");
        } else {
            System.out.println("Key " + keyToSearch2 + " not found in the TreeMap.");
        }


        // 2. Searching for a value using containsValue()
        String valueToSearch1 = "Orange";
        if (treeMap.containsValue(valueToSearch1)) {
            System.out.println("Value \"" + valueToSearch1 + "\" found in the TreeMap.");
        } else {
            System.out.println("Value \"" + valueToSearch1 + "\" not found in the TreeMap.");
        }

        String valueToSearch2 = "Pineapple"; // Value not present
        if (treeMap.containsValue(valueToSearch2)) {
            System.out.println("Value \"" + valueToSearch2 + "\" found in the TreeMap.");
        } else {
            System.out.println("Value \"" + valueToSearch2 + "\" not found in the TreeMap.");
        }



        // 3. Getting the value associated with a key using get()
        int keyToGet = 2;
        String retrievedValue = treeMap.get(keyToGet);
        if (retrievedValue != null) {
            System.out.println("Value associated with key " + keyToGet + ": " + retrievedValue);
        } else {
            System.out.println("Key " + keyToGet + " not found in the TreeMap.");
        }


        int keyToGet2 = 7; // Key not present
        String retrievedValue2 = treeMap.get(keyToGet2);
        if (retrievedValue2 != null) {
            System.out.println("Value associated with key " + keyToGet2 + ": " + retrievedValue2);
        } else {
            System.out.println("Key " + keyToGet2 + " not found in the TreeMap."); // This will be printed.
        }
    }
}
