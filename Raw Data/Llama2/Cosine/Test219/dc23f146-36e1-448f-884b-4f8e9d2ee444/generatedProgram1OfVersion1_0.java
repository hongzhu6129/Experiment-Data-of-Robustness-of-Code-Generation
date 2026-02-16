import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortByKey {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator to sort keys in descending order
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringComparator());


        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);

        // Print the sorted TreeMap
        System.out.println(treeMap);


        // Example with a different Comparator (ascending order)
        TreeMap<String, Integer> ascendingTreeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2); // Natural ordering (ascending)
            }
        });

        ascendingTreeMap.putAll(treeMap); // Copy elements 

        System.out.println(ascendingTreeMap);


    }



    //Custom comparator class implementing Comparator<String> (must be static if nested)
    static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {

            return s2.compareTo(s1); // Reverse order (descending)

        }

    }
}
