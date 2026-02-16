import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, String> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", "fruit");
        treeMap.put("banana", "fruit");
        treeMap.put("orange", "fruit");
        treeMap.put("grape", "fruit");
        treeMap.put("kiwi", "fruit");


        // Print the sorted TreeMap
        System.out.println("Sorted TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

        // Example demonstrating how compare() works within the Comparator
        StringLengthComparator comparator = new StringLengthComparator();
        System.out.println("\nComparison Results:");
        System.out.println("apple vs banana: " + comparator.compare("apple", "banana")); // 0 (same length)
        System.out.println("grape vs orange: " + comparator.compare("grape", "orange")); // 0 (same length)
        System.out.println("kiwi vs banana: " + comparator.compare("kiwi", "banana"));  // -1 (kiwi is shorter)
        System.out.println("orange vs kiwi: " + comparator.compare("orange", "kiwi")); // 1 (orange is longer)

    }

    // Custom Comparator to sort strings by length
    static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length()); // Compare based on length
        }
    }
}
