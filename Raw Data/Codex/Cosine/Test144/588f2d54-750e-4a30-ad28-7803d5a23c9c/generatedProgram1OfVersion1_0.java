import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

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

    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            // Sort in reverse alphabetical order (descending)
            return str2.compareTo(str1);  

            // For ascending order, use:
            // return str1.compareTo(str2);
        }
    }
}
