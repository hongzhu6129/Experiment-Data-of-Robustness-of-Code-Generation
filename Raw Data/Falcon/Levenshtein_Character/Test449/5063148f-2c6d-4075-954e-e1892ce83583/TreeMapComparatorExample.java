import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparatorExample {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);
        treeMap.put("kiwi", 5);

        // Print the TreeMap (sorted by string length)
        System.out.println(treeMap);


        // Example with reversed order
        TreeMap<String, Integer> reversedTreeMap = new TreeMap<>(new StringLengthComparator().reversed()); // Use reversed()

        reversedTreeMap.putAll(treeMap);  // Copy entries
        System.out.println(reversedTreeMap);
    }


    public static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            // Compare strings based on their lengths
            return Integer.compare(s1.length(), s2.length()); 
        }
    }
}
