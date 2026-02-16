import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Mango");

        // Check if the ArrayList has at least 3 elements
        if (arrayList.size() >= 3) {
            // Remove the element at index 2 (third element)
            arrayList.remove(2);

            // Print the modified ArrayList
            System.out.println("ArrayList after removing the third element:");
            for (String element : arrayList) {
                System.out.println(element);
            }

        } else {
            System.out.println("ArrayList does not have a third element to remove.");
        }


        // Example with Integer ArrayList
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        if (intList.size() >= 3) {
             intList.remove(2); // Removes the Integer object at index 2. Autoboxing handles int to Integer conversion.

             System.out.println("\nInteger ArrayList after removing the third element:");
             for (Integer num : intList) {
                 System.out.println(num);
             }

        } else {
            System.out.println("\nInteger ArrayList does not have a third element to remove.");

        }


    }
}
