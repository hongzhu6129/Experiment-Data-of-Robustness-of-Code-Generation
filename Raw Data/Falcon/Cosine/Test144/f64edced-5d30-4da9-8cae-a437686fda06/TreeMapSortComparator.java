import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator for sorting keys in descending order
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);
        treeMap.put("kiwi", 5);

        // Print the sorted TreeMap
        System.out.println("Sorted TreeMap (Descending String Length): " + treeMap);


        //Example with ascending order
        TreeMap<String, Integer> ascendingTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
             public int compare(String s1, String s2) {
                 return Integer.compare(s1.length(), s2.length()); // Sort by length ascending
                // Or for natural String ordering (ascending):
                // return s1.compareTo(s2);
             }
         });

        ascendingTreeMap.putAll(treeMap);  // Reuse the data


        System.out.println("Sorted TreeMap (Ascending String Length): " + ascendingTreeMap);


    }

    // Custom Comparator class to sort strings by length in descending order
     static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s2.length(), s1.length()); // Sort by length descending
        }
    }

}
