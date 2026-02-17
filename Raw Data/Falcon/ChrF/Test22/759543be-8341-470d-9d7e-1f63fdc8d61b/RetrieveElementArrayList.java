import java.util.ArrayList;

public class RetrieveElementArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Specify the index of the element to retrieve
        int indexToRetrieve = 2; // We want to retrieve the element at index 2 (Orange)

        // Check if the index is valid (within the bounds of the ArrayList)
        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
            // Retrieve the element at the specified index using get()
            String retrievedElement = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (fruits.size() - 1));
        }


        // Example with an Integer ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        int numIndex = 1;

        if (numIndex >= 0 && numIndex < numbers.size()) {
            Integer retrievedNumber = numbers.get(numIndex);
            System.out.println("Number at index " + numIndex + ": " + retrievedNumber);
        } else {
            System.out.println("Invalid index for numbers ArrayList.");
        }

    }
}
