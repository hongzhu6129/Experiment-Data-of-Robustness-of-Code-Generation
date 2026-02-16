import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

    public static void main(String[] args) {
        // Using a Comparator with the TreeMap constructor
        TreeMap<String, Integer> treeMapComparator = new TreeMap<>(new StringLengthComparator());
        treeMapComparator.put("apple", 1);
        treeMapComparator.put("banana", 2);
        treeMapComparator.put("kiwi", 3);
        treeMapComparator.put("orange", 4);
        treeMapComparator.put("grape", 5);


        System.out.println("Sorted by string length (using Comparator): " + treeMapComparator);


        // Using a Comparator with a simple TreeMap (alternative approach)
         TreeMap<String, Integer> anotherTreeMap = new TreeMap<>();
        anotherTreeMap.put("apple", 1);
        anotherTreeMap.put("banana", 2);
        anotherTreeMap.put("kiwi", 3);
        anotherTreeMap.put("orange", 4);
        anotherTreeMap.put("grape", 5);

        TreeMap<String, Integer> sortedTreeMap = new TreeMap<>(new StringLengthComparator());
        sortedTreeMap.putAll(anotherTreeMap); // Copy into a new TreeMap using comparator


        System.out.println("Sorted by string length (alternative approach) : " + sortedTreeMap);

    }


    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length()); // Compare by length
        }
    }



}
