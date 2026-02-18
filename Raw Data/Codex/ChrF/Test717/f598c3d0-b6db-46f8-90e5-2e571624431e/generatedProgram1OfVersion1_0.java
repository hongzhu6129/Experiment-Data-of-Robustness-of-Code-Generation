import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        myList.add("Grape");
        myList.add("Mango");


        // Check if the list has at least 3 elements before attempting to remove the third one
        if (myList.size() >= 3) {
            // Remove the element at index 2 (third element)
             myList.remove(2); 

            // Print the updated ArrayList
            System.out.println("Updated ArrayList: " + myList);

        } else {
            System.out.println("The ArrayList does not have a third element to remove.");
        }
    }
}
