import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparatorExample {

    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator for String keys
        TreeMap<String, Integer> treeMap = new TreeMap<>(new StringLengthComparator());

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("kiwi", 3);
        treeMap.put("orange", 4);
        treeMap.put("grape", 5);


        // Print the TreeMap - it will be sorted by string length
        System.out.println("TreeMap sorted by string length:");
        System.out.println(treeMap);


        //Example with reverse string length sorting:
         TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(new StringLengthComparator().reversed()); // Use reversed()

        reverseTreeMap.putAll(treeMap); // Copy entries

        System.out.println("\nTreeMap sorted by reversed string length:");
        System.out.println(reverseTreeMap);


        // Example with case-insensitive sorting:
        TreeMap<String, Integer> caseInsensitiveTreeMap = new TreeMap<>(String::compareToIgnoreCase);
        caseInsensitiveTreeMap.putAll(treeMap);
        System.out.println("\nTreeMap sorted case-insensitively:");
        System.out.println(caseInsensitiveTreeMap);



    }


    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());  // Compare by length
        }
    }





}
