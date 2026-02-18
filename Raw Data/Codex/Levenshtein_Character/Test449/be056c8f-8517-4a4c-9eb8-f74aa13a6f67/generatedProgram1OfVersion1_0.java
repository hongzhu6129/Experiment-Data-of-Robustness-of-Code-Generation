import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new MyComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);

        // Print the sorted TreeMap
        System.out.println(treeMap); 
    }

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Reverse alphabetical order (descending)
            return s2.compareTo(s1);  

            // For ascending order, use:
            // return s1.compareTo(s2);

            // For case-insensitive ascending order:
            // return s1.compareToIgnoreCase(s2);

             // Custom logic (e.g., compare by length):
            // return Integer.compare(s1.length(), s2.length());
        }
    }
}
