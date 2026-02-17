import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class HashToTreeSet {

    public static void main(String[] args) {
        // Create a sample HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);
        hashMap.put("grape", 4);


        // Method 1: Convert keys to TreeSet
        TreeSet<String> treeSetKeys = new TreeSet<>(hashMap.keySet());
        System.out.println("TreeSet of keys: " + treeSetKeys);

        // Method 2: Convert values to TreeSet
        TreeSet<Integer> treeSetValues = new TreeSet<>(hashMap.values());
        System.out.println("TreeSet of values: " + treeSetValues);


        //Method 3: Convert entries (key-value pairs) to a TreeSet (requires a custom Comparator or comparable entries if you want to sort by value).  This example sorts by key:
        TreeSet<String> treeSetEntriesByKey = new TreeSet<>(); 
        for(String key: hashMap.keySet()) {
            treeSetEntriesByKey.add(key + ": " + hashMap.get(key)); // Or a custom representation
        }
        System.out.println("TreeSet of entries (sorted by key-string representation): " + treeSetEntriesByKey);



         // Example if your values are Comparable (e.g., Integer already is) and you want to sort by value.
        TreeSet<Integer> treeSetByValue = new TreeSet<>(hashMap.values()); // Natural Ordering
        System.out.println("TreeSet by value: " + treeSetByValue);



        // Advanced Example (Using a Map.Entry Comparator):

        // A custom Comparator to sort Map.Entry objects by value (descending order in this example)
        java.util.Comparator<java.util.Map.Entry<String, Integer>> valueComparator = 
            (e1, e2) -> e2.getValue().compareTo(e1.getValue());


        TreeSet<java.util.Map.Entry<String, Integer>> treeSetByValueDesc = new TreeSet<>(valueComparator);
        treeSetByValueDesc.addAll(hashMap.entrySet());  // Add all entries

        System.out.print("TreeSet of entries (sorted by value descending): ");
        for (java.util.Map.Entry<String, Integer> entry : treeSetByValueDesc) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
        System.out.println();


    }
}
