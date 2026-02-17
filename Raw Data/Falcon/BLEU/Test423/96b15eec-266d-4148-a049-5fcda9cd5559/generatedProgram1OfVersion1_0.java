import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, String> treeMap = new TreeMap<>(new MyComparator());

        // Add some key-value pairs
        treeMap.put("apple", "red");
        treeMap.put("banana", "yellow");
        treeMap.put("orange", "orange");
        treeMap.put("grape", "purple");

        // Print the sorted TreeMap
        System.out.println(treeMap);
    }

    // Custom Comparator implementation
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Reverse alphabetical order
            return s2.compareTo(s1); 
        }
    }
}
