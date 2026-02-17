import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new MyComparator());

        // Add some key-value pairs
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);


        // Print the sorted TreeMap
        System.out.println("Sorted TreeMap: " + treeMap);


        TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(new MyComparator().reversed()); // Reverse sort

         // Add some key-value pairs (same as above for comparison)
        reverseTreeMap.put("Apple", 1);
        reverseTreeMap.put("Banana", 2);
        reverseTreeMap.put("Orange", 3);
        reverseTreeMap.put("Grape", 4);

        System.out.println("Reverse Sorted TreeMap: " + reverseTreeMap);

    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Case-insensitive sorting (or any other custom logic)
            return s1.compareToIgnoreCase(s2); 
        }
    }
}

