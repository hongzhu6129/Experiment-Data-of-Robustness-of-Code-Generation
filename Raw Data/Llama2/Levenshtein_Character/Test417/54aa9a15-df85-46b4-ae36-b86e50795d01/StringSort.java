import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "grape", "kiwi"};

        System.out.println("Original array: " + Arrays.toString(strings));

        sort_array_by_length(strings, true); // Sort in ascending order
        System.out.println("Ascending order by length: " + Arrays.toString(strings));

        sort_array_by_length(strings, false); // Sort in descending order
        System.out.println("Descending order by length: " + Arrays.toString(strings));

    }

    public static void sort_array_by_length(String[] arr, boolean sort_asc_dsc) {
        // Use a Comparator to sort based on length
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int comparisonResult = Integer.compare(s1.length(), s2.length());
                // Reverse the order if descending sort is requested
                return sort_asc_dsc ? comparisonResult : -comparisonResult; 
            }
        });
    }
}
