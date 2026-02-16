import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("kiwi", 3);
        treeMap.put("orange", 4);
        treeMap.put("grape", 5);


        // Print the sorted TreeMap
        System.out.println("Sorted TreeMap (by string length): " + treeMap);


        //Example using Comparator for reverse string length
         TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(new ReverseStringLengthComparator());
        reverseTreeMap.putAll(treeMap); //Copy elements
        System.out.println("Sorted TreeMap (reverse string length): " + reverseTreeMap);
    }

    // Custom Comparator to compare strings by length
    static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length()); // Compare lengths
        }
    }


    // Custom Comparator to compare strings by length in reverse
    static class ReverseStringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
           return Integer.compare(s2.length(), s1.length());  //Reverse
        }
    }



}
