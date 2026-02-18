import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grapefruit", 4);
        treeMap.put("kiwi", 5);


        // Print the sorted TreeMap
        System.out.println(treeMap);


         TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(new ReverseStringLengthComparator());
        reverseTreeMap.putAll(treeMap); // Copy elements for demonstration

         System.out.println(reverseTreeMap);
    }

    public static class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
           return s1.length() - s2.length(); // Compare by length
        }
    }

     public static class ReverseStringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
           return s2.length() - s1.length(); // Compare by length in reverse
        }
    }



}
