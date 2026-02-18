import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThinArrayList {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 5));
        List<Integer> thinnedList = thinList(numbers);
        System.out.println("Original list: " + numbers);
        System.out.println("Thinned list: " + thinnedList);



         List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        List<String> thinnedStrings = thinList(strings);
        System.out.println("Original list: " + strings);
        System.out.println("Thinned list: " + thinnedStrings);


        // Test with an empty list
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> thinnedEmptyList = thinList(emptyList);
        System.out.println("Original list: " + emptyList);
        System.out.println("Thinned list: " + thinnedEmptyList);
    }



    public static <T> List<T> thinList(List<T> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>(); // Return a new empty list if the input is null or empty
        }

        List<T> thinnedList = new ArrayList<>();
        thinnedList.add(list.get(0)); // Add the first element

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                thinnedList.add(list.get(i));
            }
        }

        return thinnedList;
    }
}
