import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

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
        public int compare(String str1, String str2) {
            // Reverse alphabetical order (descending)
            return str2.compareTo(str1); 

            // For ascending order, use:
            // return str1.compareTo(str2);
        }
    }
}
