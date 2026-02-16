import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create a source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();
        sourceTreeMap.put("Apple", 10);
        sourceTreeMap.put("Banana", 20);
        sourceTreeMap.put("Orange", 30);
        sourceTreeMap.put("Grape", 40);

        // Create a destination TreeMap using putAll() for a shallow copy
        TreeMap<String, Integer> destinationTreeMap = new TreeMap<>();
        destinationTreeMap.putAll(sourceTreeMap);


        // Print both TreeMaps to verify the copy
        System.out.println("Source TreeMap: " + sourceTreeMap);
        System.out.println("Destination TreeMap: " + destinationTreeMap);


        // Demonstrate that changes to the original affect the copy (shallow copy)
        sourceTreeMap.put("Mango", 50);  // Add a new entry to the source

        System.out.println("\nAfter modifying source:");
        System.out.println("Source TreeMap: " + sourceTreeMap);
        System.out.println("Destination TreeMap: " + destinationTreeMap); // Destination is NOT affected since keys and values themselves are immutable

         // Example if values were mutable objects (like a custom Product class)
         TreeMap<String, StringBuilder> mutableTreeMap = new TreeMap<>();
         StringBuilder productName = new StringBuilder("Phone");
         mutableTreeMap.put("Electronics", productName);

         TreeMap<String, StringBuilder> mutableCopy = new TreeMap<>();
         mutableCopy.putAll(mutableTreeMap);

         productName.append(" Case"); // Modify the original StringBuilder

         System.out.println("\nMutable Example:");
         System.out.println("Original: " + mutableTreeMap);
         System.out.println("Copy: " + mutableCopy); // Copy IS affected because the StringBuilder is shared



        // For a deep copy (if values are mutable and you want independent copies), 
        // you'd need to iterate and clone/copy the values individually. Demonstrated below:
        TreeMap<String, StringBuilder> deepCopy = new TreeMap<>();
        for (String key : mutableTreeMap.keySet()) {
            deepCopy.put(key, new StringBuilder(mutableTreeMap.get(key))); // Create new StringBuilder instances
        }


        productName.append(" Accessory"); // Further modify the original

        System.out.println("\nAfter Deep Copy and further modifications:");
        System.out.println("Original: " + mutableTreeMap);
        System.out.println("Deep Copy: " + deepCopy); // Deep copy remains unaffected
    }
}
