import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSort {

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
        System.out.println("Sorted TreeMap: " + treeMap);


        //Demonstrate the Comparator usage outside the TreeMap constructor (e.g., for other sorting)
         String str1 = "apple";
         String str2 = "banana";
         StringLengthComparator comparator = new StringLengthComparator();
         int comparisonResult = comparator.compare(str1, str2);

         if (comparisonResult < 0) {
             System.out.println(str1 + " is shorter than " + str2);
         } else if (comparisonResult > 0) {
             System.out.println(str1 + " is longer than " + str2);
         } else {
             System.out.println(str1 + " has the same length as " + str2);
         }

    }



     // Separate Comparator class (recommended approach)
     static class StringLengthComparator implements Comparator<String> {
         @Override
         public int compare(String str1, String str2) {
             return Integer.compare(str1.length(), str2.length()); // Sort by string length
         }
     }


}
