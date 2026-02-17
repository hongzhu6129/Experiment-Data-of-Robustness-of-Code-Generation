import java.util.Comparator;
import java.util.TreeMap;

public class SortGreenMap {

    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator
        TreeMap<String, String> greenMap = new TreeMap<>(new StringComparator());

        // Add some key-value pairs
        greenMap.put("apple", "green");
        greenMap.put("banana", "yellow");
        greenMap.put("grape", "purple");
        greenMap.put("avocado", "green");
        greenMap.put("lime", "green");


        // Print the sorted map (keys are sorted according to the comparator)
        System.out.println(greenMap);


        TreeMap<String, String> reverseSortedMap = new TreeMap<>(new StringComparator().reversed()); // Reverse order

        reverseSortedMap.putAll(greenMap);  //Add all entries from the original map.

        System.out.println(reverseSortedMap);




    }

    public static class StringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            // Basic String comparison (lexicographical order)
            return s1.compareTo(s2);


            // Example: To sort by string length then alphabetically
//            int lenComparison = Integer.compare(s1.length(), s2.length());
//            if (lenComparison != 0) {
//                return lenComparison; // Sort by length first
//            } else {
//                return s1.compareTo(s2); // If lengths are equal, sort alphabetically
//            }

        }
    }
}


