import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CloneArrayList {

    public static void main(String[] args) {

        // Method 1: Using the constructor
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> clonedList1 = new ArrayList<>(originalList);

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List (using constructor): " + clonedList1);



        // Method 2: Using addAll()
        ArrayList<String> originalList2 = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        ArrayList<String> clonedList2 = new ArrayList<>();
        clonedList2.addAll(originalList2);

        System.out.println("\nOriginal List: " + originalList2);
        System.out.println("Cloned List (using addAll): " + clonedList2);


        //Method 3: Using Collections.copy()  (Requires the destination list to be at least the same size)
        ArrayList<Double> originalList3 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));
        ArrayList<Double> clonedList3 = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0)); // Initialize with same size
        Collections.copy(clonedList3, originalList3);

        System.out.println("\nOriginal List: " + originalList3);
        System.out.println("Cloned List (using Collections.copy): " + clonedList3);
    }
}
