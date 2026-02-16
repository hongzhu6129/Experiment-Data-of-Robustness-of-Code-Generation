import java.util.LinkedList;
import java.util.List;

public class AddToEndList {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String elementToInsert = "Grape";

        // Insert the element at the end using add()
        linkedList.add(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


         // Example with integers
        List<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        int numberToInsert = 4;
        numberList.add(numberToInsert);

        System.out.println("Updated Number List: " + numberList);


        // Demonstrating edge case: inserting into an empty list
        List<Double> emptyList = new LinkedList<>();
        double doubleToInsert = 3.14;
        emptyList.add(doubleToInsert);

        System.out.println("Updated Empty List: " + emptyList);


    }
}
