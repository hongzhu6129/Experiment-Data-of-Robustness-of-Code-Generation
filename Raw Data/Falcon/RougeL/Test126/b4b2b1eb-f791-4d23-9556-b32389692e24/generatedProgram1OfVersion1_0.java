import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // 1. Retrieving an element using get() method

        int indexToRetrieve = 2; // We want to retrieve the element at index 2 (Orange)

        try {
            String retrievedFruit = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedFruit);


            //Demonstrating out of bounds handling
            int outOfBoundsIndex = 10; 
            String outOfBoundsFruit = fruits.get(outOfBoundsIndex); //This will throw IndexOutOfBoundsException

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds.  Index: " + indexToRetrieve + ", Size: "+ fruits.size());
            // Handle the exception appropriately (e.g., print an error message, return a default value, etc.)
        }




        //2. Iterating and accessing by index (less common, but useful in some scenarios)

         System.out.println("\nIterating and accessing by index:");

         for(int i = 0; i < fruits.size(); i++) {
             System.out.println("Element at index "+ i +": " + fruits.get(i));
         }


        // Important Note: ArrayList indices start from 0.  
        // So, the first element is at index 0, the second at index 1, and so on.

    }
}
