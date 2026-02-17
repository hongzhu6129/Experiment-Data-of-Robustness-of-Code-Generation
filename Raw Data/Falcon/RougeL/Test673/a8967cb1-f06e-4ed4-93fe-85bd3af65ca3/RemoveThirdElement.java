import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {

        // Method 1: Using ArrayList.remove() (Handles IndexOutOfBoundsException)

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original list: " + list1);

        try {
            list1.remove(2); // Removes the element at index 2 (the third element)
            System.out.println("List after removing third element: " + list1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: List does not have a third element.");
        }


        // Method 2:  Using subList()  (Creates a new list, original remains unchanged)
        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

        System.out.println("\nOriginal list: " + list2);

        if (list2.size() >= 3) {
            List<String> newList = new ArrayList<>(list2.subList(0, 2)); // Elements from index 0 up to (but not including) 2
            newList.addAll(list2.subList(3, list2.size()));  // Add remaining elements after the third.
            System.out.println("List after removing third element (subList): " + newList); 
        } else {
            System.out.println("Error: List does not have a third element.");
        }


         // Example with an array (requires creating a new array)
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("\nOriginal Array: " + Arrays.toString(array));
        if(array.length >= 3) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, 2); //Copy elements before 3rd
            System.arraycopy(array, 3, newArray, 2, array.length - 3); //Copy elements after 3rd
            System.out.println("Array after removing the third element: " + Arrays.toString(newArray));
        } else {
             System.out.println("Error: Array does not have a third element.");
        }
    }
}
