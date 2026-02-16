import java.util.Comparator;
import java.util.TreeMap;

public class SortTreeMapKeys {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator
        TreeMap<String, Integer> greenMap = new TreeMap<>(new KeyComparator());

        // Add some key-value pairs
        greenMap.put("apple", 1);
        greenMap.put("banana", 2);
        greenMap.put("orange", 3);
        greenMap.put("grape", 4);
        greenMap.put("kiwi", 5);

        // Print the sorted map
        System.out.println("Sorted Green Map: " + greenMap);


        //Demonstrate using the comparator directly (optional)
        String str1 = "apple";
        String str2 = "banana";
        KeyComparator kc = new KeyComparator();
        int comparisonResult = kc.compare(str1, str2);
        System.out.println("Comparison of '" + str1 + "' and '" + str2 + "': " + comparisonResult);



    }


    // Custom comparator for String keys (case-insensitive sorting)
    public static class KeyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Case-insensitive comparison
            return s1.compareToIgnoreCase(s2); 
            // Or for any other custom sorting logic, implement it here. 
            // For example, reverse case-insensitive sort:
            //return s2.compareToIgnoreCase(s1);

        }
    }


}
