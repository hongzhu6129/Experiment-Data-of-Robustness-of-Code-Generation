import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSortComparator {

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
        System.out.println("Sorted TreeMap by String Length: " + treeMap);


          // Example with reverse order
        TreeMap<String, String> reverseTreeMap = new TreeMap<>(new StringLengthComparator().reversed()); // Use reversed()

        reverseTreeMap.putAll(treeMap); // Copy entries

        System.out.println("Reverse Sorted TreeMap by String Length: " + reverseTreeMap);



    }



    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return Integer.compare(str1.length(), str2.length()); // Compare by length
           //Or for reverse: return Integer.compare(str2.length(), str1.length());
        }
    }



}
