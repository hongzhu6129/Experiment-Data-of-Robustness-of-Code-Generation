import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Specify the index of the element to retrieve
        int index = 2;  // We want to retrieve the element at index 2 (which is "Orange")

        // Check if the index is valid (within the bounds of the ArrayList)
        if (index >= 0 && index < fruits.size()) {
            // Retrieve the element at the specified index
            String element = fruits.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (fruits.size() - 1));
        }



        // Example with an invalid index:
        int invalidIndex = 10; // This index is out of bounds

        if (invalidIndex >= 0 && invalidIndex < fruits.size()) {
            String element = fruits.get(invalidIndex);
            System.out.println("Element at index " + invalidIndex + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (fruits.size() - 1));
        }


         //Example with integer ArrayList
         List<Integer> numbers = new ArrayList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);


         int numIndex = 1;


        if (numIndex >= 0 && numIndex < numbers.size()) {
             int number = numbers.get(numIndex); // Use appropriate type (int in this case)
            System.out.println("Element at index " + numIndex+ ": " + number);
        } else {
             System.out.println("Invalid index. Index should be between 0 and " + (numbers.size() - 1));
        }



    }
}
