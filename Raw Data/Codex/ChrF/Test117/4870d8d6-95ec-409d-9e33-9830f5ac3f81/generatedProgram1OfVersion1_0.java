import java.util.Arrays;
import java.util.Comparator;

public class StringSort {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "orange", "grape"};

        System.out.println("Original array: " + Arrays.toString(strings));

        sort_array_by_length(strings, "asc");
        System.out.println("Ascending order by length: " + Arrays.toString(strings));

        sort_array_by_length(strings, "desc");
        System.out.println("Descending order by length: " + Arrays.toString(strings));


    }

    public static void sort_array_by_length(String[] arr, String sort_asc_dsc) {
        if (sort_asc_dsc.equals("asc")) {
            Arrays.sort(arr, Comparator.comparingInt(String::length));
        } else if (sort_asc_dsc.equals("desc")) {
            Arrays.sort(arr, (s1, s2) -> Integer.compare(s2.length(), s1.length())); // Descending
        } else {
            System.out.println("Invalid sort order. Please use 'asc' or 'desc'.");
        }
    }
}
