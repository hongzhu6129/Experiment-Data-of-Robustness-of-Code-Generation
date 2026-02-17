import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
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
            System.out.println("ArrayList after removing the third element: " + arrayList);

        } else {
            System.out.println("The ArrayList does not have a third element to remove.");
        }
    }
}
