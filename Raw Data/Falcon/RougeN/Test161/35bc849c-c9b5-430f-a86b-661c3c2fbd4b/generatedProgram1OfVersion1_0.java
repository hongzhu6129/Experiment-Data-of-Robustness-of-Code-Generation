import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayListElements {

    public static void main(String[] args) {

        // 1. Create an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("Original ArrayList: " + fruits);

        // 2. Swap elements using Collections.swap()
        int index1 = 1; // Index of "Banana"
        int index2 = 2; // Index of "Orange"

        try {
            Collections.swap(fruits, index1, index2);
            System.out.println("ArrayList after swapping using Collections.swap(): " + fruits);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index for swapping.  Index must be within the bounds of the ArrayList (0-" + (fruits.size() -1 ) + ").");

        }



        // Reset for the next example
        fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Grape"));


        // 3. Swap elements manually (without Collections.swap)
        index1 = 0; // Index of "Apple"
        index2 = 3; // Index of "Grape"

        try {
           String temp = fruits.get(index1);
           fruits.set(index1, fruits.get(index2));
           fruits.set(index2, temp);

           System.out.println("ArrayList after manual swapping: " + fruits);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index for swapping. Index must be within the bounds of the ArrayList (0-" + (fruits.size() -1 ) + ").");
        }



         // Demonstrating potential issues with incorrect indices
        fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Grape")); // Reset


        System.out.println("\nDemonstrating error handling:");

        // Intentionally using out-of-bounds indices to trigger the catch block
        index1 = -1;
        index2 = 5;
         try {
            Collections.swap(fruits, index1, index2); // This will throw an IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index for swapping using Collections.swap(). Index must be within the bounds of the ArrayList (0-" + (fruits.size() -1 ) + ").");
        }



        try {
            String temp = fruits.get(index1); //This will throw an IndexOutOfBoundsException
            fruits.set(index1, fruits.get(index2));
            fruits.set(index2, temp);
         } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index for swapping using manual swap. Index must be within the bounds of the ArrayList (0-" + (fruits.size() -1 ) + ").");

        }


    }
}
