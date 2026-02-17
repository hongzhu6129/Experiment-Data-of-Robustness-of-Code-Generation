import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Example usage:
        List<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "kiwi"));
        removeThirdElement(list1); // Removes "orange"
        System.out.println(list1); // Output: [apple, banana, grape, kiwi]

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        removeThirdElement(list2); // Removes 3
        System.out.println(list2); // Output: [1, 2, 4, 5]


         //Handling edge cases: Empty list and list with less than 3 elements
        List<Double> list3 = new ArrayList<>();
        removeThirdElement(list3);
        System.out.println(list3); // Output: [] (Empty list remains empty)

        List<Character> list4 = new ArrayList<>(Arrays.asList('a', 'b'));
        removeThirdElement(list4);
        System.out.println(list4); // Output: [a, b] (No change)

        
    }

    public static <T> void removeThirdElement(List<T> list) {
        if (list != null && list.size() >= 3) { // Check for null and size before removal
            list.remove(2); // Remove the element at index 2 (third element)
        }
    }
}
