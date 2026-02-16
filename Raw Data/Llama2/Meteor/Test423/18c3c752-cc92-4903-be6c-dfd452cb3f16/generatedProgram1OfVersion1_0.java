import java.util.LinkedList;

public class AppendLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to append
        String elementToAppend = "Date";

        // Append the element to the end of the LinkedList
        linkedList.add(elementToAppend); 

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numToAppend = 4;
        numbers.add(numToAppend);

        System.out.println("Updated Integer LinkedList: " + numbers);


        // Example demonstrating adding to an empty LinkedList:
        LinkedList<Double> doubles = new LinkedList<>();
        double doubleToAppend = 3.14;
        doubles.add(doubleToAppend);
        System.out.println("Updated Double LinkedList (started empty): " + doubles);



    }
}
