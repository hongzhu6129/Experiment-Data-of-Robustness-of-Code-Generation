import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortWithComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("grape", 3);
        treeMap.put("orange", 4);
        treeMap.put("kiwi", 5);


        // Print the sorted TreeMap
        System.out.println("Sorted TreeMap: " + treeMap);


        //Demonstrate usage of compare method (could be called within the Comparator)
        StringLengthComparator comparator = new StringLengthComparator();
        System.out.println("Comparison result: " + comparator.compare("apple", "banana")); // Expected: -1 (apple is shorter)
        System.out.println("Comparison result: " + comparator.compare("banana", "apple")); // Expected: 1 (banana is longer)
        System.out.println("Comparison result: " + comparator.compare("grape", "grape")); // Expected: 0 (equal length)

    }



    // Custom Comparator to sort strings by length
    static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());  // Compare based on string length
        }
    }
}



