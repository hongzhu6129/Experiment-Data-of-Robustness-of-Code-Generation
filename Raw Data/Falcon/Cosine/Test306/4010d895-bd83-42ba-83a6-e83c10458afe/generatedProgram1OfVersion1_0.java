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


        // Method 1: Convert keys to TreeSet (maintains natural ordering of keys)
        TreeSet<String> treeSetKeys = new TreeSet<>(hashMap.keySet());
        System.out.println("TreeSet of keys: " + treeSetKeys);


        // Method 2: Convert values to TreeSet (maintains natural ordering of values)
        TreeSet<Integer> treeSetValues = new TreeSet<>(hashMap.values());
        System.out.println("TreeSet of values: " + treeSetValues);

        // Method 3: Convert entries (key-value pairs) to a TreeSet (requires a custom Comparator if you want to sort by value)
        // This example sorts by keys (natural ordering of Strings). 
        TreeSet<String> treeSetEntriesByKey = new TreeSet<>(hashMap.keySet());  // Essentially the same as Method 1 since it's sorted by keys

        System.out.println("TreeSet of entries (sorted by keys): " + treeSetEntriesByKey);

        // For more complex scenarios where you need to store the full entry and sort by values, you'd create a custom Comparator
        // See the more advanced example below if that's what you require.
    }
}



// More Advanced Example (sorting entries by values):
/*

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


public class HashToTreeSetByValue {


    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);
        hashMap.put("grape", 4);


        // Create a Comparator to compare Map.Entry objects based on their values
        Comparator<Map.Entry<String, Integer>> valueComparator = (e1, e2) -> {
            // Compare values first
             int valueComparison = e1.getValue().compareTo(e2.getValue());
            // If values are equal, compare keys to ensure consistent ordering
            if(valueComparison==0)
                return e1.getKey().compareTo(e2.getKey());
            else return valueComparison;

        };


        TreeSet<Map.Entry<String, Integer>> treeSetByValue = new TreeSet<>(valueComparator);
        treeSetByValue.addAll(hashMap.entrySet());



        System.out.println("TreeSet sorted by values:");
        for (Map.Entry<String, Integer> entry : treeSetByValue) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
*/



